package sharerrand.api.models;

import sharerrand.api.dto.MemberFormDTO;

import javax.persistence.*;
import java.util.List;

@Entity
public class Member extends User {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Group group;

    @OneToMany
    private List<Request> requestList;

    public Member(MemberFormDTO memberFormDTO) {
        super.setAddress(memberFormDTO.address);
        super.setFirstName(memberFormDTO.firstName);
        super.setLastName(memberFormDTO.lastName);
        super.setPhoneNumber(memberFormDTO.phoneNumber);
        //TODO: SET INITIAL GROUP
    }
}
