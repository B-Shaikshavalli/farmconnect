import { TestBed } from '@angular/core/testing';

import { FormconService } from './formcon.service';

describe('FormconService', () => {
  let service: FormconService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FormconService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
