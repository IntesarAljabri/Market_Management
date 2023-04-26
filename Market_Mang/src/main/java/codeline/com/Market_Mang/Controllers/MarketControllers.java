package codeline.com.Market_Mang.Controllers;


import codeline.com.Market_Mang.Models.Invoice;
import codeline.com.Market_Mang.Models.Market;
import codeline.com.Market_Mang.Services.MarketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("markets")
public class MarketControllers {

    @Autowired
    MarketServices marketServices;

    @GetMapping("all")
    public List<Market> getAllMarkets() {
        return marketServices.getAllMarkets();
    }

    @GetMapping(value = "getById")
    public Market getMarketById(@RequestParam Integer id) {
        return marketServices.getMarket(id);
    }
}


