import { TestBed } from '@angular/core/testing';

import { AutorService } from './Autor.service';

describe('ServiceService', () => {
  let service: AutorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AutorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
