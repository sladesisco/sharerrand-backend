package sharerrand.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Test {

    @Id
    @GeneratedValue
    public Long id;

    @NotNull
    public String name;


    /**
     * Default constructor required for Jackson's Object Mapper
     */
    public Test() {
    }

    public Test(String name) {
        this.name = name;
    }
}
