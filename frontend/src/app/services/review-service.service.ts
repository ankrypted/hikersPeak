import { Injectable } from '@angular/core';
import { Review } from '../interfaces/reviews-interface';
import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ReviewServiceService {

  url: string = "http://localhost:8080/saveReview";



  headerDict = {
    'Content-Type': 'application/json',
    'Accept': 'application/json',
    'Access-Control-Allow-Headers': 'Content-Type',
    'Authorization': 'Basic ' + btoa('admin:admin')
  }
  
  requestOptions = {                                                                                                                                                                                 
    headers: new HttpHeaders(this.headerDict), 
  };


  constructor(private http: HttpClient) { }

  postReview(review: Review) {
    this.http.post<any>(this.url, review, this.requestOptions).subscribe(response => {
      console.log(response);
    })
  }
}
