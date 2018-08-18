package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Skończyć moduł 10 do końca tygodnia");
        board.getInProgressList().addTask("Dokończyć pakiet .portfolio w module spring");
        board.getDoneList().addTask("Dodać testy do pakietu .library");

        //Then
        System.out.println("List of tasks To Do: \n" + board.getToDoList().getTasks().get(0));
        System.out.println("List of tasks In Progress: \n" + board.getInProgressList().getTasks().get(0));
        System.out.println("List of tasks Done: \n" + board.getDoneList().getTasks().get(0));

        }
    }
