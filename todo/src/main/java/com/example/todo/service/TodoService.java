package com.example.todo.service;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> todoList = new ArrayList<>();
    private int idCounter = 1;

    public Todo createTodo(Todo todo) {
        todo.setId(idCounter++);
        todoList.add(todo);
        return todo;
    }

    public Todo getTodoById(int id) {
        return todoList.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Todo updateTodo(int id, Todo updatedTodo) {
        for (Todo t : todoList) {
            if (t.getId() == id) {
                t.setTitle(updatedTodo.getTitle());
                t.setDescription(updatedTodo.getDescription());
                t.setStatus(updatedTodo.isStatus());
                return t;
            }
        }
        return null;
    }

    public String deleteTodo(int id) {
        Todo todo = getTodoById(id);
        if (todo != null) {
            todoList.remove(todo);
            return "Deleted Successfully";
        }
        return "Todo Not Found";
    }
}