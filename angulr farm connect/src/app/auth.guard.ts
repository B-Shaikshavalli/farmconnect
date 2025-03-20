import { CanActivateFn } from '@angular/router';
import { FormconService } from './formcon.service';
import { inject } from '@angular/core';

export const authGuard: CanActivateFn = (route, state) => {
  
  return  true;   
};
