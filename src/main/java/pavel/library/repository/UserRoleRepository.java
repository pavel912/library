package pavel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pavel.library.domain.UserRole;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
    UserRole findById(long id);
}
