import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../create-user/user";
import {UserComponent} from "../create-user/user.component";

@Component({
  selector: 'app-list-all-users',
  templateUrl: './list-all-users.component.html',
  styleUrls: ['./list-all-users.component.css']
})
export class ListAllUsersComponent implements OnInit {

  constructor(private httpClient: HttpClient) { }

  users: User[] = [];

  ngOnInit(): void {
    this.httpClient
      .get<User[]>('http://localhost:8080/user')
      .subscribe(responseBody=>
      {
        this.users = responseBody;

      })
  }

}
