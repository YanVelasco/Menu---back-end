package backend.api.domain.dto;

import backend.api.domain.entity.FoodEntity;

public record FoodRequestDTO(
        String title,
        String image,
        Double price
) {
}
