create schema oleg;
create table if not exists CUSTOMERS
(
    id           int auto_increment primary key,
    name         varchar(255),
    surname      varchar(255),
    age          int,
    phone_number varchar(255)
);

create table if not exists ORDERS
(
    id           int auto_increment primary key,
    date         varchar(255),
    customer_id  int,
    product_name varchar(255),
    amount       int,
    foreign key (customer_id) references customers (id)
);