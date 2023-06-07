package codeline.com.Market_Mang.Services;

import codeline.com.Market_Mang.Models.Item;
import codeline.com.Market_Mang.Repositories.ItemRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServices {
   // public List getAllItem() {

        @Autowired
        ItemRepositories itemRepositories;

        public List<Item> getAllItems() {
            return itemRepositories.findAll();
        }
            public Item getItemById (Integer id){
                return itemRepositories.findById(id).get();
            }

    }

