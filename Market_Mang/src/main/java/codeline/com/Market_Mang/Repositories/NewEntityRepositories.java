package codeline.com.Market_Mang.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewEntityRepositories<NewEntity> extends JpaRepository<NewEntity, Integer> {
    List<NewEntity> findByNewEntityId(Integer newEntityId);
}