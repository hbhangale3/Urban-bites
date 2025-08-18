package com.hbhangale3.UrbanBite.review.services;

import com.hbhangale3.UrbanBite.response.Response;
import com.hbhangale3.UrbanBite.review.dtos.ReviewDTO;

import java.util.List;

public interface ReviewService {
    Response<ReviewDTO> createReview(ReviewDTO reviewDTO);
    Response<List<ReviewDTO>> getReviewsForMenu(Long menuId);
    Response<Double> getAverageRating(Long menuId);
}
