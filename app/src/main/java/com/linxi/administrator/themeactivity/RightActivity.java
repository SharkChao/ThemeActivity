package com.linxi.administrator.themeactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RightActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);
        Button btnLeft = (Button) findViewById(R.id.btnLeft);
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.startMainActivity(RightActivity.this);
            }
        });
    }
    public static void startRightActivity(Context context){
        context.startActivity(new Intent(context,RightActivity.class));
    }
}
