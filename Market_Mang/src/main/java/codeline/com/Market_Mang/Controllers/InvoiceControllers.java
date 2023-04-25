package codeline.com.Market_Mang.Controllers;

import codeline.com.Market_Mang.Services.InvoiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("invoice")
public class InvoiceControllers {
        @Autowired
        InvoiceServices invoiceService;

        @RequestMapping(value = "getAll", method = RequestMethod.GET)
        public <Invoice> List<Invoice>  getAllCustomers() {

            return (List<Invoice>) invoiceService.getAllInvoices();
        }
    }

