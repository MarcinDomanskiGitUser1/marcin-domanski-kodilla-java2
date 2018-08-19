package com.kodilla.patterns.factory.tasksfactory;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("zakupy spożywcze", "bułki", 10);
            case PAINTING:
                return new PaintingTask("malowanie pokoi", "pokój córki", "różowe złoto");
            case DRIVING:
                return new DrivingTask("wyjazd w zimę", "alpy szwajcarskie", "samolotem");
            default:
                return null;
        }
    }
}
