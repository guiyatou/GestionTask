package com.rothiam.GestionTask.repository;

import com.rothiam.GestionTask.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository
        extends JpaRepository<Task, Long> {

}