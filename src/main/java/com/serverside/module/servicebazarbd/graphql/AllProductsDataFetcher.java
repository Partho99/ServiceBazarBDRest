package com.serverside.module.servicebazarbd.graphql;

import com.serverside.module.servicebazarbd.entities.Products;
import com.serverside.module.servicebazarbd.services.ProductService;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllProductsDataFetcher implements DataFetcher<List<Products>> {

    private ProductService productService;

    public AllProductsDataFetcher(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public List<Products> get(DataFetchingEnvironment environment) {
        return productService.findAllProduct();
    }
}
