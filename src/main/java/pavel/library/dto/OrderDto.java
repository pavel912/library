package pavel.library.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Data
@Getter
@Setter
public class OrderDto {
    private long id;

    private Instant createdAt;

    private Instant startedAt;

    private Instant plannedFinishedAt;

    private Instant finishedAt;

    private Double plannedFee;

    private Double actualFee;

    private BookExemplarDto bookExemplar;

    private Long bookExemplarId;

    private UserDto user;

    private Long userId;
}
