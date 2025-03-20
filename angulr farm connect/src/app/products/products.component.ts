import { Component, OnInit } from '@angular/core';
import { FormconService } from '../formcon.service';


@Component({
  selector: 'app-products',
  standalone: false,
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent implements OnInit{
  
  products: any;

  constructor(private service : FormconService) {

     
  }
  ngOnInit(): void {
    this.service.getproduct().subscribe((data : any) => {(this.products = data)});
  }

  addtocart(product: any) {
    console.log(product);
    this.service.addToCart(product);
    alert("Add to cart")
  }
}
