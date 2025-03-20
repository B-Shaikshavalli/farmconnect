import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormconService } from '../formcon.service';

@Component({
  selector: 'app-farmer-login',
  standalone: false,
  templateUrl: './farmer-login.component.html',
  styleUrl: './farmer-login.component.css'
})
export class FarmerLoginComponent {

  farmers: any;
  farmer: any;

  constructor(private router: Router, private service: FormconService) {}

  async loginSubmit(loginForm: any) {
    console.log(loginForm);

    localStorage.setItem("farmerName", loginForm.farmerEmailId);

    if (loginForm.farmerEmailId == "FarmConnectAdmin" && loginForm.farmerPassword == "123456") { 
      this.service.setFarmerLogin();
      this.router.navigate(['farmer-dashboard']);
      alert("Admin login successful");
    } else {    
      await this.service.farmerLogin(loginForm).then((data: any) => {
        this.farmer = data;
        console.log(data);
      });

      if (this.farmer != null) {
        this.service.setFarmerLogin(); 
        this.router.navigate(['addproduct'])
        alert("Login Successful");
      } else {
        alert('Invalid Credentials');
      }
    }
  }
}

