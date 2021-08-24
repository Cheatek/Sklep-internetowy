import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Product} from "./product";
import {Category} from "../category/category";


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
  };

  categories: Category[] = [];
  ngOnInit(): void {
    this.httpClient
      .get<Category[]>('http://localhost:8080/getAllCategories')
      .subscribe(response=> this.categories = response);
  }
  onSubmit(): void {
    this.httpClient
      .post<Product>('http://localhost:8080/addProduct', this.product)
      .subscribe(response=> console.log(response));
  }

}
