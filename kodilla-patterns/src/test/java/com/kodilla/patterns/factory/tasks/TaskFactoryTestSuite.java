package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        TaskFactory factory = new TaskFactory();
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);

        Assert.assertEquals("shopping", shoppingTask.getTaskName());
        shoppingTask.executeTask();
        System.out.println(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("driving", drivingTask.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("painting", paintingTask.getTaskName());
    }
}
