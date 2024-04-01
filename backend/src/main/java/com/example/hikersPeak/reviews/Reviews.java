package com.example.hikersPeak.reviews;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;

@Entity
@Table(name= "reviews")
public class Reviews {
    @Id
//    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @UuidGenerator
    private String reviewId;
    private String hikeName;
    private String yourName;
//    private Date dateOfVisit;
    private String review;

    public Reviews() {
    }

    public Reviews(String reviewId, String hikeName, String yourName, String review) {
        this.reviewId = reviewId;
        this.hikeName = hikeName;
        this.yourName = yourName;
//        this.dateOfVisit = dateOfVisit;
        this.review = review;
    }

    public Reviews(String hikeName, String yourName, String review) {
        this.hikeName = hikeName;
        this.yourName = yourName;
//        this.dateOfVisit = dateOfVisit;
        this.review = review;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getHikeName() {
        return hikeName;
    }

    public void setHikeName(String hikeName) {
        this.hikeName = hikeName;
    }

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

//    public Date getDateOfVisit() {
//        return dateOfVisit;
//    }
//
//    public void setDateOfVisit(Date dateOfVisit) {
//        this.dateOfVisit = dateOfVisit;
//    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "reviewId='" + reviewId + '\'' +
                ", hikeName='" + hikeName + '\'' +
                ", yourName='" + yourName + '\'' +
//                ", dateOfVisit=" + dateOfVisit +
                ", review='" + review + '\'' +
                '}';
    }
}
