import { FetchReviewsService } from './fetch-reviews.service';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-read-reviews',
  templateUrl: './read-reviews.component.html',
  styleUrls: ['./read-reviews.component.css']
})
export class ReadReviewsComponent implements OnInit {
  fetchedReviews: any;
  constructor(private data: FetchReviewsService) { }

  ngOnInit(): void {
    // this.http.get<any>().subscribe(response => {
    //   this.fetchedReviews = response;
        this.data.fetchReviews().subscribe((response: any) => {
        this.fetchedReviews = response;
        console.log(this.fetchedReviews)
      });
      
    // })
  }
  
}
