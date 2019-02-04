package classSuggestion.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

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

}
