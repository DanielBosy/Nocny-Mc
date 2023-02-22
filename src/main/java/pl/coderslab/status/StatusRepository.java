package pl.coderslab.status;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.defaultTask.DefaultTask;


public interface StatusRepository extends JpaRepository<Status, Long> {

}


