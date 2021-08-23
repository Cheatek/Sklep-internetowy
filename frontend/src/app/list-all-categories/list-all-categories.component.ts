import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Category} from "../category/category";


@Component({
  selector: 'app-list-all-categories',
  templateUrl: './list-all-categories.component.html',
  styleUrls: ['./list-all-categories.component.css']
})
export class ListAllCategoriesComponent implements OnInit {

  constructor(private httpClient: HttpClient) { }

  categories: Category[] = [];
  ngOnInit(): void {
    this.httpClient
      .get<Category[]>('http://localhost:8080/getAllCategories')
      .subscribe(responseBody=>
      {
        this.categories = responseBody;

      })
  }

}
