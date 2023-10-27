package ku.cs.flowerManagement.repository;

import ku.cs.flowerManagement.entity.Flower;
import ku.cs.flowerManagement.entity.Invoice;
import ku.cs.flowerManagement.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {

}
