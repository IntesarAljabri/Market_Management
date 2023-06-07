package codeline.com.Market_Mang.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table (name ="customers")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column(name = "customerName")
    String name;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    List<Invoice> invoices;
}
