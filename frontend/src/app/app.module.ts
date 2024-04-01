import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { NavBarComponent } from './home-page/nav-bar/nav-bar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
import { IntroductionContentComponent } from './home-page/introduction-content/introduction-content.component';
import { CreateReviewComponent } from './create-review/create-review.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
// import {provideNativeDateAdapter} from '@angular/material/core';
import {MatIconModule} from '@angular/material/icon';
import {MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { ReadReviewsComponent } from './read-reviews/read-reviews.component';
import { HttpClientModule } from '@angular/common/http';

const appRoute: Routes = [
    {
      path: 'home', component: HomePageComponent,
    },
    {
      path: 'createReview', component: CreateReviewComponent
    },
    {
      path: 'readReviews', component: ReadReviewsComponent
    }
]

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    NavBarComponent,
    IntroductionContentComponent,
    CreateReviewComponent,
    ReadReviewsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatFormFieldModule, 
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatIconModule,
    HttpClientModule,
    RouterModule.forRoot(appRoute)
  ],
  providers: [
    MatDatepickerModule,
    MatNativeDateModule,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
