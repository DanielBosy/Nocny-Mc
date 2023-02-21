package pl.coderslab.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.user.User;
import pl.coderslab.user.UserRepository;

import java.util.List;

@Controller
public class TaskController {
    private final TaskRepository taskRepository;


    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;


    }

    @GetMapping("/task/new")
    public String newTask(Model model) {
        Task task = new Task();
        model.addAttribute("task",task);
        return "task/new";
    }

    @PostMapping("/task/save")
    public String saveTask(Task task) {
        taskRepository.save(task);
        return "redirect:/task/list";
    }

    @GetMapping("/task/list")
    public String listTask(Model model) {
        List<Task> task = taskRepository.findAll();
        model.addAttribute("task", task);
        return "task/list";
    }


}
