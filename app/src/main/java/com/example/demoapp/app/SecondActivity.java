package com.example.demoapp.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Owner on 6/30/2014.
 */
public class SecondActivity extends Activity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        if(savedInstanceState == null) {

            init();
        }

    }
    public void init() {

        mTextView = (TextView) findViewById(R.id.textview_tv);
        mTextView.setText(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));
    }

}
