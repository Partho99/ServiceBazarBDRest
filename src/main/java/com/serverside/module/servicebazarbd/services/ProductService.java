package com.serverside.module.servicebazarbd.services;

import com.serverside.module.servicebazarbd.entities.Categories;
import com.serverside.module.servicebazarbd.entities.Products;
import com.serverside.module.servicebazarbd.repositories.CategoriesRepository;
import com.serverside.module.servicebazarbd.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoriesRepository categoriesRepository;

    public ProductService(ProductRepository productRepository, CategoriesRepository categoriesRepository) {
        this.productRepository = productRepository;
        this.categoriesRepository = categoriesRepository;
    }

    public List<Categories> findAll(){
        List<Categories> categoriesList =  categoriesRepository.findAll();
        return categoriesList;
    }

    public List<Products> findAllProduct(){
        List<Products> products = productRepository.findAll();
        return products;
    }

    public Optional<Products> findProductById(Long id){
        Optional<Products> products = productRepository.findById(id);
        return products;
    }

}
