package com.kodilla.patterns.factory.tasksfactory;

public class PaintingTask implements Task {

    final String taskName;
    final String whatToPaint;
    final String color;

    public PaintingTask(String taskName, String whatToPaint, String color) {
        this.taskName = taskName;
        this.whatToPaint = whatToPaint;
        this.color = color;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute Painting Task");
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
