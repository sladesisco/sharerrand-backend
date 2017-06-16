package sharerrand.api.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assistant extends User {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<Community> communityList;

    @OneToMany
    private List<Request> requestList;
}
