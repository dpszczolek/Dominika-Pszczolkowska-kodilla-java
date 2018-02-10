package com.kodilla.good.patterns.foodDistributor;

public class Supplier {
    String supplierName;
    String productName;
    double productQuantity;

    public Supplier(String supplierName, String productName, double productQuantity) {
        this.supplierName = supplierName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

}
