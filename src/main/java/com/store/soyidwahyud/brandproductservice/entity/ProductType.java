package com.store.soyidwahyud.brandproductservice.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tbl_product_type")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ProductType {
    @Id
    @Column
    private Long idProductType;

    @Column
    private String productType;

    @Column
    private String subProductType;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    @Column
    private String createdBy;

    @Column(columnDefinition = "boolean default TRUE")
    @Builder.Default
    private boolean active = true;
}
