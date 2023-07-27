package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @GetMapping
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }
    @RequestMapping(value = "{taskId}")
    public TaskDto getTask(@PathVariable Long taskId) {
        return new TaskDto(1L, "test title", "test_content");
    }
    @RequestMapping
    public void deleteTask(Long taskId) {

    }
    @RequestMapping(method = RequestMethod.PUT, value = "{taskId}")
    public TaskDto updateTask(TaskDto taskDto) {
        return new TaskDto(3L, "Edited test title", "Test content");
    }
    @RequestMapping(method = RequestMethod.POST, value = "{taskId}")
    public TaskDto createTask(TaskDto taskDto) {
        return new TaskDto(5L, "Edited test", "Test_content");

    }
}
