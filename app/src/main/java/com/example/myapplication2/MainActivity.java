package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQ_CODE = 123;
    private Button mLoginButton;
    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private TextView mTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        mLoginButton = (Button)findViewById(R.id.loginbutton);
        mTitleTextView = (TextView)findViewById(R.id.titletextview);
        mUsernameEditText = (EditText)findViewById(R.id.usernameedittext);
        mPasswordEditText = (EditText)findViewById(R.id.passwordedittext);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goMain2();

            }
        });
    }

    private void goMain2() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("Username",mUsernameEditText.getText().toString());
        intent.putExtra("Password",mPasswordEditText.getText().toString());
        mUsernameEditText.setText("");
        mPasswordEditText.setText("");
        startActivityForResult(intent,REQ_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent intent){
        if(requestCode == REQ_CODE){
            String data = intent.getStringExtra("result");
            if(data.equals("")){

            }else {
                mTitleTextView.setText("Calculate 34 * 25 = "+data);
                Toast.makeText(MainActivity.this,"你的计算结果为："+data,Toast.LENGTH_LONG).show();
            }
        }
    }
}
