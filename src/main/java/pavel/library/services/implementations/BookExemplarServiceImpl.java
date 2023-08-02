package pavel.library.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pavel.library.domain.BookExemplar;
import pavel.library.dto.BookExemplarDto;
import pavel.library.services.interfaces.BookExemplarService;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class BookExemplarServiceImpl implements BookExemplarService {
    @Override
    public BookExemplarDto toDto(BookExemplar object) {
        return null;
    }

    @Override
    public BookExemplar fromDto(BookExemplarDto dto) {
        return null;
    }

    @Override
    public BookExemplar get(long id) {
        return null;
    }

    @Override
    public BookExemplar create(BookExemplarDto dto) {
        return null;
    }

    @Override
    public BookExemplar update(BookExemplarDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
