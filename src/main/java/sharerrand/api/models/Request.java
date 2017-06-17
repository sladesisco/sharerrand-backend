package sharerrand.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;

@Entity
public class Request {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @DefaultValue(value = "false")
    private boolean completed;

    @NotNull
    private String origin;

    private String destination;

    @OneToOne
    private Member member;


}
