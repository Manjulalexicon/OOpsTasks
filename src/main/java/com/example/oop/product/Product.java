package com.example.oop.product;

public class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
    }

    // Getters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Setters
    public void setName(String name) { this.name = name; }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}