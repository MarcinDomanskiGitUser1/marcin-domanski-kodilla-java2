package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        TaskList toDo = (TaskList) context.getBean("toDoList");
        TaskList inProgress = (TaskList) context.getBean("inProgressList");
        TaskList done = (TaskList) context.getBean("doneList");

        //When
        toDo.addTask("Skończyć moduł 10 do końca tygodnia");
        inProgress.addTask("Dokończyć pakiet .portfolio w module spring");
        done.addTask("Dodać testy do pakietu .library");

        //Then
        System.out.println("List of tasksfactory To Do: \n" + toDo.getTasks().get(0));
        System.out.println("List of tasksfactory In Progress: \n" + inProgress.getTasks().get(0));
        System.out.println("List of tasksfactory Done: \n" + done.getTasks().get(0));

        }
    }
