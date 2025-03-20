import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FormconService {
  loginInfo: any;
  farmerLoginInfo: any;
  cartItems: any;
  userLogin: boolean;
  farmLogin: boolean;



  constructor(private http: HttpClient) { 
    this.userLogin = false;
    this.farmLogin = false;
    this.cartItems = [];
    //Login Information
    this.loginInfo = new Subject();
    this.farmerLoginInfo = new Subject();
  }
  setCustomerLogin() {
    this.userLogin = true;
    //Login Information
    this.loginInfo.next(true);
  }
  setCustomerLogout() {
    this.userLogin = false;
     //Login Information
     this.loginInfo.next(false);
  }
  //Login Information
  getLoginInfo(): any {
    return this.loginInfo.asObservable();
  }
  getLoginStatus(): boolean {
    return this.userLogin;
  }
  setFarmerLogin() {
    this.farmLogin = true;
    // Farmer Login Information
    this.farmerLoginInfo.next(true);
}

setFarmerLogout() {
    this.farmLogin = false;
    // Farmer Logout Information
    this.farmerLoginInfo.next(false);
}

// Farmer Login Information
getFarmerLoginInfo(): any {
    return this.farmerLoginInfo.asObservable();
}

getFarmerLoginStatus(): boolean {
    return this.farmLogin;
}




    addToCart(product: any) {
    this.cartItems.push(product);
    }


  
    getAllCountries(): any {
      return this.http.get('https://restcountries.com/v3.1/all');
    }
  
    registerCustomer(cust: any): any{
      return this.http.post('http://localhost:8086/addCustomer', cust);
    }

    custLogin(cust: any) {
      return this.http.post('http://localhost:8086/custLogin', cust).toPromise();
    }
    addproducts(prod : any): any {
      return this.http.post('http://localhost:8086/addProduct',prod);
    }
    getproduct(){
      return this.http.get('http://localhost:8086/getProducts')
    }
    registerFarmer(farmer: any): any{
      return this.http.post('http://localhost:8086/addFarmer', farmer);
    }
    farmerLogin(farmer: any) {
      return this.http.post('http://localhost:8086/farmerLogin', farmer).toPromise();
     }

     deleteproductById(id:any){
      return this.http.get('http://localhost:8086/deleteProductById'+id)
     }

     getproductById(id: any) {
      return this.http.get('http://localhost:8086/getProductById/' + id);
    }
  
    getprodbyname(){
      return this.http.get('http://localhost:8086/getProductByName');
    }

    getemailbyid(){
      
    }
  
  
}
