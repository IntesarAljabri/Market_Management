package Services;

import Models.Invoice;
import Repositories.InvoiceRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServices {

    @Autowired
    InvoiceRepositories invoiceRepositories;

    //        public List<Invoice> getAllInvoices() {
//            return invoiceRepositories.findAll();
//        }
    public List<Invoice> getAllInvoices() {

        return invoiceRepositories.findAll();
    }

    public Invoice getMarketById(Integer id) {
        return invoiceRepositories.findById(id).get();
    }
}
