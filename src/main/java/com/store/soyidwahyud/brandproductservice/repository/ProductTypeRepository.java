package com.store.soyidwahyud.brandproductservice.repository;

import com.store.soyidwahyud.brandproductservice.entity.ProductCategory;
import com.store.soyidwahyud.brandproductservice.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
    @Query(value = "SELECT * " +
            "FROM tbl_product_type " +
            "WHERE active = 1", nativeQuery = true)
    List<ProductType> findAll();

    @Query(value = "SELECT * " +
            "FROM tbl_product_type " +
            "WHERE product_type = :productType " +
            "AND active = 1", nativeQuery = true)
    List<ProductType> findProductTypeByProductType(@Param("productType") String productType);

    @Query(value = "SELECT * " +
            "FROM tbl_product_type " +
            "WHERE id_product_type = :idProductType", nativeQuery = true)
    List<ProductType> findByIdProductType(@Param("idProductType") Long idProductType);
}
