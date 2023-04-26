package codeline.com.Market_Mang.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "markets")
public class Market {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;

        @Column(name = "market_name")
        String name;

        @OneToMany(mappedBy = "market")
        @JsonIgnore
        private List<Invoice> invoices;
}
