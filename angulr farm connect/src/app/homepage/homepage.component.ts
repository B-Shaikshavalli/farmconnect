import { Component } from '@angular/core';
import { FormconService } from '../formcon.service';

@Component({
  selector: 'app-homepage',
  standalone: false,
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent {

  product:any;

  constructor(private service:FormconService){

  }

  searchbyname(){
    this.service.getprodbyname().subscribe((data:any) => {(this.product = data)});

  }

}
