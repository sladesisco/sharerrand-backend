package sharerrand.api.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Member extends User {

    @OneToOne
    private Group group;

    @OneToMany
    private List<Request> requestList;
}
