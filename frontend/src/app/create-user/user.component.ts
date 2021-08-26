import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import {User} from "./user";
import {Address} from "./address";

@Component({
  selector: 'app-create-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private httpClient: HttpClient) { }
  address: Address = {country: '', postalCode: '', houseNumber: '', street: ''};
  user: User = {email: '', password: '', address: this.address};
  ngOnInit(): void {
  }
  validationErrors: any = null;
   onSubmit(): void {
    this.httpClient
      .post<User>('http://localhost:8080/user', this.user)
      .subscribe(response=> {
        console.log(response);
        this.user.email = '';
        this.user.password = '';
        this.user.address.country = '';
        this.user.address.street = '';
        this.user.address.houseNumber = '';
        this.user.address.postalCode = '';
      },
      responseErrors=>{
        this.validationErrors=responseErrors.error;
        console.log(responseErrors.error);
      });


  }

}
