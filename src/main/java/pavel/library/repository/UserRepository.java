package pavel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pavel.library.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);
}
