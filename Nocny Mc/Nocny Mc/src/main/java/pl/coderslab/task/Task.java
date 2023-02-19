package pl.coderslab.task;

import pl.coderslab.manager.Manager;
import pl.coderslab.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull
    User user;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    @NotNull
    Manager manager;

    public Task(Long id, String name, String notes) {
        this.id = id;
        Name = name;
        this.notes = notes;
    }

    public Task() {
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "task{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
