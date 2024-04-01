package com.example.hikersPeak;

import com.example.hikersPeak.reviews.Reviews;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin("http://localhost:4200/")
public class HikersPeakApplication {

	public static void main(String[] args) {
		SpringApplication.run(HikersPeakApplication.class, args);
	}
	@GetMapping("/")
	public List<Reviews> hello() {
		Reviews review1 = new Reviews("1", "Ramadevera Hills", "Ankesh", new Date(2000, 03, 14), "Loved it");
		return List.of(review1);
	}
}
