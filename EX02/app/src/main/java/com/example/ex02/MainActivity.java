package com.example.ex02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btncall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hiển thị thông báo khi onCreate được gọi
        Toast.makeText(this, "CR424 - onCreate()", Toast.LENGTH_SHORT).show();

        // Ánh xạ nút btncall
        btncall = findViewById(R.id.btncall);

        // Xử lý sự kiện khi người dùng nhấn nút btncall
        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hiển thị thông báo khi nút được nhấn
                Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();

                // Tạo một intent để chuyển sang subactivity
                Intent intent1 = new Intent(MainActivity.this, Subactivity.class);
                startActivity(intent1);
            }
        });
    }
}
