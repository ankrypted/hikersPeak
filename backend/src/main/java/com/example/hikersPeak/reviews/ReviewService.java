package com.example.hikersPeak.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Reviews> getAll() {
        return reviewRepository.findAll();
    }
    public void saveData(Reviews review) {
        reviewRepository.save(review);

    }
}
