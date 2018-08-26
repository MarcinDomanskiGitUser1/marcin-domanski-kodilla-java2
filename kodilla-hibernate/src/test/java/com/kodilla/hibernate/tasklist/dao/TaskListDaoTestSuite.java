package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao tasklistDao;

    private static final String DESCRIPTION = "Testuję klasę TaskList";

    @Test
    public void testTaskListDaoFindByListName() {

        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "Pierwsza lista");
        tasklistDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readNames = tasklistDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readNames.size());

        //CleanUp
        int id = readNames.get(0).getId();
        tasklistDao.delete(id);
    }
}
