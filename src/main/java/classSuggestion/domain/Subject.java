package classSuggestion.domain;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {

    public Subject() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String description;

    @Column
    private Integer semester;

    @Column
    private Integer weight;

    @Column(name = "credit_lockable")
    private boolean creditLockable;

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Integer getSemester() {
        return semester;
    }

    public Integer getWeight() {
        return weight;
    }

    public boolean isCreditLockable() {
        return creditLockable;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setCreditLockable(boolean creditLockable) {
        this.creditLockable = creditLockable;
    }
}
