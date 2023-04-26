package codeline.com.Market_Mang.Controllers;

import codeline.com.Market_Mang.Models.Customer;
import codeline.com.Market_Mang.Models.Invoice;
import codeline.com.Market_Mang.Services.InvoiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "getById")
    public Invoice getInvoiceById(@RequestParam Integer id) {
        return invoiceService.getInvoice(id);
    }

    }

