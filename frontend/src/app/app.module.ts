import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UserComponent } from './create-user/user.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {ProductsComponent} from "./products/products.component";
import {CategoryComponent} from "./category/category.component";
import {ListAllCategoriesComponent} from "./list-all-categories/list-all-categories.component";
import {ListAllUsersComponent} from "./list-all-users/list-all-users.component";
import {ProductListComponent} from "./product-list/product-list.component";

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    ProductsComponent,
    CategoryComponent,
    ListAllUsersComponent,
    ListAllCategoriesComponent,
    ProductListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
