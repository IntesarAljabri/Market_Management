package codeline.com.Market_Mang.Services;

import codeline.com.Market_Mang.Repositories.NewEntityRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class BaseEntityServices {
    @Autowired
    private NewEntityServices newEntityServices;

    public <NewEntity> List<NewEntity> getAll() {
        return (List<NewEntity>) newEntityServices.getAll();
    }
}
