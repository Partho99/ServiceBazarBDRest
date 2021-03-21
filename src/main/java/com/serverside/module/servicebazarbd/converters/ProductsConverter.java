package com.serverside.module.servicebazarbd.converters;

import com.serverside.module.servicebazarbd.dtos.ProductDto;
import com.serverside.module.servicebazarbd.entities.Products;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ProductsConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public ProductsConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ProductDto entityToDto(Products products) {
        ProductDto productDto = modelMapper.map(products, ProductDto.class);
        return productDto;
    }

    public List<ProductDto> entityToDto(List<Products> products) {
        return products.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }

    public Products dtoToEntity(ProductDto productDto) {
        Products products = modelMapper.map(productDto, Products.class);
        return products;
    }

    public List<Products> dtoToEntity(List<ProductDto> productDto) {
        return productDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }
}
