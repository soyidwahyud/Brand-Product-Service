create table tbl_dummy
(
    id         int                                   not null,
    dummy_name varchar(255)                           not null,
    created_at timestamp    default current_timestamp not null,
    updated_at timestamp    default current_timestamp not null,
    created_by varchar(255) default 'migration'       not null,
    active boolean default true,

    constraint tbl_dummy_pk
        primary key (id)
);