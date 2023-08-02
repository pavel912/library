package pavel.library.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pavel.library.domain.Order;
import pavel.library.dto.OrderDto;
import pavel.library.services.interfaces.OrderService;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDto toDto(Order object) {
        return null;
    }

    @Override
    public Order fromDto(OrderDto dto) {
        return null;
    }

    @Override
    public Order get(long id) {
        return null;
    }

    @Override
    public Order create(OrderDto dto) {
        return null;
    }

    @Override
    public Order update(OrderDto dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
