import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IntroductionContentComponent } from './introduction-content.component';

describe('IntroductionContentComponent', () => {
  let component: IntroductionContentComponent;
  let fixture: ComponentFixture<IntroductionContentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IntroductionContentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IntroductionContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
