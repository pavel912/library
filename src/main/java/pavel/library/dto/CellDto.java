package pavel.library.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;

@Data
@Getter
@Setter
public class CellDto {
    private long id;

    private Instant createdAt;

    private ShelfDto shelf;

    private Long shelfId;

    private BookExemplarDto bookExemplar;

    private Long bookExemplarId;
}
