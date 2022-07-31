package com.store.soyidwahyud.brandproductservice.mapper.impl;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductTypeRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductTypeResponse;
import com.store.soyidwahyud.brandproductservice.entity.ProductType;
import com.store.soyidwahyud.brandproductservice.entity.ProductType.ProductTypeBuilder;
import com.store.soyidwahyud.brandproductservice.mapper.ProductTypeMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeMapperImpl implements ProductTypeMapper {
    @Override
    public ProductTypeResponse responseProductTypeResponse(ProductType productType) {
        ProductTypeResponse productTypeResponse = new ProductTypeResponse();
        productTypeResponse.setIdProductType(productType.getIdProductType());
        productTypeResponse.setProductType(productType.getProductType());
        productTypeResponse.setSubProductType(productType.getSubProductType());
        return productTypeResponse;
    }

    @Override
    public ProductType requestCreateProductType(ProductTypeRequest productTypeRequest) {
        if(productTypeRequest == null){
            return null;
        }
        ProductTypeBuilder productTypeBuilder = ProductType.builder();
        productTypeBuilder.idProductType(productTypeRequest.getIdProductType());
        productTypeBuilder.productType(productTypeRequest.getProductType());
        productTypeBuilder.subProductType(productTypeRequest.getSubProductType());
        return productTypeBuilder.build();
    }

    @Override
    public void requestUpdateProductType(ProductTypeRequest productTypeRequest, ProductType productType) {
        if(productTypeRequest == null){
            return;
        }
        if(productTypeRequest.getProductType() != null){
            productType.setProductType(productTypeRequest.getProductType());
        }
        if(productTypeRequest.getSubProductType() != null){
            productType.setSubProductType(productTypeRequest.getSubProductType());
        }
    }
}
