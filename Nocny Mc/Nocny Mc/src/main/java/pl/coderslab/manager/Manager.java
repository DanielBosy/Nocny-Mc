package pl.coderslab.manager;


import pl.coderslab.task.Task;
import pl.coderslab.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Password;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull
    User user;
    public Manager(Long id, String name, String password) {
        this.id = id;
        Name = name;
        Password = password;
    }

    public Manager() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
