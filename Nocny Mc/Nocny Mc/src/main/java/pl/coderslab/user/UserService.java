package pl.coderslab.user;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUser(Long userId);
    void addUser(User user);
    void editUser(User user);
    void deleteUser(long UserId);
}