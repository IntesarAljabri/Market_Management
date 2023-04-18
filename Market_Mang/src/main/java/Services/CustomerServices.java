package Services;

import Repositories.CustomerRepositories;
import Repositories.MarketRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServices<Customers> {


    @Autowired
    CustomerRepositories customerRepositories;

    public List<Customers> getAllCustomers() {
        return customerRepositories.findAll();
    }


    findById(id).get();

}

