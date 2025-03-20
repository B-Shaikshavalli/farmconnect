import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './header/header.component';
import { ProductsComponent } from './products/products.component';

import { ShowcustomersComponent } from './showcustomers/showcustomers.component';
import { ShowcustomerbymobilenoComponent } from './showcustomerbymobileno/showcustomerbymobileno.component';
import { LogoutComponent } from './logout/logout.component';
import { HomepageComponent } from './homepage/homepage.component';
import { CartComponent } from './cart/cart.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { AboutComponent } from './about/about.component';
import { ServicesComponent } from './services/services.component';
import { ContactComponent } from './contact/contact.component';
import { FarmerLoginComponent } from './farmer-login/farmer-login.component';
import { FarmerRegisterComponent } from './farmer-register/farmer-register.component';
import { FarmerProductComponent } from './farmer-product/farmer-product.component';
import { ViewproductsComponent } from './viewproducts/viewproducts.component';




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HeaderComponent,
    ProductsComponent,
    ShowcustomersComponent,
    ShowcustomerbymobilenoComponent,
    LogoutComponent,
    HomepageComponent,
    CartComponent,
    AddproductComponent,
    AboutComponent,
    ServicesComponent,
    ContactComponent,
    FarmerLoginComponent,
    FarmerRegisterComponent,
    FarmerProductComponent,
    ViewproductsComponent,

   
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
