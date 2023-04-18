package Repositories;

import Models.Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarketRepositories extends JpaRepository<Market, Integer> {

}
