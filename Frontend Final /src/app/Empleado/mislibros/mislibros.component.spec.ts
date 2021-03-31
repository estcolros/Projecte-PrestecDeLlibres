import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MislibrosComponent } from './mislibros.component';

describe('MislibrosComponent', () => {
  let component: MislibrosComponent;
  let fixture: ComponentFixture<MislibrosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MislibrosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MislibrosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
