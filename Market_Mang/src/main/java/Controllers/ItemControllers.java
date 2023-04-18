package Controllers;

import Services.InvoiceServices;
import Services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("item")
public class ItemControllers<Items> {
        @Autowired
        ItemServices itemService;

        @RequestMapping(value = "getAll", method = RequestMethod.GET)
        public List<Items> getAllItems() {

            return itemService.getAllItem();
        }
}
