package Services;

import Models.Invoice;
import Models.Item;
import Models.Market;
import Repositories.InvoiceRepositories;
import Repositories.ItemRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemServices {
    public List getAllItem() {

        @Autowired
        ItemRepositories itemRepositories;

        public List<Item> getAllItems () {
            return itemRepositories.findAll();

            public Item getItemById (Integer id){
                return itemRepositories.findById(id).get();
            }
        }
    }
}
