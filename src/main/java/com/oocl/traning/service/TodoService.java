package com.oocl.traning.service;

import com.oocl.traning.model.Todo;
import com.oocl.traning.repository.TodoDbRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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

    public Todo saveTodo(Todo todo){
        return todoDbRepository.saveTodo(todo);
    }
    public void deleteTodoById(int id){
        todoDbRepository.deleteTodoById(id);
    }
    public void updateTodoById(int id, Todo todo){
        todoDbRepository.updateTodoById(id,todo);
    }

    public List<Todo> getTodosByPage(int page, int size) {
        List<Todo> allTodos = todoDbRepository.getAllTodos();
        int fromIndex = (page - 1) * size;
        int toIndex = Math.min(fromIndex + size, allTodos.size());
        if (fromIndex >= allTodos.size() || fromIndex < 0) {
            return List.of(); // Return an empty list if the page is out of bounds
        }
        return allTodos.subList(fromIndex, toIndex);
    }
}
