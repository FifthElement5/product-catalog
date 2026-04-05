# product-catalog

This is a simple API to manage products and producers.

## Tech Stack
- Java 21
- Spring Boot 3
- Liquibase (Database migration)
- H2 (In-memory database)

Clone the project:
git clone https://github.com/FifthElement5/product-catalog.git

    Start the app:
    mvn spring-boot:run
    The app starts at: http://localhost:8080

    Open Database Console:
    Go to: http://localhost:8080/h2-console

    Use these settings:

        JDBC URL: jdbc:h2:mem:product_db

        User: sa

        Password: (leave empty)

API Endpoints
Products

    GET /api/products - Show all products.

    POST /api/products - Add a new product.

    PUT /api/products/{id} - Update a product.

    DELETE /api/products/{id} - Delete a product.

    GET /api/products/producer/{id} - Find products by Producer ID.

    GET /api/products/search-producer?name=... - Find products by Producer Name.

Producers

    GET /api/producers - Show all producers.

    POST /api/producers - Add a new producer.

Database

Tables are created automatically by Liquibase when the app starts.