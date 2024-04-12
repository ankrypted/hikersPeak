import { FetchReviewsService } from './fetch-reviews.service';
import { TokenService } from '../services/token.service';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { forkJoin } from 'rxjs';
import { mergeMap, switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-read-reviews',
  templateUrl: './read-reviews.component.html',
  styleUrls: ['./read-reviews.component.css']
})
export class ReadReviewsComponent implements OnInit {
  fetchedReviews: any;


  constructor(private data: FetchReviewsService, private tokenData: TokenService) { }

  ngOnInit(): void {
    // this.http.get<any>().subscribe(response => {
    //   this.fetchedReviews = response;
        
    this.data.fetchReviews().subscribe((response : any) => {
      this.fetchedReviews = response;
      console.log(response)
    })
  }
        

        // this.tokenData.fetchToken().subscribe((response: any) => {
        // this.fetchedReviews = response;

        // localStorage.setItem("data", this.fetchedReviews.token)
        
        
        // console.log(this.fetchedReviews.token)
        // const observable = forkJoin([
        //   this.tokenData.fetchToken,
          
        // ]).subscribe(console.log);

      // };
      
    // })



}
