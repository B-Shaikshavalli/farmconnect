import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormconService } from '../formcon.service';

@Component({
  selector: 'app-logout',
  standalone: false,
  templateUrl: './logout.component.html',
  styleUrl: './logout.component.css'
})
export class LogoutComponent {

  constructor(private router: Router, private service: FormconService) {

  
    this.service.setCustomerLogout();

    localStorage.removeItem("emailId");
    localStorage.clear();

    this.router.navigate(['login']);
}

}