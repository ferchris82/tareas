package com.chrisferdev.tareas.service;

import java.util.List;

import com.chrisferdev.tareas.model.Tarea;

public interface ITareaServicio {
    public List<Tarea> listarTareas();

    public Tarea buscarTareaPorId(Integer idTarea);

    public void guardarTarea(Tarea tarea);

    public void eliminarTarea(Tarea tarea);
}
