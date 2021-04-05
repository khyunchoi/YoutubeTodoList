package com.ggangcoder.todolist.controller;

import com.ggangcoder.todolist.model.TodoItem;
import com.ggangcoder.todolist.repo.TodoRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;
    //Read
    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }
    //Create
    @PostMapping
    public TodoItem save(@NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
    //Update
    @PutMapping
    public TodoItem update(@NotNull @RequestBody TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }
    //Delete
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
