package pavel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pavel.library.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    Book findById(long id);
}
