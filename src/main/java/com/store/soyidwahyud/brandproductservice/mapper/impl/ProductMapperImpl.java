package com.store.soyidwahyud.brandproductservice.mapper.impl;

import com.store.soyidwahyud.brandproductservice.dto.response.ProductResponse;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductResponse.ProductResponseBuilder;
import com.store.soyidwahyud.brandproductservice.entity.Product;
import com.store.soyidwahyud.brandproductservice.mapper.ProductMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {
    @Override
    public ProductResponse responseProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponseBuilder productResponse = ProductResponse.builder();

        productResponse.idProduct( product.getIdProduct() );
        productResponse.productCode( product.getProductCode() );
        productResponse.productDescription( product.getProductDescription() );

        return productResponse.build();

    }
}
