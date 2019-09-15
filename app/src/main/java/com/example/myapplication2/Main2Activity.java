package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private int ez = 0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button buttonjia;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button buttonjian;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttoncheng;
    private Button button0;
    private Button buttondian;
    private Button buttonC;
    private Button buttonchu;
    private Button buttonsub;

    private TextView editText;

    private String result = "";
    private String finalresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = (TextView)findViewById(R.id.textview3);

        ButtonInit();
        setButtonListener();
        init();

    }

    private void init() {
        Intent intent = getIntent();
        final String username = intent.getStringExtra("Username");
        final String password = intent.getStringExtra("Password");
        finalresult = editText.getText().toString();
        if (username.equals("lmb")&&password.equals("hsq")) {
            Toast.makeText(Main2Activity.this,"登陆成功",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(Main2Activity.this,"用户名或密码错误！",Toast.LENGTH_LONG).show();
            myfinish("1234");
        }
    }

    private void ButtonInit() {
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonjia = (Button)findViewById(R.id.buttonjia);
        buttonjian = (Button)findViewById(R.id.buttonjian);
        buttoncheng = (Button)findViewById(R.id.buttoncheng);
        buttonchu = (Button)findViewById(R.id.buttonchu);
        buttondian = (Button)findViewById(R.id.buttondian);
        buttonC = (Button)findViewById(R.id.buttonC);
        buttonsub = (Button)findViewById(R.id.buttonsub);
    }

    private void setButtonListener() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "1";
                editText.setText(result);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "2";
                editText.setText(result);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "3";
                editText.setText(result);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "4";
                editText.setText(result);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "5";
                editText.setText(result);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "6";
                editText.setText(result);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "7";
                editText.setText(result);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "8";
                editText.setText(result);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "9";
                editText.setText(result);
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = result + "0";
                editText.setText(result);
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "";
                editText.setText(result);
            }
        });
        buttonjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"sorry,该功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttonjian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"sorry,该功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttoncheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"sorry,该功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttonchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"sorry,该功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttondian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this,"sorry,该功能暂未实现",Toast.LENGTH_SHORT).show();
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ();
                intent.putExtra("result",result);
                setResult(RESULT_OK,intent);
                myfinish("9876");
            }
        });
    }

    private void myfinish(String data){
        if(data == "9876"){
            finish();
        }else{
            Intent intent = new Intent ();
            intent.putExtra("result","");
            setResult(RESULT_OK,intent);
            finish();
        }
    }
    @Override
    public void onBackPressed(){
        myfinish("1234");
    }

}
