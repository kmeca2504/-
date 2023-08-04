package com.wow.review.api;

import com.wow.review.api.request.CreateAndEditRestaurantRequest;
import com.wow.review.model.RestaurantEntity;
import com.wow.review.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RestController
public class RestaurantApi {

    private  final RestaurantService restaurantService;
    @GetMapping("/restaurants")
    public  String getRestaurants(){
        return "Tis is getRestaurants";
    }
    @GetMapping("/restaurant/{restaurantId}")
    public  String getRestaurant(
            @PathVariable Long restaurantId
    ){
        return "This is getRestaurant, " + restaurantId;
    }

    @PostMapping("/restaurant")
    public void createRestaurant(
            @RequestBody CreateAndEditRestaurantRequest request
            ){
      restaurantService.createRestaurant(request);
    }

    @PutMapping("/restaurant/{restaurantId}")
    public void editRestaurant(
            @PathVariable Long restaurantId,
            @RequestBody CreateAndEditRestaurantRequest request
    ){
        restaurantService.editRestaurant(restaurantId,request);
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public void deleteRestaruant(
            @PathVariable Long restaurantId
    ){
        restaurantService.deleteRestaurant(restaurantId);
    }
}
