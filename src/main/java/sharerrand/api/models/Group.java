package sharerrand.api.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Group {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String zipCode;

    @NotNull
    private String title;

    @OneToOne
    private Community community;

    @OneToMany
    private List<Request> requests;


}
