package com.kodilla.good.patterns.foodDistributor;

import java.time.LocalDate;

public class RequestExample {
    public static void main (String[] args) {

        Supplier supplier1 = new Supplier("ExtraFoodShop", "bio-apples", 200);
        LocalDate deliveryDate1 = LocalDate.of(2018, 02, 20);
        Request request = new Request(supplier1, deliveryDate1);

        ProcessMethod method = new ProcessMethod();
        method.processExtraFoodShop(request);

        request.requestSummary();
    }
}
