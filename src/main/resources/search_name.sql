select c.id as CustomerID, o.id as OrderID, date, name, surname, age, phone_number, product_name, amount
from oleg.orders o
    right join customers c
on c.id = o.customer_id
where lower (c.name) = lower(:name);