package com.store.soyidwahyud.brandproductservice.mapper;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductCategoryRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductCategoryResponse;
import com.store.soyidwahyud.brandproductservice.entity.ProductCategory;

public interface ProductCategoryMapper {
    ProductCategoryResponse responseProductCategoryResponse(ProductCategory productCategory);
    ProductCategory requestProductCategory(ProductCategoryRequest productCategoryRequest);
    void requestUpdateProductCategory(ProductCategoryRequest productCategoryRequest, ProductCategory productCategory);
}
