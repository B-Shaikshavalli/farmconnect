import { Component, OnInit } from '@angular/core';
import { FormconService } from '../formcon.service';

@Component({
  selector: 'app-register',
  standalone: false,
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent implements OnInit {

  countries: any;
  cust: any;
  
  constructor(private service:FormconService) {
  
 

    this.cust = {
      
        
        "customerName":"",
        "customerEmailId":"",
        "address":"",
        "country":"",
        "customerMobile":"",
        "customerPassword":""
      
      
      }
    }

  ngOnInit() {
    this.service.getAllCountries().subscribe((data: any) => { this.countries = data; });
  }

  registerSubmit() {
    this.service.registerCustomer(this.cust).subscribe((data: any) => {console.log(data)});
  }


}
