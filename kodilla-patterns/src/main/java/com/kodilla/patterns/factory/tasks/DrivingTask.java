package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    List<String> ifIsExecuted = new ArrayList<>();

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        ifIsExecuted.add("done");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public boolean isTaskExecuted() {
        return ifIsExecuted.contains("done");
    }
}
