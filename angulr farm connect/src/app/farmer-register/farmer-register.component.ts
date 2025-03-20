import { Component } from '@angular/core';
import { FormconService } from '../formcon.service';

@Component({
  selector: 'app-farmer-register',
  standalone: false,
  templateUrl: './farmer-register.component.html',
  styleUrl: './farmer-register.component.css'
})
export class FarmerRegisterComponent {

  countries: any;
  farmer: any;

  constructor(private service: FormconService) {
    this.farmer = {
      "farmerName": "",
      "farmerEmailId": "",
      "address": "",
      "country": "",
      "farmerMobile": "",
      "farmerPassword": ""
    };
  }

  ngOnInit() {
    this.service.getAllCountries().subscribe((data: any) => { 
      this.countries = data; 
    });
  }

  registerSubmit() {
    this.service.registerFarmer(this.farmer).subscribe((data: any) => {
      console.log(data);
      alert("Farmer Registered Successfully");
    });
  }
}

