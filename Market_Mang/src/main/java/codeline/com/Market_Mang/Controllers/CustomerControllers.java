package codeline.com.Market_Mang.Controllers;

import codeline.com.Market_Mang.Models.Customer;
import codeline.com.Market_Mang.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("customers")
public class CustomerControllers {

    @Autowired
    CustomerServices customerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomer();
    }
    @GetMapping(value = "getById")
    public Customer getCustomerById(@RequestParam Integer id) {
        return customerService.getCustomer(id);
    }
    }

