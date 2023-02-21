package pl.coderslab.user;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveUser(User user) {
        entityManager.persist(user);
    }

    public User findById(long id) {
        return entityManager.find(User.class, id);
    }

    public void deleteById(long id) {
        User user = entityManager.find(User.class, id);
       entityManager.remove(user);
    }
    public void update(User user){
        entityManager.merge(user);
    }

    public List<User> findAll() {
        TypedQuery<User> query = entityManager.createQuery("select b from User b", User.class);
        List<User> users = query.getResultList();
        return users;
    }


}