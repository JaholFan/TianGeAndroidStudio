package com.example.helloworld;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;
    private TextView mTxt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn3 = findViewById(R.id.btn_3);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "按钮3被点击", Toast.LENGTH_SHORT).show();
            }
        });

        mTxt1 = findViewById(R.id.txt1);
        mTxt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"文字1被点击",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this, "按钮4被点击", Toast.LENGTH_SHORT).show();
    }
}