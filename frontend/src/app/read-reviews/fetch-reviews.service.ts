import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FetchReviewsService {

  fetchedReviewsCall: any;
  constructor(private http: HttpClient) { }

  fetchReviews() {
    this.fetchedReviewsCall = this.http.get<any>("http://localhost:8080/");
    return this.fetchedReviewsCall;
  }
}
