package com.company.sdajava.exerciselambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.company.sdajava.exerciselambdas.Task.getTasks;

public class Main {

    public static void main(String[] args) {
	// write your code here



        List<Task> tasks =  getTasks();
        List<String> titles = taskTitles (tasks);

        titles.forEach(System.out::println);

        //  for (String title : titles){
      //      System.out.println(title);
        }





    public static List <String> taskTitles (List<Task> tasks){
        List<String> readingTitles = new ArrayList<>();
        for (Task task : tasks){
            if (task.getType() == TaskType.READING){
                readingTitles.add(task.getTitle());
            }
        }
        return readingTitles;
    }


}
