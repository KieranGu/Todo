package com.oocl.traning.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TodoController {
//    post {URL}/api/v1/todos
    private final static Map<Integer,Todo> db = new HashMap<>();
    @PostMapping("/todos")
    @ResponseStatus(HttpStatus.CREATED)//返回创建成功的状态码
    public void saveTodo(@RequestBody Todo todo){
        todo.setId(db.size()+1);
        db.put(db.size()+1,todo);
    }

//    GET {URL}/api/v1/todos
    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return new ArrayList<>(db.values());
    }



}
