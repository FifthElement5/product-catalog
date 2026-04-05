# product-catalog

Simple REST API for product and producer management.

## Tech Stack
- **Java 21**
- Spring Boot 3.x
- H2 Database (In-memory)
- Liquibase

## Endpoints

### Producers
- `GET /api/producers` - List all producers
- `POST /api/producers` - Create a new producer
- `PUT /api/producers/{id}` - Update producer details
- `DELETE /api/producers/{id}` - Remove a producer

### Products
- `GET /api/products` - List all products
- `POST /api/products` - Create product
- `PUT /api/products/{id}` - Update product details
- `DELETE /api/products/{id}` - Remove a product
- `GET /api/products/producer/{id}` - Filter by ID
- `GET /api/products/search-producer?name=Asus` - Search by Name

## Request Example (JSON)
```json
{
  "name": "XPS 13",
  "price": 6000.0,
  "currency": "PLN",
  "attributes": "{\"weight\": \"1.1kg\", \"touch\": \"yes\"}",
  "producer": { "id": 4 }
}