package pl.coderslab.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/new")
    public String newUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "/user/new";
    }

    @PostMapping("/user/save")
    public String saveUser(User user) {
        userRepository.save(user);
        return "redirect:/user/list";
    }

    @GetMapping("/user/list")
    public String listBooks(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "/user/list";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        return "/user/delete";
    }

    @PostMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        userRepository.deleteById(id);
        return "redirect:/user/list";
    }

}