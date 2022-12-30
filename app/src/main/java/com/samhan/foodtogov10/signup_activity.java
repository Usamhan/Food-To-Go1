package com.samhan.foodtogov10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup_activity extends AppCompatActivity {

    EditText edtTxt_signup_mail,edtTxt_signup_pass,edtTxt_signup_username;
    Button btn_SignUp;
    TextView txt_GotoLogInPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edtTxt_signup_mail=findViewById(R.id.edtTxt_signup_mail);
        edtTxt_signup_pass=findViewById(R.id.edtTxt_signup_pass);
        edtTxt_signup_username=findViewById(R.id.edtTxt_username);

        txt_GotoLogInPage=findViewById(R.id.txt_GotoLogInPage);

    }
}