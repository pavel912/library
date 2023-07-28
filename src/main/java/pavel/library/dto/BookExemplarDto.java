package pavel.library.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;
import java.util.List;

@Data
@Getter
@Setter
public class BookExemplarDto {
    private long id;

    private Instant createdAt;

    private BookDto book;

    private Long bookId;

    private BookStatusDto bookStatus;

    private Long bookStatusId;

    private CellDto cell;

    private Long cellId;

    private List<OrderDto> orders;
}
