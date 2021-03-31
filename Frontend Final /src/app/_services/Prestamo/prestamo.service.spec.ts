import { TestBed } from '@angular/core/testing';

import { PrestamoService } from './prestamo.service';

describe('PrestamoService', () => {
  let service: PrestamoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PrestamoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
