package pl.coderslab.task;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TaskDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveTask(Task task) {
        entityManager.persist(task);
    }

    public void deleteById(long id) {
        Task task = entityManager.find(Task.class, id);
        entityManager.remove(task);
    }
    public void update(Task task){
        entityManager.merge(task);
    }
    public Task updateTitleById(long id, String name) {
        Task task = entityManager.find(Task.class, id);
        task.setName(name);
        return task;
    }
    public List<Task> findAll() {
        TypedQuery<Task> query = entityManager.createQuery("select b from Task b", Task.class);
        List<Task> tasks = query.getResultList();
        return tasks;
    }
}