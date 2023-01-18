package com.ecommerce.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.spring.demo.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
