package org.example.service;

import org.example.dto.ProductDTO;
import org.example.model.Producer;
import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.example.repository.ProducerRepository; // Dodany import
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProducerRepository producerRepository;

    public ProductService(ProductRepository productRepository, ProducerRepository producerRepository) {
        this.productRepository = productRepository;
        this.producerRepository = producerRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(ProductDTO dto) {

        Producer producer = producerRepository.findById(dto.getProducerId())
                .orElseThrow(() -> new RuntimeException("No ID: " + dto.getProducerId()));

        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setCurrency(dto.getCurrency());
        product.setAttributes(dto.getAttributes());

        product.setProducer(producer);

        return productRepository.save(product);
    }

    public Product updateProduct(Long id, ProductDTO dto) {

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("no ID: " + id));


        Producer producer = producerRepository.findById(dto.getProducerId())
                .orElseThrow(() -> new RuntimeException("No ID: " + dto.getProducerId()));


        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setCurrency(dto.getCurrency());
        product.setAttributes(dto.getAttributes());
        product.setProducer(producer);

        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("No ID: " + id);
        }

        productRepository.deleteById(id);
    }

    public List<Product> getProductsByProducerId(Long id) {
        return productRepository.findByProducerId(id);
    }

    public List<Product> getProductsByProducerName(String name) {
        return productRepository.findByProducerNameContainingIgnoreCase(name);
    }
}