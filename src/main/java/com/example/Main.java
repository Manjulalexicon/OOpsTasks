package com.example;

import com.example.oop.bank.BankAccount;
import com.example.oop.customer.Customer;
import com.example.oop.student.Student;
import com.example.oop.product.Product;
import com.example.oop.order.Order;

public class Main {
    public static void main(String[] args) {

        // =========================
        // Exercise 1: BankAccount
        // =========================
        System.out.println("=== BankAccount ===");

        BankAccount acc1 = new BankAccount("Alice", 1000);
        BankAccount acc2 = new BankAccount("Bob", 500);

        acc1.deposit(200);
        acc2.withdraw(100);

        System.out.println(acc1.getAccountHolder() + " Balance: " + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + " Balance: " + acc2.getBalance());


        // =========================
        // Exercise 2: Customer
        // =========================
        System.out.println("\n=== Customer ===");

        Customer c1 = new Customer(1, "John Doe", "john@example.com");
        Customer c2 = new Customer(2, "Jane Smith", "jane@example.com");

        c2.setEmail("jane_new@example.com");

        System.out.println(c1.getName() + " - " + c1.getEmail());
        System.out.println(c2.getName() + " - " + c2.getEmail());


        // =========================
        // Exercise 3: Student
        // =========================
        System.out.println("\n=== Student ===");

        Student s1 = new Student(101, "Mike", 20, "Computer Science");
        Student s2 = new Student(102, "Anna", 22, "Engineering");

        s1.setAge(21);

        System.out.println(s1.getName() + " Age: " + s1.getAge());
        System.out.println(s2.getName() + " Major: " + s2.getMajor());


        // =========================
        // Exercise 4: Product
        // =========================
        System.out.println("\n=== Product ===");

        Product p1 = new Product(1, "Laptop", 1200);
        Product p2 = new Product(2, "Mouse", 50);

        p2.setPrice(45);

        System.out.println(p1.getName() + " Price: " + p1.getPrice());
        System.out.println(p2.getName() + " Price: " + p2.getPrice());


        // =========================
        // Exercise 5: Order
        // =========================
        System.out.println("\n=== Order ===");

        Order order1 = new Order(1001);
        Order order2 = new Order(1002);

        order1.addProduct(p1);
        order1.addProduct(p2);

        order2.addProduct(new Product(3, "Keyboard", 80));

        System.out.println("Order1 Total: " + order1.calculateTotal());
        System.out.println("Order2 Total: " + order2.calculateTotal());
    }
}