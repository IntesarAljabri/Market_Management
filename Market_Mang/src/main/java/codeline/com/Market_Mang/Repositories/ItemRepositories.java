package codeline.com.Market_Mang.Repositories;

import codeline.com.Market_Mang.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepositories extends JpaRepository<Item, Integer> {
}
