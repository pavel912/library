package pavel.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @CreationTimestamp
    private Instant createdAt;

    private Instant startedAt;

    private Instant plannedFinishedAt;

    private Instant finishedAt;

    private Double plannedFee;

    private Double actualFee;

    @ManyToOne(fetch = FetchType.EAGER)
    private BookExemplar bookExemplar;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
