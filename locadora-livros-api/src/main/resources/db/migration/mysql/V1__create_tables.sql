

create table users (
    id bigint not null,
    email varchar(255) not null, name varchar(255) not null,
    created_at timestamp,
    updated_at timestamp,
    primary key (id)
);
