import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PedirlibroComponent } from './pedirlibro.component';

describe('PedirlibroComponent', () => {
  let component: PedirlibroComponent;
  let fixture: ComponentFixture<PedirlibroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PedirlibroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PedirlibroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
