package tracker.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tracker.dto.TaskDTO;

@RestController
@RequestMapping("/api/v1/tracker")
public class TaskTrackerController {

    @PostMapping(value = "/add-task", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String addTask(@RequestBody TaskDTO taskDTO) {
        return "Task added successfully ID: " + taskDTO.getId();
    }

    @PostMapping(value = "/update-task", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateTask(@RequestBody TaskDTO taskDTO) {
        return "Task updated successfully ID: " + taskDTO.getId();
    }

    @PostMapping(value = "/delete-task", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteTask(@RequestBody TaskDTO taskDTO) {
        return "Deleted Task number: " + taskDTO.getId();
    }

    @PostMapping(value = "/list-all-task", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String listAllTask() {
        return "Deleted Task number: ";
    }

    @PostMapping(value = "/list-done-task", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String listDoneTask() {
        return "Deleted Task number: ";
    }

    @PostMapping(value = "/list-inprogress-task", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String listInprogressTask() {
        return "Deleted Task number: ";
    }



}