package codeline.com.Market_Mang.Services;

import codeline.com.Market_Mang.Models.Invoice;
import codeline.com.Market_Mang.Repositories.InvoiceRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServices {

    @Autowired
    InvoiceRepositories invoiceRepositories;
    public List<Invoice> getAllInvoices() {

        return invoiceRepositories.findAll();
    }
    public Invoice getInvoice(Integer id) {

        return invoiceRepositories.findById(id).get();
    }
}
