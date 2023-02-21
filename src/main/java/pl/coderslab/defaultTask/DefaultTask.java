package pl.coderslab.defaultTask;

import pl.coderslab.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "defaultTask")
public class DefaultTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull
    User user;

    public DefaultTask(Long id, String name, String notes, User user) {
        this.id = id;
        this.name = name;
        this.notes = notes;
        this.user = user;
    }

    public DefaultTask() {

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

    @Override
    public String toString() {
        return "DefaultTask{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", user=" + user +
                '}';
    }
}
