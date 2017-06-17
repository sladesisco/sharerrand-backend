package sharerrand.api.dao;

import org.springframework.data.repository.CrudRepository;
import sharerrand.api.models.Member;

public interface MemberDAO extends CrudRepository<Member, Long> {
}
