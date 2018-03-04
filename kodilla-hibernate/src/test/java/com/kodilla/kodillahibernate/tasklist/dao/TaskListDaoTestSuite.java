package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.tasklist.TaskList;
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
    private TaskListDao taskListDao;
    private static final String LISTNAME = "To do";
    private static final String DESCRIPTION = "laundry";

    @Test
    public void testFindByListName() {

        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        List<TaskList> readListName = taskListDao.findByListName(listName);

        Assert.assertEquals("[To do]", readListName.toString());

        int id = readListName.get(0).getId();
        taskListDao.delete(id);

 //   taskListDao.deleteAll();

    }
}
