package org.example.service;

import org.example.model.Producer;
import org.example.repository.ProducerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerService {

    private final ProducerRepository producerRepository;

    public ProducerService(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }

    public List<Producer> getAllProducers() {
        return producerRepository.findAll();
    }

    public Producer createProducer(Producer producer) {
        return producerRepository.save(producer);
    }

    public Producer updateProducer(Long id, Producer producerDetails) {
        Producer producer = producerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No ID: " + id));

        producer.setName(producerDetails.getName());

        return producerRepository.save(producer);
    }

    public void deleteProducer(Long id) {
        if (!producerRepository.existsById(id)) {
            throw new RuntimeException("No ID: " + id);
        }
        producerRepository.deleteById(id);
    }
}