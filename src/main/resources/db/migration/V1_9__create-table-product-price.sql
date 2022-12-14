create table tbl_product_price
(
    id_product_price bigint       not null,
    product_price_name varchar(255) null,
    price              numeric      null,
    created_at timestamp    default current_timestamp ,
    updated_at timestamp    default current_timestamp ,
    created_by varchar(255) default 'migration'       ,
    active boolean default true,

    constraint tbl_product_price_pk
        primary key (id_product_price)
);

