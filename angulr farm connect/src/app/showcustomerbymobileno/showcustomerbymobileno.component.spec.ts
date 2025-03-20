import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowcustomerbymobilenoComponent } from './showcustomerbymobileno.component';

describe('ShowcustomerbymobilenoComponent', () => {
  let component: ShowcustomerbymobilenoComponent;
  let fixture: ComponentFixture<ShowcustomerbymobilenoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ShowcustomerbymobilenoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowcustomerbymobilenoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
