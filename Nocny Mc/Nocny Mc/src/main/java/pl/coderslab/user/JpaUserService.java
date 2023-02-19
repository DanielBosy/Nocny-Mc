package pl.coderslab.user;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class JpaUserService implements UserService {
    private final UserRepository userRepository;
    public JpaUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAllUser() {
        return null;
    }
    @Override
    public User getUser(Long userId) {
        return null;
    }
    @Override
    public void addUser(User user) {
    }
    @Override
    public void editUser(User user) {
    }
    @Override
    public void deleteUser(long UserId) {
    }
}