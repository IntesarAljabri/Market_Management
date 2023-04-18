package Controllers;


import Services.ItemServices;
import Services.MarketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("market")
public class MarketControllers {

    @Autowired
    MarketServices marketServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Markets> List<Markets> getAllMarket() {

        return marketServices.getAllMarket();
    }

}
