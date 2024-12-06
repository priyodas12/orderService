-- File: src/main/resources/db/migration/V1__create_orders_table.sql

CREATE SEQUENCE orders_seq;

CREATE TABLE orders(
                        order_id BIGINT DEFAULT nextval('orders_seq') PRIMARY KEY,
                        order_barcode UUID NOT NULL,
                        order_status VARCHAR(255),
                        order_price DECIMAL(19, 2)
);

CREATE INDEX idx_order_barcode ON orders(order_barcode);
