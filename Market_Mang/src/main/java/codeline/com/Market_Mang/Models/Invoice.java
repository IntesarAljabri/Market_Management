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
    @JoinColumn(name = "CustomerId", referencedColumnName = "CustomerId")
    Customer customer;

    @ManyToMany
    @JoinTable(name = "invoiceItem", joinColumns = @JoinColumn(name = "invoiceId"), inverseJoinColumns = @JoinColumn(name = "itemId"))
    List<Item> item;

    @ManyToOne
    @JoinColumn(name = "marketId", referencedColumnName = "marketId")
    Market market;
}

