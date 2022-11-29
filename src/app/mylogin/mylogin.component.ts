import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-mylogin',
  templateUrl: './mylogin.component.html',
  styleUrls: ['./mylogin.component.css']
})
export class MyloginComponent implements OnInit {
loginData:any={
  username:'',
  password:'',
}
user:any=[
  {
   username:'Mukul',
   password:'1234567'
  }
];

  constructor(private snack:MatSnackBar) { }

  ngOnInit(): void {
  }
  formSubmit(){
    if(this.loginData.username.trim()=='' || this.loginData.username==null){
      this.snack.open('UserName is required !!','ok',{
        duration:3000,
        verticalPosition:'top',
        // horizontalPosition:'right',
      });
      return;
    }
    if(this.loginData.password.trim()=='' || this.loginData.password==null){
      this.snack.open('Password is required !!','ok',{
        duration:3000,
        verticalPosition:'top',
        // horizontalPosition:'right',
        
      
      });
      return;
    }
     if(this.loginData.username.trim()!=this.user.username.trim()){
      this.snack.open('Invalid Username','ok',{
        duration:3000,
        verticalPosition:'top',
        // horizontalPosition:'right',
      });
      return;
     }else{
      alert("Sucessfull login")
     }

}
}
