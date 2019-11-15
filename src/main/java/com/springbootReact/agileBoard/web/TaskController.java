package com.springbootReact.agileBoard.web;

import com.springbootReact.agileBoard.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks/board")
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskService taskService;


}
