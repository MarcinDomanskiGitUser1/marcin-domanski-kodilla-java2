package com.kodilla.patterns.factory.tasksfactory;

public class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final int quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final int quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute Shopping Task");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
