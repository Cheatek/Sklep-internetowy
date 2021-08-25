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
    console.log('Zatwierdzono formularz. Kategoria zapisana na serwerze:');
    this.httpClient
      .post<Category>('http://localhost:8080/addCategory', this.category)
      .subscribe(response=> console.log(response), responseErrors=>{
        this.validationErrors=responseErrors.error;
        console.log(responseErrors.error);
      });
  }
}
