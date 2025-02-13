package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping("/gettask")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/addtask")
    public void inputTask(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestParam boolean completed) {
        return taskService.updateTaskStatus(id, completed);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
