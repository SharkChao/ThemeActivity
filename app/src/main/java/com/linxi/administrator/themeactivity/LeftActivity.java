package com.linxi.administrator.themeactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeftActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left);
        Button btnRight = (Button) findViewById(R.id.btnRight);
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.startMainActivity(LeftActivity.this);
            }
        });
    }
    public static void startLeftActivity(Context context){
        context.startActivity(new Intent(context,LeftActivity.class));
    }
}
