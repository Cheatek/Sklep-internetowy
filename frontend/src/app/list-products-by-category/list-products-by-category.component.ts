import {Component, Input, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Product} from "../products/product";
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-list-products-by-category',
  templateUrl: './list-products-by-category.component.html',
  styleUrls: ['./list-products-by-category.component.css']
})
export class ListProductsByCategoryComponent implements OnInit {

  id: string | null = '0';
  constructor(private httpClient: HttpClient, private activatedroute:ActivatedRoute) {}

  productArray: Product[] = [];

  ngOnInit(): void {
    this.activatedroute.paramMap.subscribe(params => {
      this.id = params.get('id');
      console.log(params);
      console.log(this.id);
      this.httpClient
        .get<Product[]>('http://localhost:8080/product/category/' + this.id)
        .subscribe(responseBody => {
          this.productArray = responseBody;
          console.log(responseBody)
        })
    });


  }

}
