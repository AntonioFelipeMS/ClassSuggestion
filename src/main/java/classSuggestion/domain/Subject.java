package classSuggestion.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

    public Subject() {
    }

    @Id
    private Integer id;

    @Column
    private String description;

    @Column
    private Integer semester;

    @Column
    private String weight;

    @Column
    private boolean credit_lockable;

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Integer getSemester() {
        return semester;
    }

    public String getWeight() {
        return weight;
    }

    public boolean isCredit_lockable() {
        return credit_lockable;
    }
}
