import { HttpClient, HttpHeaders } from '@angular/common/http'; 
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FetchReviewsService {
  
  fetchedReviewsCall: any;
  constructor(private http: HttpClient) {}


  fetchReviews() {
    let headers = new HttpHeaders();
    // headers = headers.set("Authorization", "Bearer")
    this.fetchedReviewsCall = this.http.get<any>("http://localhost:8080/getReviews");
    return this.fetchedReviewsCall;
  }
}
