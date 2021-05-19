package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButtion;
    private Button mBtnCheckBox;
    private Button mBtnImageVew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRadioButtion = findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageVew = findViewById(R.id.btn_imageview);
        setListeners();
    }
    private void setListeners(){
        Onclik onclik= new Onclik();
        mBtnTextView.setOnClickListener(onclik);
        mBtnButton.setOnClickListener(onclik);
        mBtnEditText.setOnClickListener(onclik);
        mBtnRadioButtion.setOnClickListener(onclik);
        mBtnCheckBox.setOnClickListener(onclik);
        mBtnImageVew.setOnClickListener(onclik);
    }
    private class Onclik implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_textview:
                    //跳转到TextViewActivity
                    intent =new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    //跳转到Button演示界面
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    //跳转到EditText演示界面
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    //跳转到RadioButton演示界面
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    //跳转到CheckBox演示界面
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    //跳转到ImageView演示界面
                    intent = new Intent(MainActivity.this,ImgViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}