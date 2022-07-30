package com.store.soyidwahyud.brandproductservice.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column
    private String productCode;

    @Column
    private String productDescription;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductCategory productCategory;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductType productType;

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
