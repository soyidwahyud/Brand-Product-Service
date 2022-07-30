package com.store.soyidwahyud.brandproductservice.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ProductCategory {
    @Id
    @Column
    private Long idProductCategory;

    @Column
    private String productCategory;

    @Column
    private String subProductCategory;

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
