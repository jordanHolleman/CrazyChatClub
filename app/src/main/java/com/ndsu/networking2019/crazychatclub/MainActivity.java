package com.ndsu.networking2019.crazychatclub;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username, password, newUsername, newPassword, confirmPassword;

    EditText usernameInput, passwordInput, newUsernameInput, newPasswordInput, confirmPasswordInput;

    Button loginButton, createAccountButton;

    Image profilePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = (EditText) findViewById(R.id.usernameInput);
        passwordInput = (EditText) findViewById(R.id.passwordInput);
        newUsernameInput = (EditText) findViewById(R.id.newUsernameInput);
        newPasswordInput = (EditText) findViewById(R.id.newPasswordInput);
        loginButton = (Button) findViewById(R.id.loginButton);
        createAccountButton = (Button) findViewById(R.id.createAccountButton);
        //profilePic = (Image) findViewById(R.id.profilePic);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = usernameInput.getText().toString();
                password = passwordInput.getText().toString();
            }
        });

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newUsername = newUsernameInput.getText().toString();
                newPassword = newPasswordInput.getText().toString();
                confirmPassword = confirmPasswordInput.getText().toString();
                if (checkPassword(newPassword, confirmPassword)) {
                    Toast.makeText(MainActivity.this, "Account creation successful", Toast.LENGTH_SHORT);
                }
            }
        });
    }

    //checking passwords, probably will change to exception handler later
    private boolean checkPassword(String newPassword, String confirmPassword) {
        if (newPassword != confirmPassword) {
            Toast.makeText(MainActivity.this,"Passwords don't match, try again", Toast.LENGTH_SHORT);
            //JOptionPane.showMessageDialog("Passwords do not match, try again");
            this.newPassword = "";
            this.confirmPassword = "";
            return false;
        }
        return true;
    }
}
