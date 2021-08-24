import {Component, OnInit} from '@angular/core';
import {Product} from "../products/product";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  constructor(private httpClient: HttpClient) {
  }

  productArray: Product[] = [];

  ngOnInit(): void {
    this.httpClient
      .get<Product[]>('http://localhost:8080/getAllProducts')
      .subscribe(responseBody => {
        this.productArray = responseBody;
      })
  }


}
