import { Component } from '@angular/core';
import { FormconService } from '../formcon.service';


@Component({
  selector: 'app-cart',
  standalone: false,
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.css'
})
export class CartComponent {

  cartItems: any;
  emailId: any;
  total: number;

  constructor(private service : FormconService) {
    this.total = 0; 
    this.cartItems = service.cartItems;
    for (let product of this.cartItems) {
      this.total += product.price;
    }
  }

  removeCartItem(product: any) {
    alert("Delete Cart Item.");
    const i = this.cartItems.findIndex((prod: any) => {
      return product.prodId == prod.prodId;
    });
    this.cartItems.splice(i, 1);
    this.total -= product.price;
  }

  BuyNow(){
    this.total = 0;
    this.cartItems.splice(0, this.cartItems.length); 
    alert("Thank You For Purchasing From Our WebSite");
  }

}
