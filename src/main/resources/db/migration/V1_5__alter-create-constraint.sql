alter table tbl_product
    add constraint tbl_product_tbl_product_category_id_product_category_fk
        foreign key (id_product_category) references tbl_product_category (id_product_category);

alter table tbl_product
    add constraint tbl_product_tbl_product_type__fk
        foreign key (id_product_type) references tbl_product_type (id_product_type);



