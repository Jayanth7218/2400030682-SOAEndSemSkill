package com.klu.microservices.restaurantservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class RestaurantController {

    @GetMapping("/restaurant")
    public List<Map<String, Object>> getRestaurants() {

        return List.of(
            Map.of(
                "id", 1,
                "name", "Spice Garden",
                "cuisine", "Indian",
                "rating", 4.5
            ),
            Map.of(
                "id", 2,
                "name", "Pizza Corner",
                "cuisine", "Italian",
                "rating", 4.2
            )
        );
    }
}
