import { Component, OnInit, Input } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Product} from "../products/product";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  id: string | null = '0';

  constructor(private httpClient: HttpClient,private activatedRoute:ActivatedRoute) { }
  productArray: Product[] = [];

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(params =>{
      this.id = params.get('id');
      console.log(params);
      console.log(this.id);
      this.httpClient.get<Product[]>('http://localhost:8080/getAllProducts/'+ this.id)
        .subscribe(responseBody =>{
          this.productArray = responseBody;
          console.log(responseBody);
        })
      })
  }

}
