package pavel.library.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pavel.library.domain.Book;
import pavel.library.dto.BookDto;
import pavel.library.services.interfaces.BookService;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    @Override
    public BookDto toDto(Book object) {
        return null;
    }

    @Override
    public Book fromDto(BookDto dto) {
        return null;
    }

    @Override
    public Book get(long id) {
        return null;
    }

    @Override
    public Book create(BookDto dto) {
        return null;
    }

    @Override
    public Book update(BookDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
