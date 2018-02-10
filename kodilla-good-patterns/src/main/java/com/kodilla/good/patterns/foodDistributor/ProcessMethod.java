package com.kodilla.good.patterns.foodDistributor;

public class ProcessMethod extends Process {

    public void processExtraFoodShop (Request request) {
        System.out.println(super.process() + "\n" + "We kindly remind we don't accept cash payments. Please make your payment before delivery date.");
    }

    public void processHealthyGluten (Request request) {
        System.out.println(super.process() + "\n" + "Your additional package price will be 10 PLN");
    }

    public void processGlutenFreeShop (Request request) {
        System.out.println(super.process() + "\n" + "Please deduct from your order price bonus of 15 PLN.");
    }
}
