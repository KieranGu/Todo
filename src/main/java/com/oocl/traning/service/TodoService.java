package com.oocl.traning.service;

import com.oocl.traning.model.Todo;
import com.oocl.traning.repository.TodoDbRepository;

import java.util.List;

public class TodoService {
    private final TodoDbRepository todoDbRepository;

    public TodoService(TodoDbRepository todoDbRepository){
        this.todoDbRepository=todoDbRepository;
    }

    public Todo getTodoById(int id){
        return todoDbRepository.getTodoById(id);
    }

    public List<Todo> getAllTodos(){
        return todoDbRepository.getAllTodos();
    }

    public void saveTodo(Todo todo){
        todoDbRepository.saveTodo(todo);
    }
    public void deleteTodoById(int id){
        todoDbRepository.deleteTodoById(id);
    }
    public void updateTodoById(int id, Todo todo){
        todoDbRepository.updateTodoById(id,todo);
    }
}
