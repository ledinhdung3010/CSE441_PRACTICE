package com.example.ex02;

import android.os.Bundle;
import android.view.View;  // Import cần thiết cho View
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Subactivity extends AppCompatActivity {
    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);

        // Ánh xạ nút btnok
        btnok = findViewById(R.id.btnok);

        // Xử lý sự kiện khi nhấn nút
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Thực hiện kết thúc Activity khi nhấn nút
                finish();
            }
        });
    }
}
