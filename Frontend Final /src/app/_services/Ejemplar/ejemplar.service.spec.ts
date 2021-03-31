import { TestBed } from '@angular/core/testing';

import { EjemplarService } from './ejemplar.service';

describe('EjemplarService', () => {
  let service: EjemplarService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EjemplarService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
