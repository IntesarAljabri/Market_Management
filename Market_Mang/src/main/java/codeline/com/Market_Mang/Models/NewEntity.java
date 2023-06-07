package codeline.com.Market_Mang.Models;


import codeline.com.Market_Mang.Controllers.*;
import codeline.com.Market_Mang.Repositories.*;
import codeline.com.Market_Mang.Services.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;
    private  int no;
    private double price;
    private String items;

    @Autowired
    ItemControllers itemControllers;
    @Autowired
    InvoiceControllers invoiceControllers;
    @Autowired
    CustomerControllers customerControllers;
    @Autowired
    MarketControllers marketControllers;

    @Autowired
    ItemRepositories itemRepositories;
    @Autowired
    InvoiceRepositories invoiceRepositories;
    @Autowired
    CustomerRepositories customerRepositories;
    @Autowired
    MarketRepositories marketRepositories;
    @Autowired
    ItemServices itemServices;
    @Autowired
    InvoiceServices invoiceServices;
    @Autowired
    CustomerServices customerServices;
    @Autowired
    MarketServices marketServices;


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;

}
