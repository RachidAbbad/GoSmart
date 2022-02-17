package com.rachid_abbad.gosmart.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rachid_abbad.gosmart.R;
import com.rachid_abbad.gosmart.utils.StaticData;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameInput, pwdInput;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameInput = findViewById(R.id.username);
        pwdInput = findViewById(R.id.password);
        loginBtn = findViewById(R.id.login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //login(usernameInput.getText().toString(),pwdInput.getText().toString());
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void login(String username, String pass){
        //ToDo Start loading here

        Request request = new Request.Builder()
                .url("urlHere?username=" + username+"&pass="+pass)
                .addHeader("Accept", "application/json")
                .get().build();
        StaticData.client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                //ToDo Display failure message
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}