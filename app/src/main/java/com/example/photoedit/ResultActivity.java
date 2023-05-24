package com.example.photoedit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {
    ImageButton imageButtonBack;
    private ImageView inmageViewPreview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        inmageViewPreview = findViewById(R.id.img_result);
        inmageViewPreview.setImageURI(getIntent().getData());
        imageButtonBack = findViewById(R.id.btn_back);
        imageButtonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}