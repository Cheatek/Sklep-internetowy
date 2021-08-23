import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Product} from "./product";


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html'
})
export class ProductsComponent implements OnInit {

  constructor(private httpClient:HttpClient) { }

  product: Product = {
    type: '',
    title: '',
    description: '',
    price: '',
    brand: '',
    size: '',
    category: ''
  }

  ngOnInit(): void {
  }
  onSubmit(): void {
    this.httpClient
      .post<Product>('http://localhost:8080/addProduct', this.product)
      .subscribe(response=> console.log(response))
  }

}
