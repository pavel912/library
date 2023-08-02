package pavel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pavel.library.domain.Shelf;

@Repository
public interface ShelfRepository extends CrudRepository<Shelf, Long> {
    Shelf findById(long id);
}
