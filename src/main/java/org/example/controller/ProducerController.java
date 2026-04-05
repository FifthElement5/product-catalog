package org.example.controller;

import org.example.model.Producer;
import org.example.service.ProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producers")
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public List<Producer> getAll() {
        return producerService.getAllProducers();
    }

     @PostMapping
    public Producer create(@RequestBody Producer producer) {
        return producerService.createProducer(producer);
    }

     @PutMapping("/{id}")
    public ResponseEntity<Producer> update(@PathVariable Long id, @RequestBody Producer producer) {

        Producer updated = producerService.updateProducer(id, producer);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        producerService.deleteProducer(id);
        return ResponseEntity.noContent().build();
    }
}