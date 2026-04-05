package org.example.dto;

import java.math.BigDecimal;

public class ProductDTO {
    private String name;
    private BigDecimal price;
    private String currency;
    private Long producerId; // Przesyłamy tylko ID, żeby system wiedział kogo podpiąć
    private String attributes;

    // Standardowe Gettery i Settery
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public Long getProducerId() { return producerId; }
    public void setProducerId(Long producerId) { this.producerId = producerId; }

    public String getAttributes() { return attributes; }
    public void setAttributes(String attributes) { this.attributes = attributes; }
}