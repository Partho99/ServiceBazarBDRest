package com.serverside.module.servicebazarbd.services;

import com.serverside.module.servicebazarbd.graphql.AllProductsDataFetcher;
import com.serverside.module.servicebazarbd.graphql.ProductDataFetcher;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@Service
public class ProductGraphqlService {

    @Value("classpath:products.graphql")
    Resource resource;

    private GraphQL graphQL;
    private AllProductsDataFetcher allProductsDataFetcher;
    private ProductDataFetcher productDataFetcher;

    public ProductGraphqlService(AllProductsDataFetcher allProductsDataFetcher, ProductDataFetcher productDataFetcher) {
        this.allProductsDataFetcher = allProductsDataFetcher;
        this.productDataFetcher = productDataFetcher;
    }

    @PostConstruct
    public void loadSchema() throws IOException {
        File schemaFile = resource.getFile();
        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schemaFile);
        RuntimeWiring runtimeWiring = buildRuntimeWiring();
        GraphQLSchema qlSchema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
        graphQL = GraphQL.newGraphQL(qlSchema).build();
    }

    private RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .type("Query", typeWiring ->
                        typeWiring.dataFetcher("allProducts", allProductsDataFetcher)
                                .dataFetcher("product", productDataFetcher))
                .build();
    }

    public GraphQL getGraphQL() {
        return graphQL;
    }

}
