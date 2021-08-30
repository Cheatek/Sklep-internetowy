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
import {RouterModule, Routes} from "@angular/router";
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatCardModule} from "@angular/material/card";
import {MatButtonModule} from "@angular/material/button";
import {MatGridListModule} from "@angular/material/grid-list";
import { ListProductsByCategoryComponent } from './list-products-by-category/list-products-by-category.component';

const routes: Routes = [{
  path: 'productList',
  component: ProductListComponent
},{
  path: 'createUser',
  component: UserComponent
},{
  path: 'createCategory',
  component: CategoryComponent
},{
  path: 'createProduct',
  component: ProductsComponent
}
  ,{
    path: 'listProductsByCategory/:id',
    component: ListProductsByCategoryComponent
  }
]
@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    ProductsComponent,
    CategoryComponent,
    ListAllUsersComponent,
    ListAllCategoriesComponent,
    ProductListComponent,
    ListProductsByCategoryComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    BrowserAnimationsModule,
    MatCardModule,
    MatButtonModule,
    MatGridListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
