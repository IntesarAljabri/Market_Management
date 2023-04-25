package codeline.com.Market_Mang.Controllers;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController

public class NewEntityControllers {
    @Autowired
    private NewEntityControllers controllers;

    @GetMapping
    public <NewEntity> List<NewEntity> getAll() {
        return controllers.getAll();
    }
}