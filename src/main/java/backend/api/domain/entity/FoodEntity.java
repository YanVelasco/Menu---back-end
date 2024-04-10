package backend.api.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "food")
@Builder
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID foodUUID;
    private String title;
    private String image;
    private Double price;
}
