package com.store.soyidwahyud.brandproductservice.dto.request;

import lombok.*;

@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private Long idProduct;
    private String productCode;
    private String productDescription;
    private Long idProductCategory;
    private Long idProductType;
}
