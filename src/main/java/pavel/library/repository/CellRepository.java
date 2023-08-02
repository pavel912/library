package pavel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pavel.library.domain.Cell;

@Repository
public interface CellRepository extends CrudRepository<Cell, Long> {
    Cell findById(long id);
}
