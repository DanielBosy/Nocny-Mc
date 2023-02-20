package pl.coderslab.task;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class JpaTaskService implements TaskService {
    private final TaskRepository taskRepository;
    public JpaTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTask() {
        return null;
    }

    @Override
    public Task getTask(Long taskId) {
        return null;
    }

    @Override
    public void addTask(Task task) {

    }

    @Override
    public void editTask(Task task) {

    }

    @Override
    public void deleteTask(long TaskId) {

    }
}