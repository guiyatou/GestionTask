package com.rothiam.GestionTask.service;

import com.rothiam.GestionTask.model.Task;
import com.rothiam.GestionTask.repository.TaskRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
        private TaskRepository repo;

    public TaskService (TaskRepository repo) {
        this.repo = repo;
    }
    public List<Task> getAll() { return repo.findAll(); }
    public Task create(Task t) { return repo.save(t); }
    public void delete(Long id) { repo.deleteById(id); }
}
