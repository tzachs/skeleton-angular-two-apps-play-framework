import { Injectable } from '@angular/core';

import { Http, Headers, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';



@Injectable()
export class LoginService {

  constructor(private http: Http) { }

  login ( user, pass: string ) {
    return this.http.post('/login',
      JSON.stringify({ user: user, pass: pass}))
        .map((response: Response) => {
          let user = response.json();
          if ( user && user.token ) {
            //console.log('logged in');
          }

          return user;
        });

    }

}
