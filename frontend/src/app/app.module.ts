import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UserComponent } from './create-user/user.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {ProductsComponent} from "./products/products.component";
import {CategoryComponent} from "./category/category.component";
import {ListAllUsersComponent} from "./list-all-users/list-all-users.component";

@NgModule({
    declarations: [
        AppComponent,
        UserComponent,
        ProductsComponent,
        CategoryComponent,
        ListAllUsersComponent
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
