package com.store.soyidwahyud.brandproductservice.mapper;

import com.store.soyidwahyud.brandproductservice.dto.request.ProductPriceRequest;
import com.store.soyidwahyud.brandproductservice.dto.response.ProductPriceResponse;
import com.store.soyidwahyud.brandproductservice.entity.ProductPrice;

public interface ProductPriceMapper {
    ProductPriceResponse responseProductPriceResponse(ProductPrice productPrice);
    ProductPrice requestCreateProductPrice(ProductPriceRequest productPriceRequest);
    void requestUpdateProductPrice(ProductPriceRequest productPriceRequest, ProductPrice productPrice);
}
