package pl.coderslab.task;


import pl.coderslab.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3, message = "nazwa musi mieć minumum 3 znaki")
    private String name;
    @Size(max = 200, message = "notatka nie może być dłusza niż 200 znaków")

    private String notes;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull
    User user;

    public Task() {


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task(Long id, String name, String notes, User user) {
        this.id = id;
        this.name = name;
        this.notes = notes;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", user=" + user +
                '}';
    }
}