import { Component, OnInit } from '@angular/core';

import { LoginService } from '../login.service';

@Component({
  selector: 'login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  private name: string;
  private pass: string;

  constructor(private loginService: LoginService) { }

  ngOnInit() {
  }

  login() {
    this.loginService.login(this.name, this.pass)
      .subscribe( data => {
        console.log('logged in');
        window.location.href = "/";
      }, error => {
        console.error("error");
      });
  }


}
