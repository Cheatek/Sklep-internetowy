import {Category} from "../category/category";

export interface Product{

  type: String;
  title: String;
  description: String;
  price: number;
  brand: String;
  size: String;
  category: Category;
}
