import { Component, OnInit } from '@angular/core';
import {Product} from "../products/product";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  newProduct: Product = {
    type: '',
    title: '',
    description: '',
    price: '',
    brand: '',
    size: '',
    category: ''
  }
  productArray: any[] = [];

  unsuscribeProduct(): void {
    const product = {...this.newProduct};
    this.productArray.push(product);
    console.log(this.productArray);
  }



}
