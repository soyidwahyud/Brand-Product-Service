package com.store.soyidwahyud.brandproductservice.dto.request;

import lombok.*;

@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductTypeRequest {
    private Long idProductType;
    private String productType;
    private String subProductType;
}
