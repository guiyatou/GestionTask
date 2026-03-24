package com.rothiam.GestionTask.controller;

import com.rothiam.GestionTask.model.Task;
import com.rothiam.GestionTask.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping
    public List<Task> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Task create(@RequestBody Task t) {
        return service.create(t);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
