import { Component, OnInit } from '@angular/core';
import { FormconService } from '../formcon.service';

@Component({
  selector: 'app-addproduct',
  standalone: false,
  templateUrl: './addproduct.component.html',
  styleUrl: './addproduct.component.css'
})
export class AddproductComponent implements OnInit{

  prod: any;
  farmer:any;
    
    constructor(private service:FormconService) {

      this.prod = {
            "farmerEmailId":"",
            "name": "",
            "category": "",
            "price": "",
            "quantity": "",
            "imgUrl": ""
      }
    }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
    
  }

   addproduct(){
    this.service.addproducts(this.prod).subscribe((data:any) => {
      console.log(data);
    });

  }


}
