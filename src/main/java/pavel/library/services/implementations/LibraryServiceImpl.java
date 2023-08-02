package pavel.library.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pavel.library.domain.Library;
import pavel.library.dto.LibraryDto;
import pavel.library.services.interfaces.LibraryService;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class LibraryServiceImpl implements LibraryService {
    @Override
    public LibraryDto toDto(Library object) {
        return null;
    }

    @Override
    public Library fromDto(LibraryDto dto) {
        return null;
    }

    @Override
    public Library get(long id) {
        return null;
    }

    @Override
    public Library create(LibraryDto dto) {
        return null;
    }

    @Override
    public Library update(LibraryDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
