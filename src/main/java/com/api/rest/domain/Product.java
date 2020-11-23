package com.api.rest.domain;

public class Product {

    private int productId;
    private String productName;
    private int tecnologyId;
    private double price;
    private String complexity;
    private int stock;
    private boolean active;
    private Tecnology tecnology;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getTecnologyId() {
        return tecnologyId;
    }

    public void setTecnologyId(int tecnologyId) {
        this.tecnologyId = tecnologyId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Tecnology getTecnology() {
        return tecnology;
    }

    public void setTecnology(Tecnology tecnology) {
        this.tecnology = tecnology;
    }
}
