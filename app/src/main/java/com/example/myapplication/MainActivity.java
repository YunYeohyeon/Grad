package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton)findViewById(R.id.tb);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.tv);
                if(tb.isChecked()){
                    tv.setText("토클 버튼 상태 : 켜짐");              ///////////////라운딩처리 on
                }
                else{
                    tv.setText("토클 버튼 상태 : 꺼짐");              ///////////////라운딩처리 off
                }
            }
        });
    }
}