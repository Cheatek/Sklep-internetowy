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
  validationErrors: any = null;
  onSubmit(): void {
    this.httpClient
      .post<Category>('http://localhost:8080/addCategory', this.category)
      .subscribe(response=> {
        console.log(response);
        this.category.name ='';
        this.category.producent='';
      }, responseErrors=>{
        this.validationErrors=responseErrors.error;
        console.log(responseErrors.error);
      });
  }
}
