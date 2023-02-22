package pl.coderslab.status;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.task.Task;

import java.util.List;


@Controller
public class StatusController {

    private final StatusRepository statusRepository;


    public StatusController(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;

    }
    @GetMapping("/status/new")
    public String newStatus(Model model) {
        Status status = new Status();
        model.addAttribute("status",status);
        return "status/new";
    }

    @PostMapping("/status/save")
    public String saveStatus(Status status) {
        statusRepository.save(status);
        return "redirect:/status/list";
    }

    @GetMapping("/status/list")
    public String listStatus(Model model) {
        List<Status> status = statusRepository.findAll();
        model.addAttribute("status", status);
        return "status/list";
    }
    @GetMapping("/status/delete/{id}")
    public String deleteStatus(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        return "/status/delete";
    }

    @PostMapping("/status/delete/{id}")
    public String deleteStatus(@PathVariable long id) {
        statusRepository.deleteById(id);
        return "redirect:/status/list";
    }
}