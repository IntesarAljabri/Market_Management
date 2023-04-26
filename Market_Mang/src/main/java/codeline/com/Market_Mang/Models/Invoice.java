package codeline.com.Market_Mang.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "number")
    int no;

    @Column(name = "items")
    String items;

    @ManyToOne
    @JoinColumn(name = "Customer_id", referencedColumnName = "Customer_id")
    Customer customer;

    @ManyToMany
    @JoinTable(name = "invoice_item", joinColumns = @JoinColumn(name = "invoice_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
    List<Item> item;

    @ManyToOne
    @JoinColumn(name = "market_id", referencedColumnName = "market_id")
    Market market;
}

