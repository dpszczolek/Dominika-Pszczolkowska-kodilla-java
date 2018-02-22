package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    List<String> ifIsExecuted = new ArrayList<>();

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        ifIsExecuted.add("done");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getColor () {
        return color;
    }

    public String getWhatToPaint () {
        return whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        return ifIsExecuted.contains("done");
    }
}
