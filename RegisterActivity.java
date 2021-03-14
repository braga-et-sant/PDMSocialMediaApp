package com.example.bluetoothexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {


    Button createBtn;
    EditText nameField, passField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activity);

        createBtn = (Button)findViewById(R.id.createBtn);
        nameField = (EditText)findViewById(R.id.usernameBox);
        passField = (EditText)findViewById(R.id.passwordBox);



        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("INFO: ", "Credentials:\n Login: " + nameField.getText().toString());
                Log.v("INFO: ", "Credentials:\n Pass: " + passField.getText().toString());
                if(nameField.getText().toString().equals("admin") && passField.getText().toString().equals("admin")) {
                    //showToast("Correct! You may now login");
                }else{
                    //showToast("Credentials not found. Try again");
                }
            }
        });

    }
    @Override
    public void onBackPressed(){
        finish();
    }
}