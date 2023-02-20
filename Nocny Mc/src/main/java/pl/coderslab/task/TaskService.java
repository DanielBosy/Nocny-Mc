package pl.coderslab.task;

import pl.coderslab.user.User;

import java.util.List;

public interface TaskService {
    List<Task> getAllTask();

    Task getTask(Long taskId);
    void addTask(Task task);
    void editTask(Task task);
    void deleteTask(long TaskId);
}