package com.oocl.traning.Controller;
import com.oocl.traning.model.Todo;
import com.oocl.traning.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TodoController {

    private TodoService todoService;
    public TodoController(TodoService todoService){
        this.todoService=todoService;
    }

    @PostMapping("/todos")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo saveTodo(@RequestBody Todo todo){
        return todoService.saveTodo(todo);
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todoService.getTodoById(id);
    }

    @PostMapping("/todos/{id}")
    public void updateTodo(@PathVariable int id,@RequestBody Todo todo){
        todoService.updateTodoById(id,todo);
    }
    @DeleteMapping("/todos/{id}")
    public void deleteTodoById(@PathVariable int id){
        todoService.deleteTodoById(id);
    }

    @GetMapping("/todos?page={page}&size={size}")
    public List<Todo> getTodosByPage(@PathVariable int page, @PathVariable int size){
        return todoService.getTodosByPage(page,size);
    }




}
