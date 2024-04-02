package com.example.hikersPeak;

import com.example.hikersPeak.reviews.ReviewService;
import com.example.hikersPeak.reviews.Reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@RestController
@CrossOrigin(value = "http://localhost:4200", allowCredentials = "true")
public class HikersPeakApplication {
	private final ReviewService reviewService;

	@Autowired
	HikersPeakApplication(ReviewService reviewService) {
		this.reviewService = reviewService;
	}

	public static void main(String[] args) {
		SpringApplication.run(HikersPeakApplication.class, args);
	}
	@GetMapping("/")
	public List<Reviews> hello() {
		Reviews review1 = new Reviews("1", "Ramadevera Hills", "Ankesh", "Loved it");
		return List.of(review1);
	}

	@PostMapping("/saveReview")
	@ResponseBody
	public String saveReview(@RequestBody Reviews reviews) {
		reviewService.saveData(reviews);
//		HttpHeaders responseHeaders = new HttpHeaders();
//		return new ResponseEntity<>("Successful", responseHeaders, 200);
		return "Successfully received!";
	}
}
