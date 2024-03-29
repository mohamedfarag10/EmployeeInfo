package Model;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {
    @Id
    @GeneratedValue(generator = "DEP_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "DEP_SEQ", sequenceName = "DEP_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
