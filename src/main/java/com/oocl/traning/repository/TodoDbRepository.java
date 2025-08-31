package com.oocl.traning.repository;

import com.oocl.traning.Controller.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoDbRepository {
    private final JPATodoRepository jpaTodoRepository;
    public TodoDbRepository(JPATodoRepository jpaTodoRepository){
        this.jpaTodoRepository=jpaTodoRepository;
    }

    public void saveTodo(Todo todo){
        jpaTodoRepository.save(todo);
    }

    public List<Todo> getAllTodos(){
        return jpaTodoRepository.findAll();
    }

    public Todo getTodoById(int id){
        return jpaTodoRepository.findById(id).orElse(null);
    }

    public void deleteTodoById(int id){
        jpaTodoRepository.deleteById(id);
    }

    public void updateTodoById(int id, Todo todo){
        Todo existingTodo = jpaTodoRepository.findById(id).orElse(null);
        if (existingTodo != null) {
            existingTodo.setTitle(todo.getTitle());
            existingTodo.setStatus(todo.getStatus());
            jpaTodoRepository.save(existingTodo);
        }
    }


}
