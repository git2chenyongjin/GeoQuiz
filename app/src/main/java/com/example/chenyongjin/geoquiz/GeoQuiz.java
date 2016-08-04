package com.example.chenyongjin.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.chenyongjin.geoquiz.R;

public class GeoQuiz extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_quiz);

        mTrueButton = (Button) findViewById(R.id.true_button_view);
        mFalseButton = (Button) findViewById(R.id.false_button_view);

        mTrueButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(GeoQuiz.this,R.string.correct_toast,Toast.LENGTH_LONG).show();
            }
        });
        mFalseButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GeoQuiz.this,R.string.incorrect_toast,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
