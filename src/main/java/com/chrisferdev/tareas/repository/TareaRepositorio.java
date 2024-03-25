package com.chrisferdev.tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chrisferdev.tareas.model.Tarea;

public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {
}

    
