import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfillibroComponent } from './perfillibro.component';

describe('PerfillibroComponent', () => {
  let component: PerfillibroComponent;
  let fixture: ComponentFixture<PerfillibroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PerfillibroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfillibroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
