package com.kodilla.good.patterns.foodDistributor;

import java.time.LocalDate;

public class Request {
    public Supplier supplier;
    public LocalDate deliveryDate;

    public Request(Supplier supplier, LocalDate deliveryDate) {
        this.supplier = supplier;
        this.deliveryDate = deliveryDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void requestSummary() {
        System.out.println("You ordered is: " + supplier.productName + " (" + supplier.productQuantity + " items.)");
        System.out.println("Your delivery date is: " + deliveryDate);
    }
}


