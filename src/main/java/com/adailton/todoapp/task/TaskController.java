package com.adailton.todoapp.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    ITaskRepository taskRepository;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void creat(@RequestBody TaskModel taskModel) {
        System.out.println("Cheogu no controller");
        taskRepository.save(taskModel);
    }

}
