package pavel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pavel.library.domain.BookExemplar;

@Repository
public interface BookExemplarRepository extends CrudRepository<BookExemplar, Long> {
    BookExemplar findById(long id);
}
