import { Review } from './../interfaces/reviews-interface';
import { Component, OnInit } from '@angular/core';
import { ReviewServiceService } from '../services/review-service.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-create-review',
  templateUrl: './create-review.component.html',
  styleUrls: ['./create-review.component.css']
})
export class CreateReviewComponent implements OnInit {

  reviewForm = this.formBuilder.group({
    hikeName: '',
    yourName: '',
    review: '',
  })

  reviewPost: Review = {
    hikeName: "",
    yourName: "",
    review: "",
  }

  constructor(private reviewService: ReviewServiceService, private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }


  postReviewSubmit() {
    // this.reviewService.postReview();
    console.log("hey")
    console.log(this.reviewForm.value.hikeName)
    this.reviewPost.hikeName=this.reviewForm.value.hikeName;
    this.reviewPost.yourName = this.reviewForm.value.yourName;
    this.reviewPost.review = this.reviewForm.value.review;

    this.reviewService.postReview(this.reviewPost);
  }

}
