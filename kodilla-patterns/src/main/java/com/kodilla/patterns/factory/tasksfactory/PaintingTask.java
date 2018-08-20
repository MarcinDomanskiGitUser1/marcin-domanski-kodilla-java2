package com.kodilla.patterns.factory.tasksfactory;

public class PaintingTask implements Task {

    final private String taskName;
    final private String whatToPaint;
    final private String color;
    private boolean executed;

    public PaintingTask(String taskName, String whatToPaint, String color) {
        this.taskName = taskName;
        this.whatToPaint = whatToPaint;
        this.color = color;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute Painting Task");
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
