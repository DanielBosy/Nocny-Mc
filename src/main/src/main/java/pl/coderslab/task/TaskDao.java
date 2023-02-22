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

    public Task findById(long id) {
        return entityManager.find(Task.class, id);
    }

    public void deleteById(long id) {
        Task task = entityManager.find(Task.class, id);
        entityManager.remove(task);
    }
    public List<Task> findAll() {
        TypedQuery<Task> query = entityManager.createQuery("select b from Task b", Task.class);
        List<Task> publishers = query.getResultList();
        return publishers;
    }


}