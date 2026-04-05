package org.example.controller;

import org.example.dto.ProductDTO;
import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product create(@RequestBody ProductDTO productDTO) {

        return productService.createProduct(productDTO);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody ProductDTO productDTO) {
        return productService.updateProduct(id, productDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/producer/{id}")
    public List<Product> getByProducerId(@PathVariable Long id) {
        return productService.getProductsByProducerId(id);
    }

    @GetMapping("/search-producer")
    public List<Product> getByProducerName(@RequestParam String name) {
        return productService.getProductsByProducerName(name);
    }
}