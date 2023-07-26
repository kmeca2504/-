package com.wow.review.api;

import com.wow.review.api.request.CreateAndEditRestaurantRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestaurantApi {
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
    public String createRestaurant(
            @RequestBody CreateAndEditRestaurantRequest request
            ){
        return "This is createRestaurant, name" + request.getName() + "address = "+request.getAddress()
                +", menu[0].name=" + request.getMenus().get(0).getName()+", menu[0].price = "+request.getMenus().get(0).getPrice();
    }

    @PutMapping("/restaurant/{restaurantId}")
    public String editRestaurant(
            @PathVariable Long restaurantId,
            @RequestBody CreateAndEditRestaurantRequest request
    ){
        return"This is editRestaurant, "+ restaurantId +"name = "+request.getName() + ", address"+ request.getAddress();
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public String deleteRestaruant(
            @PathVariable Long restaurantId
    ){
        return "This is deleteRestaurant, " + restaurantId;
    }
}
