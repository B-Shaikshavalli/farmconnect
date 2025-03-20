import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormconService } from '../formcon.service';

@Component({
  selector: 'app-login',
  standalone: false,
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  customers: any;
  cust: any;

  constructor(private router: Router, private service: FormconService) {
  }

  async loginSubmit(loginForm: any) {
    localStorage.setItem("customerName", loginForm.customerEmailId);

    if (loginForm.customerEmailId == "Formconnet" && loginForm.customerPassword == "123456") { 
      this.service.setCustomerLogin();
      this.router.navigate(['products']);
    } else {    
        
      await this.service.custLogin(loginForm).then((data: any) => {
        this.cust = data;
        console.log(data);
      });

      if (this.cust != null) {
        this.service.setCustomerLogin(); 
        this.router.navigate(['products']);
      } else {
        alert('Invalid Credentials');
      }

    }
  }

  }
  
  


    
  
  



