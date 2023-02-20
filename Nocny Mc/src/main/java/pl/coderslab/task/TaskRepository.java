package pl.coderslab.task;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.user.User;

public interface TaskRepository extends JpaRepository<Task, Long> {

}


