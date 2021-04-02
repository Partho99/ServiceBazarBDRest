package com.serverside.module.servicebazarbd.graphql;

import com.serverside.module.servicebazarbd.entities.Products;
import com.serverside.module.servicebazarbd.services.ProductService;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductDataFetcher implements DataFetcher<Optional<Products>> {

    private ProductService productService;

    @Autowired
    public ProductDataFetcher(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Optional<Products> get(DataFetchingEnvironment environment) {
        Long id = environment.getArgument("id");
        return productService.findProductById(id);
    }
}
