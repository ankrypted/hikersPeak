package com.example.hikersPeak.reviews;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Reviews, String> {
}
