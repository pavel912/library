package pavel.library.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pavel.library.domain.Shelf;
import pavel.library.dto.ShelfDto;
import pavel.library.services.interfaces.ShelfService;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class ShelfServiceImpl implements ShelfService {
    @Override
    public ShelfDto toDto(Shelf object) {
        return null;
    }

    @Override
    public Shelf fromDto(ShelfDto dto) {
        return null;
    }

    @Override
    public Shelf get(long id) {
        return null;
    }

    @Override
    public Shelf create(ShelfDto dto) {
        return null;
    }

    @Override
    public Shelf update(ShelfDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
