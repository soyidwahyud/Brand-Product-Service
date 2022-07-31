package com.store.soyidwahyud.brandproductservice.mapper;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductTypeRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductTypeResponse;
import com.store.soyidwahyud.brandproductservice.entity.ProductType;

public interface ProductTypeMapper {
    ProductTypeResponse responseProductTypeResponse(ProductType productType);
    ProductType requestCreateProductType(ProductTypeRequest productTypeRequest);
    void requestUpdateProductType(ProductTypeRequest productTypeRequest, ProductType productType);
}
