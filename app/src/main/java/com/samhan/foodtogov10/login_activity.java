package com.samhan.foodtogov10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login_activity extends AppCompatActivity {
    EditText edtTxt_login_mail,edtTxt_login_pass;
    Button btn_LogIn;
    TextView txt_GotoSignUpPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtTxt_login_mail=findViewById(R.id.edtTxt_login_mail);
        edtTxt_login_pass=findViewById(R.id.edtTxt_login_pass);
        btn_LogIn=findViewById(R.id.btn_LogIn);
        txt_GotoSignUpPage=findViewById(R.id.txt_GotoSignUpPage);


        txt_GotoSignUpPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),signup_activity.class);
                startActivity(intent);
            }
        });
    }
}