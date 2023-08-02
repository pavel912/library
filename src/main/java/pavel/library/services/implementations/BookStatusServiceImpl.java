package pavel.library.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pavel.library.domain.BookStatus;
import pavel.library.dto.BookStatusDto;
import pavel.library.services.interfaces.BookStatusService;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class BookStatusServiceImpl implements BookStatusService {
    @Override
    public BookStatusDto toDto(BookStatus object) {
        return null;
    }

    @Override
    public BookStatus fromDto(BookStatusDto dto) {
        return null;
    }

    @Override
    public BookStatus get(long id) {
        return null;
    }

    @Override
    public BookStatus create(BookStatusDto dto) {
        return null;
    }

    @Override
    public BookStatus update(BookStatusDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
