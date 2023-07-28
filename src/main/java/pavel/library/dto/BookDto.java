package pavel.library.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;

@Data
@Getter
@Setter
public class BookDto {
    private long id;

    private Instant createdAt;

    @NotNull(message = "Book price can't be empty")
    private Double price;

    @NotBlank(message = "Book name can't be empty")
    private String name;

    @NotBlank(message = "Book's author can't be empty")
    private String author;

    @NotBlank(message = "Book's publisher can't be empty")
    private String publisher;

    @Lob
    private String description;

    private String pictureRef;

    private List<BookExemplarDto> exemplars;
}
