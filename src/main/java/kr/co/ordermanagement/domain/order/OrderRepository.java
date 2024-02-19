package kr.co.ordermanagement.domain.order;

import javax.swing.plaf.nimbus.State;
import java.util.List;

public interface OrderRepository {
    Order add(Order order);
    Order findById(Long id);
    List<Order> findByState(State state);
}
