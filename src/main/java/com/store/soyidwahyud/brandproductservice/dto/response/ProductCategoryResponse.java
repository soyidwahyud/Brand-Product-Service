package com.store.soyidwahyud.brandproductservice.dto.response;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idProductCategory;
    private String productCategory;
    private String subProductCategory;
}
