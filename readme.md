# Micronaut CRUD API with PostgreSQL

This is a simple CRUD (Create, Read, Update, Delete) API implemented using **Micronaut** framework, **Hibernate JPA** for ORM, and **PostgreSQL** as the database. The application provides basic operations to manage `Product` entities in a PostgreSQL database.

## Features

- **CRUD Operations**: 
- **Hibernate JPA**
- **Flyway**
- **PostgreSQL**

```
docker run --name reactiveOrderDb -e POSTGRES_USER=<***> -e POSTGRES_PASSWORD=<***> -e POSTGRES_DB=orderDb -e POSTGRES_MAX_CONNECTIONS=10 -p 5450:5432 -d postgres:latest

GET: http://localhost:12360/api/v1/orders/2

RESPONSE:

{
  "orderId": 2,
  "orderBarcode": "6e07c9b2-8f7d-4e65-b7e1-d3456798929d",
  "orderStatus": "Pending",
  "orderPrice": 99.99
}

GET: http://localhost:12360/api/v1/orders

RESPONSE:

[
  {
    "orderId": 2,
    "orderBarcode": "6e07c9b2-8f7d-4e65-b7e1-d3456798929d",
    "orderStatus": "Pending",
    "orderPrice": 99.99
  },
  {
    "orderId": 3,
    "orderBarcode": "6e07c9b2-8f7d-4e65-b7e1-d3456798929d",
    "orderStatus": "processed",
    "orderPrice": 159.99
  }
]

POST: 

REQUEST BODY:
{
  "orderBarcode": "7e07c9b2-8f7d-4e65-b7e1-d3456798929d",
  "orderStatus": "created",
  "orderPrice": 169.99
}

RESPONSE:
{
  "orderId": 4,
  "orderBarcode": "7e07c9b2-8f7d-4e65-b7e1-d3456798929d",
  "orderStatus": "created",
  "orderPrice": 169.99
}

PUT:http://localhost:12360/api/v1/orders

REQUEST:

{
  "orderId": 4,
  "orderBarcode": "7e07c9b2-8f7d-4e65-b7e1-d3456798929d",
  "orderStatus": "processed",
  "orderPrice": 3169.99
}

RESPONSE:

{
  "orderId": 4,
  "orderBarcode": "7e07c9b2-8f7d-4e65-b7e1-d3456798929d",
  "orderStatus": "processed",
  "orderPrice": 3169.99
}

DELETE:  http://localhost:12360/api/v1/orders/4

RESPONSE: 4

```