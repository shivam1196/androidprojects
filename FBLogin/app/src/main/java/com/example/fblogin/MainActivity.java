package com.example.fblogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    LoginButton login_Button;
    CallbackManager callbackManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        initalizeControls();
        LoginFB();

    }

    private void initalizeControls()
    {
        callbackManager = CallbackManager.Factory.create();
        textView=(TextView)findViewById(R.id.textView);
        login_Button=(com.facebook.login.widget.LoginButton)findViewById(R.id.login_button);
    }

    private void LoginFB()
    {
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
               // textView.setText("Login Successful: "+loginResult.getAccessToken());

                Intent intent = new Intent(getApplicationContext(),MainMenu.class);
                startActivity(intent);
            }

            @Override
            public void onCancel() {
                textView.setText("Login cancelled");
            }

            @Override
            public void onError(FacebookException error) {
                textView.setText("Error occured "+error.getMessage());
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
