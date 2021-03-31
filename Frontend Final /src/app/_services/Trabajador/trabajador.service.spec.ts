import { TestBed } from '@angular/core/testing';

import { TrabajadorService } from './trabajador.service';

describe('TrabajadorService', () => {
  let service: TrabajadorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TrabajadorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
