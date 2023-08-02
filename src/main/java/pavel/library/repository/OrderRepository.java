package pavel.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pavel.library.domain.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    Order findById(long id);
}
