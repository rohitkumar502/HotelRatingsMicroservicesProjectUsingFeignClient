package com.ms.user.service.external.services;

import com.ms.user.service.entity.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    //GET
    @GetMapping("/ratings")
    List<Rating> getRatings();

    //POST
    @PostMapping("/ratings")
    Rating createRating(Rating rating);

    //PUT
    @PutMapping("/ratings/{ratingId}")
    Rating updateRating(@PathVariable String ratingId, Rating rating);

    //DELETE
    @DeleteMapping("/ratings/{ratingId}")
    void deleteRating(@PathVariable String ratingId);
    

}
