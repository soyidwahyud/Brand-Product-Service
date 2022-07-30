package com.store.soyidwahyud.brandproductservice.dto.response;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductTypeResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idProductType;
    private String productType;
    private String subProductType;
}
