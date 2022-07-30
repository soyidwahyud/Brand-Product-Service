create table tbl_product
(
    id_product          bigint         not null,
    product_code        varchar(255) null,
    product_description varchar(255) null,
    id_product_category    bigint null,
    id_product_type        bigint  null,
    created_at timestamp    default current_timestamp not null,
    updated_at timestamp    default current_timestamp not null,
    created_by varchar(255) default 'migration'       not null,
    active boolean default true,

    constraint tbl_product_pk
        primary key (id_product)
);

