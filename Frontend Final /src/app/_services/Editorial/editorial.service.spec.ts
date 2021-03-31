import { TestBed } from '@angular/core/testing';

import { EditorialService } from './editorial.service';

describe('EditorialService', () => {
  let service: EditorialService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EditorialService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
