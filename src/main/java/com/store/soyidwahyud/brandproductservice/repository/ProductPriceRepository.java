package com.store.soyidwahyud.brandproductservice.repository;

import com.store.soyidwahyud.brandproductservice.entity.ProductPrice;
import com.store.soyidwahyud.brandproductservice.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long> {
    @Query(value = "SELECT * " +
            "FROM tbl_product_price " +
            "WHERE active = 1", nativeQuery = true)
    List<ProductPrice> findAll();

    @Query(value = "SELECT * " +
            "FROM tbl_product_price " +
            "WHERE product_price_name = :productPriceName and active = 1", nativeQuery = true)
    List<ProductPrice> findAllByProductPrice(@Param("productPriceName") String productPriceName);

    @Query(value = "SELECT * " +
            "FROM tbl_product_price " +
            "WHERE id_product_price = :idProductPrice and active = 1", nativeQuery = true)
    List<ProductPrice> findAllByIdProductPrice(@Param("idProductPrice") Long idProductPrice);

    @Query(value = "SELECT * " +
            "FROM tbl_product_price " +
            "WHERE id_product_price = :idProductPrice", nativeQuery = true)
    List<ProductPrice> findByIdProductPrice(@Param("idProductPrice") Long idProductPrice);
}
