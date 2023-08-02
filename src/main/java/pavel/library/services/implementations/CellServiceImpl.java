package pavel.library.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pavel.library.domain.Cell;
import pavel.library.dto.CellDto;
import pavel.library.services.interfaces.CellService;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class CellServiceImpl implements CellService {
    @Override
    public CellDto toDto(Cell object) {
        return null;
    }

    @Override
    public Cell fromDto(CellDto dto) {
        return null;
    }

    @Override
    public Cell get(long id) {
        return null;
    }

    @Override
    public Cell create(CellDto dto) {
        return null;
    }

    @Override
    public Cell update(CellDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
