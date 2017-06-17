package sharerrand.api.dao;

import org.springframework.data.repository.CrudRepository;
import sharerrand.api.models.Test;

public interface TestDAO extends CrudRepository<Test, Long> {
}
