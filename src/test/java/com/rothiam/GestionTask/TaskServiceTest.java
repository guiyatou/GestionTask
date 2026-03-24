package com.rothiam.GestionTask;

import com.rothiam.GestionTask.model.Task;
import com.rothiam.GestionTask.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;  // ← ajouter cet import

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TaskServiceTest {

    @Autowired
    private TaskService service;

    @Test
    void shouldCreateTask() {
        Task t = new Task();
        t.setTitle("Ma première tâche");

        Task saved = service.create(t);

        assertNotNull(saved.getId());
        assertEquals("Ma première tâche", saved.getTitle());
    }
}
