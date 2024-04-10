package backend.api.domain.controller;

import backend.api.domain.dto.FoodRequestDTO;
import backend.api.domain.dto.FoodResponseDTO;
import backend.api.domain.entity.FoodEntity;
import backend.api.domain.repository.FoodRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("food")
public class FoodController {

    private final FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @CrossOrigin(origins = "*" , allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<FoodResponseDTO> saveFood(@RequestBody FoodRequestDTO foodRequestDTO) {
        var food = FoodEntity.builder()
                .title(foodRequestDTO.title())
                .image(foodRequestDTO.image())
                .price(foodRequestDTO.price())
                .build();
        foodRepository.save(food);
        return ResponseEntity.ok(new FoodResponseDTO(food));
    }

    @GetMapping
    public List<FoodResponseDTO>  getAllFood() {
        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map (FoodResponseDTO::new).toList();
        return foodList;
    }

}

