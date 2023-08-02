package pavel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pavel.library.domain.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {
    Library findById(long id);
}
