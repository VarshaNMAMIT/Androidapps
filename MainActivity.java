package com.example.task22;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    private EditText editTextUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUrl = findViewById(R.id.edit_text_url);

        findViewById(R.id.btn_open_webview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editTextUrl.getText().toString().trim();
                if (url.isEmpty()) {
                    // If no URL is provided, use the default one
                    url = "https://www.example.com";
                }
                Intent intent = new Intent(MainActivity.this, Webviewactivity.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });
    }
}
