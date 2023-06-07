package codeline.com.Market_Mang.Repositories;

import codeline.com.Market_Mang.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepositories extends JpaRepository<Invoice, Integer> {
}
