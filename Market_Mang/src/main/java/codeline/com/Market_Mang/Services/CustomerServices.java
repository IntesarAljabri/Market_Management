package codeline.com.Market_Mang.Services;

import codeline.com.Market_Mang.Models.Customer;
import codeline.com.Market_Mang.Repositories.CustomerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServices {

    @Autowired
    CustomerRepositories customerRepositories;
    //        public List<Customer> getAllCustomers() {
//            return customerRepositories.findAll();
//        }
    public List<Customer> getAllCustomer() {

        return customerRepositories.findAll();
    }

    public Customer getCustomer(Integer id) {

        return customerRepositories.findById(id).get();
    }



}

