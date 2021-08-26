import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Product} from "./product";
import {Category} from "../category/category";


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html'
})
export class ProductsComponent implements OnInit {

  constructor(private httpClient: HttpClient) {
  }

  product: Product = {
    type: '',
    title: '',
    description: '',
    price: 0,
    brand: '',
    size: '',
    category: ''
  };
  validationErrors: any = null;

  categories: Category[] = [];

  ngOnInit(): void {
    this.httpClient
      .get<Category[]>('http://localhost:8080/getAllCategories')
      .subscribe(response => this.categories = response);
  }

  onSubmit(): void {
    console.log('Zatwierdzono formularz. Produkt dodany do listy');
    this.httpClient
      .post<Product>('http://localhost:8080/addProduct', this.product)
      .subscribe(response => console.log(response), responseErrors => {
        this.validationErrors = responseErrors.error;
        console.log(responseErrors.error);

      });

  }

}
