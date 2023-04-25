package codeline.com.Market_Mang.Controllers;

import codeline.com.Market_Mang.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("customers")
public class CustomerControllers {

        @Autowired
        CustomerServices customerService;

        @RequestMapping(value = "getAll", method = RequestMethod.GET)
        public List getAllCustomers() {

            return customerService.getAllCustomers();
        }
    }

