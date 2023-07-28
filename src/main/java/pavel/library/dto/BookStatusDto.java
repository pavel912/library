package pavel.library.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;

@Data
@Getter
@Setter
public class BookStatusDto {
    private long id;

    private Instant createdAt;

    @NotBlank(message = "Boos status name can't be empty")
    private String name;

    private List<BookExemplarDto> bookExemplars;
}
