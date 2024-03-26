package com.chrisferdev.tareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chrisferdev.tareas.view.SistemasTareasFx;

import javafx.application.Application;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TareasApplication.class, args);
		Application.launch(SistemasTareasFx.class, args);
	}

}

