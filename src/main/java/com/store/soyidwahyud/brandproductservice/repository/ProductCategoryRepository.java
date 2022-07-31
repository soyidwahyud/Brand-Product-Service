package com.store.soyidwahyud.brandproductservice.repository;

import com.store.soyidwahyud.brandproductservice.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    @Query(value = "SELECT * " +
            "FROM tbl_product_category " +
            "WHERE active = 1", nativeQuery = true)
    List<ProductCategory> findAll();

    @Query(value = "SELECT * " +
            "FROM tbl_product_category " +
            "WHERE product_category = :productCategory " +
            "AND active = 1", nativeQuery = true)
    List<ProductCategory> findProductCategoriesByProductCategory(@Param("productCategory") String productCategory);

    @Query(value = "SELECT * " +
            "FROM tbl_product_category " +
            "WHERE id_product_category = :idProductCategory", nativeQuery = true)
    Optional<ProductCategory> findProductCategoryByIdProductCategory(@Param("idProductCategory") Long idProductCategory);

    @Query(value = "SELECT * " +
            "FROM tbl_product_category " +
            "WHERE id_product_category = :idProductCategory", nativeQuery = true)
    List<ProductCategory> findByIdProductCategory(@Param("idProductCategory") Long idProductCategory);
}
