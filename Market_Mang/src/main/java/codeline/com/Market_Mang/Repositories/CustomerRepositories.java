package codeline.com.Market_Mang.Repositories;

import codeline.com.Market_Mang.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositories extends JpaRepository<Customer, Integer> {



}
