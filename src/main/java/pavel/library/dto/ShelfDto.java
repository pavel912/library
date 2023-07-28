package pavel.library.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Data
@Getter
@Setter
public class ShelfDto {
    private long id;

    private Instant createdAt;

    private List<CellDto> cells;

    private LibraryDto library;

    private Long libraryId;
}
