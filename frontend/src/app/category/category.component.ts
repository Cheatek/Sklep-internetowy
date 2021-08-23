import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Category} from "./category";

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  constructor(private httpClient: HttpClient) { }
  category: Category = {name: '', producent: ''};
  ngOnInit(): void {
  }

  onSubmit(): void {
    this.httpClient
      .post<Category>('http://localhost:8080/category', this.category)
      .subscribe(response=> console.log(response))
  }

}
