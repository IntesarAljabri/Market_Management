package Repositories;

import Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepositories extends JpaRepository<Item, Integer> {
}
