package com.serverside.module.servicebazarbd.controllers;

import com.serverside.module.servicebazarbd.converters.CategoriesConverter;
import com.serverside.module.servicebazarbd.converters.ProductsConverter;
import com.serverside.module.servicebazarbd.dtos.CategoriesWithTypeDto;
import com.serverside.module.servicebazarbd.dtos.ProductDto;
import com.serverside.module.servicebazarbd.entities.Categories;
import com.serverside.module.servicebazarbd.entities.Products;
import com.serverside.module.servicebazarbd.repositories.CategoriesRepository;
import com.serverside.module.servicebazarbd.repositories.ProductRepository;
import com.serverside.module.servicebazarbd.services.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
public class HomeController {
    private final ProductRepository productRepository;
    private final CategoriesRepository categoriesRepository;
    private final ProductService productService;
    private final ProductsConverter productsConverter;
    private final CategoriesConverter categoriesConverter;

    public HomeController(ProductRepository productRepository,
                          CategoriesRepository categoriesRepository,
                          ProductService productService,
                          ProductsConverter productsConverter,
                          CategoriesConverter categoriesConverter) {
        this.productRepository = productRepository;
        this.categoriesRepository = categoriesRepository;
        this.productService = productService;
        this.productsConverter = productsConverter;
        this.categoriesConverter = categoriesConverter;
    }

    @GetMapping("/product/{slug}")
    public List<ProductDto> showProductByItsSlug(@PathVariable String slug) {
        List<Products> products = productRepository.findBySlug(slug);
        List<ProductDto> productDto = productsConverter.entityToDto(products);
        return productDto.stream().peek(x -> x.setType(slug)).collect(Collectors.toList());

    }

    @GetMapping("/products/{type}")
    public List<ProductDto> getProductsByItsCategoryType(@PathVariable String type) {
        long startTime = System.nanoTime();
        List<Products> products = productRepository.findByProductType(type);
        List<ProductDto> productDto = productsConverter.entityToDto(products);
        productDto.stream().map(x -> {
            x.setType(type);
            return x;
        }).collect(Collectors.toList());
        //List<Categories> categories = categoriesRepository.findByType(slug);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration/1000000 + " ms");
        return productDto;
    }

    @GetMapping("/categories/{slug}")
    public List<CategoriesWithTypeDto> getCategories(@PathVariable String slug) {
        List<Categories> categoriesList = categoriesRepository.findByType(slug);
        List<CategoriesWithTypeDto> categoriesWithTypeDtoList = categoriesConverter.entityToDto(categoriesList);
        categoriesWithTypeDtoList.stream().map(x -> {
            x.setType(slug);
            return x;
        }).collect(Collectors.toList());
        return categoriesWithTypeDtoList;
    }
}
