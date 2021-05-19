package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImgViewActivity extends AppCompatActivity {
    private ImageView mIv4;
    private String imgUrl = "http://img.netbian.com/file/2021/0312/021b2748efe5bcdebfb828083b6747f4.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_view);
        mIv4 = findViewById(R.id.iv_4);
        Glide.with(getApplicationContext()).load(imgUrl).into(mIv4);
    }
}