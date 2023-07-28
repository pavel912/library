package pavel.library.dto;

import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;

public class LibraryDto {
    private long id;

    private Instant createdAt;

    @NotBlank(message = "Library name can't be empty")
    private String name;

    @NotBlank(message = "Library address can't be empty")
    private String address;

    private List<ShelfDto> shelfs;
}
