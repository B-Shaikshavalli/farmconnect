import { Component, OnInit } from '@angular/core';
import { FormconService } from '../formcon.service';

@Component({
  selector: 'app-viewproducts',
  standalone: false,
  templateUrl: './viewproducts.component.html',
  styleUrl: './viewproducts.component.css'
})
export class ViewproductsComponent implements OnInit{

   products: any;
  
    constructor(private service : FormconService) {
  
       
    }
    ngOnInit(): void {
      this.service.getproduct().subscribe((data : any) => {(this.products = data)});
    }


}
