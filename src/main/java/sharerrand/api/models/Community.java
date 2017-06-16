package sharerrand.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Community {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String zipCode;

    @NotNull
    private String title;

    @OneToMany
    private List<Group> groupList;

}
