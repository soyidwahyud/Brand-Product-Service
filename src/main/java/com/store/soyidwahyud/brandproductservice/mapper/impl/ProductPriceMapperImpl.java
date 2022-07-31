package com.store.soyidwahyud.brandproductservice.mapper.impl;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductPriceRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductPriceResponse;
import com.store.soyidwahyud.brandproductservice.entity.ProductPrice;
import com.store.soyidwahyud.brandproductservice.entity.ProductPrice.ProductPriceBuilder;
import com.store.soyidwahyud.brandproductservice.mapper.ProductPriceMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductPriceMapperImpl implements ProductPriceMapper {

    @Override
    public ProductPriceResponse responseProductPriceResponse(ProductPrice productPrice) {
        ProductPriceResponse response = new ProductPriceResponse();
        response.setIdProductPrice(productPrice.getIdProductPrice());
        response.setProductPriceName(productPrice.getProductPriceName());
        response.setPrice(productPrice.getPrice());
        return response;
    }

    @Override
    public ProductPrice requestCreateProductPrice(ProductPriceRequest productPriceRequest) {
        if (productPriceRequest == null){
            return null;
        }
        ProductPriceBuilder productPriceBuilder = ProductPrice.builder();
        productPriceBuilder.idProductPrice(productPriceRequest.getIdProductPrice());
        productPriceBuilder.productPriceName(productPriceRequest.getProductPriceName());
        productPriceBuilder.price(productPriceRequest.getPrice());
        return productPriceBuilder.build();
    }

    @Override
    public void requestUpdateProductPrice(ProductPriceRequest productPriceRequest, ProductPrice productPrice) {
        if(productPriceRequest == null){
            return;
        }
        if(productPriceRequest.getProductPriceName() != null){
            productPrice.setProductPriceName(productPriceRequest.getProductPriceName());
        }
        if(productPriceRequest.getPrice() != null){
            productPrice.setPrice(productPriceRequest.getPrice());
        }
    }
}
