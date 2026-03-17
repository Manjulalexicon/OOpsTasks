package com.example.oop.order;

import com.example.oop.product.Product;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products); // defensive copy
    }

    public void addProduct(Product p) {
        if (p != null) {
            products.add(p);
        }
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public double calculateTotal() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}