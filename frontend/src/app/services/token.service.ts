import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class TokenService {
  
  fetchedTokenCall: any;

  constructor(private http: HttpClient) { }

  // httpOptions = new HttpHeaders({'Content-Type':'application/json; charset=utf-8'})
  


  fetchToken() {
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Basic ' + btoa('User:password'))
    this.fetchedTokenCall = this.http.get<any>("http://localhost:8080/token", {headers})
    // localStorage.setItem('data', this.fetchedTokenCall.token);
    return this.fetchedTokenCall;
  }
}
