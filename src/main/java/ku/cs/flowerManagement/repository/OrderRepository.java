package ku.cs.flowerManagement.repository;

import ku.cs.flowerManagement.entity.OrderFlower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderFlower, Integer> {

}
