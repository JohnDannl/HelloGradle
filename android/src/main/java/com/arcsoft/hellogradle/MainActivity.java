package com.arcsoft.hellogradle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		final TextView tv = (TextView)findViewById(R.id.tv_hello);
		final ImageView iv = (ImageView)findViewById(R.id.iv_icon);
		if (BuildConfig.SHOW_GRADLE == 1) {
			tv.setText(getString(R.string.str_hello_fm, BuildConfig.APPLICATION_ID));
			iv.setImageDrawable(getResources().getDrawable(R.drawable.gradle));
		}
    }
}