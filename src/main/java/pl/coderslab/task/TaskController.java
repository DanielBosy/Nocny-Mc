package pl.coderslab.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.user.User;
import pl.coderslab.user.UserRepository;

import javax.validation.Valid;
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
    public String saveTask(@Valid Task task, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/task/new";
        }
        taskRepository.save(task);
        return "redirect:/task/list";
    }
    @GetMapping("/task/list")
    public String listTask(Model model) {
        List<Task> task = taskRepository.findAll();
        model.addAttribute("task", task);
        return "task/list";
    }
    @GetMapping("/task/delete/{id}")
    public String deleteTask(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        return "/task/delete";
    }

    @PostMapping("/task/delete/{id}")
    public String deleteTask(@PathVariable long id) {
        taskRepository.deleteById(id);
        return "redirect:/task/list";
    }

}
