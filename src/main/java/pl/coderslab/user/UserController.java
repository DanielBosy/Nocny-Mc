package pl.coderslab.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("-")
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


}