package com.linxi.administrator.themeactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button mBtnLeft;
    private Button mBtnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLeft = (Button) findViewById(R.id.btnLeft);
        mBtnRight = (Button) findViewById(R.id.btnRight);
        mBtnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LeftActivity.startLeftActivity(MainActivity.this);
            }
        });
        mBtnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RightActivity.startRightActivity(MainActivity.this);
            }
        });
    }
    public static void startMainActivity(Context context){
        context.startActivity(new Intent(context,MainActivity.class));
    }
}
