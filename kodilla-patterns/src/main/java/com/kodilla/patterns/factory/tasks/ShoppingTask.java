package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    List<String> ifIsExecuted = new ArrayList<>();

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        ifIsExecuted.add("done");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean isTaskExecuted() {
        return ifIsExecuted.contains("done");
    }
}
