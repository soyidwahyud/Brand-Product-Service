package com.store.soyidwahyud.brandproductservice.repository;

import com.store.soyidwahyud.brandproductservice.entity.Product;
import com.store.soyidwahyud.brandproductservice.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT p.id_product, p.product_code, p.product_description, pc.product_category, pc.sub_product_category, pt.product_type, pt.sub_product_type " +
            "FROM tbl_product as p " +
            "INNER JOIN tbl_product_category as pc " +
            "ON p.id_product_category = pc.id_product_category " +
            "INNER JOIN tbl_product_type as pt " +
            "ON p.id_product_type = pt.id_product_type " +
            "WHERE p.active = 1", nativeQuery = true)
    List<Product> findAll();

    @Query(value = "SELECT p.id_product, p.product_code, p.product_description, pc.product_category, pc.sub_product_category, pt.product_type, pt.sub_product_type " +
            "FROM tbl_product as p " +
            "INNER JOIN tbl_product_category as pc " +
            "ON p.id_product_category = pc.id_product_category " +
            "INNER JOIN tbl_product_type as pt " +
            "ON p.id_product_type = pt.id_product_type " +
            "WHERE pc.product_category = :productCategory and p.active = 1", nativeQuery = true)
    List<Product> findAllByProductCategory(@Param("productCategory") String productCategory);

    @Query(value = "SELECT p.id_product, p.product_code, p.product_description, pc.product_category, pc.sub_product_category, pt.product_type, pt.sub_product_type " +
            "FROM tbl_product as p " +
            "INNER JOIN tbl_product_category as pc " +
            "ON p.id_product_category = pc.id_product_category " +
            "INNER JOIN tbl_product_type as pt " +
            "ON p.id_product_type = pt.id_product_type " +
            "WHERE pt.product_type = :productType and p.active = 1", nativeQuery = true)
    List<Product> findAllByProductType(@Param("productType") String productType);
}
