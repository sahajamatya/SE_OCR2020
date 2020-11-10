package com.example.nutrobud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.nutrobud.DashActivity;
import com.example.nutrobud.R;
import com.example.nutrobud.ui.home.User;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    EditText EmailText, PasswordText;
    Button loginbtn, signupbtn;
    ProgressBar progressbar;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //This user variable will be passed through the sign up activities to store all data if needed
        final User user = new User();

        EmailText = findViewById(R.id.email);
        PasswordText = findViewById(R.id.password);
        loginbtn = findViewById(R.id.LoginBtn);
        signupbtn = findViewById(R.id.SignUpBtn);

        fAuth = FirebaseAuth.getInstance();
        progressbar = findViewById(R.id.progressBar);

        //If there is already a user active through authenticator, they will be automatically logged in
        if(fAuth.getCurrentUser() != null)
            startActivity(new Intent(getApplicationContext(), DashActivity.class));

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = EmailText.getText().toString().trim();
                String Password = PasswordText.getText().toString().trim();

                //Check if email is empty
                if (TextUtils.isEmpty(Email)) {
                    EmailText.setError("Email is required");
                    return;
                }

                //Check if password is empty
                if (TextUtils.isEmpty(Password)) {
                    PasswordText.setError("Password is required");
                    return;
                }

                //Connect Firebase Authenicator here to check the email and password using .getText()
                //Hardcoding until then to prove working...
                if (Email.equals("NutroBud") && Password.equals("123456")) {
                    Toast.makeText(Login.this, "Log in Successful!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), DashActivity.class));
                } else {
                    Toast.makeText(Login.this, "Your email or password is incorrect", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(getApplicationContext(), DashActivity.class));
                }
            }
        });

        signupbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Pass intent so user goes as well
                Intent i = new Intent(getApplicationContext(), SignUpLoginInfo.class);
                i.putExtra("User", user);
                startActivity(i);
            }
        });
    }
}
