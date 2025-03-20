import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ProductsComponent } from './products/products.component';
import { ShowcustomersComponent } from './showcustomers/showcustomers.component';
import { ShowcustomerbymobilenoComponent } from './showcustomerbymobileno/showcustomerbymobileno.component';
import { authGuard } from './auth.guard';
import { RegisterComponent } from './register/register.component';
import { LogoutComponent } from './logout/logout.component';
import { CartComponent } from './cart/cart.component';
import { HomepageComponent } from './homepage/homepage.component';
import { FarmerLoginComponent } from './farmer-login/farmer-login.component';
import { ViewproductsComponent } from './viewproducts/viewproducts.component';
import { FarmerRegisterComponent } from './farmer-register/farmer-register.component';
import { AddproductComponent } from './addproduct/addproduct.component';

const routes: Routes = [
  {path:'',component:HomepageComponent},
  {path:'login',component:LoginComponent},
  {path:'farmer-login',component:FarmerLoginComponent},
  {path:'register',canActivate:[authGuard],component:RegisterComponent},
  {path:'farmer-register',component:FarmerRegisterComponent},
  {path:'addproduct',component:AddproductComponent},
  {path:'viewproducts',component:ViewproductsComponent},
  {path:'products',canActivate:[authGuard],component:ProductsComponent},
  {path:'showcusts',canActivate:[authGuard],component:ShowcustomersComponent},
  {path:'showcustbymobile',canActivate:[authGuard],component:ShowcustomerbymobilenoComponent},
  {path:'cart',component:CartComponent},
  {path:'logout',component:HomepageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
