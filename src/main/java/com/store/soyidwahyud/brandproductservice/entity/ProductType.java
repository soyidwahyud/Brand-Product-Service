package com.store.soyidwahyud.brandproductservice.entity;

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
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
