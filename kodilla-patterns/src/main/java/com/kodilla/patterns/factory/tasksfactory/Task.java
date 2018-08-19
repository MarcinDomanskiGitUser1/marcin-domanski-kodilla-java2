package com.kodilla.patterns.factory.tasksfactory;

public interface Task {

    String getTaskName();
    void executeTask();
    boolean isTaskExecuted();
}
