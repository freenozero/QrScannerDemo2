package com.example.qrscannerdemo2;

/*
main에서 Button을 누르면 second.xml파일로 이동 후
second에 button와 frameLayout이 있고 framLayout에서 CodeScannerView로 code scan
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subActivity.class);
                startActivityForResult(intent, 101);
            }
        });
    }
}

