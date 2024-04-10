package backend.api.domain.repository;

import backend.api.domain.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodRepository extends JpaRepository<FoodEntity, UUID> {
}
