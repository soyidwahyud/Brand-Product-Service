package com.store.soyidwahyud.brandproductservice.mapper.impl;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductCategoryRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductCategoryResponse;
import com.store.soyidwahyud.brandproductservice.entity.ProductCategory;
import com.store.soyidwahyud.brandproductservice.entity.ProductCategory.ProductCategoryBuilder;
import com.store.soyidwahyud.brandproductservice.mapper.ProductCategoryMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductCategoryMapperImpl implements ProductCategoryMapper {

    @Override
    public ProductCategoryResponse responseProductCategoryResponse(ProductCategory productCategory) {
        ProductCategoryResponse response = new ProductCategoryResponse();
        response.setIdProductCategory(productCategory.getIdProductCategory());
        response.setProductCategory(productCategory.getProductCategory());
        response.setSubProductCategory(productCategory.getSubProductCategory());
        return response;
    }

    @Override
    public ProductCategory requestProductCategory(ProductCategoryRequest productCategoryRequest) {
        if (productCategoryRequest == null){
            return null;
        }
        ProductCategoryBuilder productCategoryBuilder = ProductCategory.builder();
        productCategoryBuilder.idProductCategory(productCategoryRequest.getIdProductCategory());
        productCategoryBuilder.productCategory(productCategoryRequest.getProductCategory());
        productCategoryBuilder.subProductCategory(productCategoryRequest.getSubProductCategory());

        return productCategoryBuilder.build();
    }

    @Override
    public void requestUpdateProductCategory(ProductCategoryRequest productCategoryRequest, ProductCategory productCategory) {
        if(productCategoryRequest == null){
            return;
        }
        if(productCategoryRequest.getProductCategory() != null){
            productCategory.setProductCategory(productCategoryRequest.getProductCategory());
        }
        if(productCategoryRequest.getSubProductCategory() != null){
            productCategory.setSubProductCategory(productCategoryRequest.getSubProductCategory());
        }
    }
}
