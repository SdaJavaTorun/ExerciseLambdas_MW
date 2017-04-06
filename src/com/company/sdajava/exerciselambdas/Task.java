package com.company.sdajava.exerciselambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by RENT on 2017-04-06.
 */
public class Task {

    String id;
    String title;
    TaskType type;

    public Task(String id, String title, TaskType type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public Task(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }


    public static List<Task> getTasks() {
        List <Task> tasks = new ArrayList<>();

        Task task1 = new Task("2", "title1", TaskType.READING);
        Task task2 = new Task("3","title2", TaskType.READING);

        tasks.add(task1);
        tasks.add(task2);


        return tasks.stream().collect(Collectors.toList());
    }
}
