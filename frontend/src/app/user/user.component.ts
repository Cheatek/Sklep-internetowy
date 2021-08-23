import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute} from "@angular/router";
import {User} from "./user";
import {Address} from "./address";

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private httpClient: HttpClient) { }
  address: Address = {country: '', postalCode: '', houseNumber: '', street: ''};
  user: User = {email: '', password: '', address: this.address};
  ngOnInit(): void {
  }

  onSubmit(): void {
    this.httpClient
      .post<User>('http://localhost:8080/user', this.user)
      .subscribe(response=> console.log(response))
  }

}
