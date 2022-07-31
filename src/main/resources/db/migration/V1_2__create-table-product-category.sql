create table tbl_product_category
(
    id_product_category bigint not null ,
    product_category varchar(255) not null,
    sub_product_category         varchar(255) not null,
    created_at timestamp    default current_timestamp ,
    updated_at timestamp    default current_timestamp ,
    created_by varchar(255) default 'migration'       ,
    active boolean default true,

    constraint tbl_product_category_pk
        primary key (id_product_category)
)