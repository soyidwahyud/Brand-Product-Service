create table tbl_product_type
(
    id_product_type bigint         not null,
    product_type    varchar(255) not null,
    sub_product_type varchar(255) not null ,
    created_at timestamp    default current_timestamp not null,
    updated_at timestamp    default current_timestamp not null,
    created_by varchar(255) default 'migration'       not null,
    active boolean default true,

    constraint tbl_product_type_pk
        primary key (id_product_type)
)