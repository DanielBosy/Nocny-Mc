package pl.coderslab.defaultTask;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.task.Task;


import javax.validation.Valid;
import java.util.List;


@Controller
public class DefaultTaskController {

    private final DefaultTaskRepository defaultTaskRepository;


    public DefaultTaskController(DefaultTaskRepository defaultTaskRepository) {
        this.defaultTaskRepository = defaultTaskRepository;

    }
    @GetMapping("/default/new")
    public String newTask(Model model) {
        DefaultTask defaultTask = new DefaultTask();
        model.addAttribute("defaultTask", defaultTask);
        return "/default/new";
    }
    @PostMapping("/default/save")
    public String saveDefaultTask(@Valid DefaultTask defaultTask, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/default/new";
        }
        defaultTaskRepository.save(defaultTask);
        return "redirect:/default/list";
    }

    @GetMapping("/default/list")
    public String listDefaultTask(Model model) {
        List<DefaultTask> defaultTasks = defaultTaskRepository.findAll();
        model.addAttribute("defaultTasks", defaultTasks);
        return "/default/list";
    }
    @GetMapping("/user/view")
    public String view() {
        return "/user/view";
    }
}