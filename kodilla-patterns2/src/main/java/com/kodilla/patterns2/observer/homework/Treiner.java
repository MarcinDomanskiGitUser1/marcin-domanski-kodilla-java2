package com.kodilla.patterns2.observer.homework;

public class Treiner implements Observer {

    private final String name;
    private int updateCount;

    public Treiner(String name) {
        this.name = name;
    }

    @Override
    public void update(Trainee trainee) {
        System.out.println(name + ": You have new tasks from " + trainee.getName() + "\n" + " (total tasks from this trainee : " + trainee.getTasks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
