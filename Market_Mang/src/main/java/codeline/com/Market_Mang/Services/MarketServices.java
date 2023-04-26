package codeline.com.Market_Mang.Services;

import codeline.com.Market_Mang.Models.Market;
import codeline.com.Market_Mang.Repositories.MarketRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MarketServices {
    @Autowired
    MarketRepositories marketRepositories;

            public List<Market> getAllMarkets() {
            return marketRepositories.findAll();
        }
    public List<Market> getAllInvoices() {

        return marketRepositories.findAll();
    }

    public Market getMarket(Integer id) {

                return marketRepositories.findById(id).get();
    }


}
