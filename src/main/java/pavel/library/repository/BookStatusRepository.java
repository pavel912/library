package pavel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pavel.library.domain.BookStatus;

@Repository
public interface BookStatusRepository extends CrudRepository<BookStatus, Long> {
    BookStatus findById(long id);
}
