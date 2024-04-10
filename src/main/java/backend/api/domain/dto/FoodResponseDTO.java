package backend.api.domain.dto;

import backend.api.domain.entity.FoodEntity;

import java.util.UUID;

public record FoodResponseDTO(
        UUID foodUUID,
        String title,
        String image,
        Double price) {

    public FoodResponseDTO(FoodEntity foodEntity){
        this(foodEntity.getFoodUUID(), foodEntity.getTitle(), foodEntity.getImage(), foodEntity.getPrice());
    }

}
