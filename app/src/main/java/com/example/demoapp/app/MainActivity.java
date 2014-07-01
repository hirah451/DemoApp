package com.example.demoapp.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    Button mButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        init();


    }
public void init() {
    mButton = (Button) findViewById(R.id.myButton);
    mButton.setOnClickListener(new View.OnClickListener() {
        @Override
    public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            EditText editText = (EditText) findViewById(R.id.edit_message);

//            String message = editText.getText().toString();
//            intent.putExtra(EXTRA_MESSAGE, message); the line below combines these two lines in one..can do either one
            intent.putExtra(EXTRA_MESSAGE, ((EditText) findViewById(R.id.edit_message)).getText().toString())
            startActivity(intent);
        }
    });
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
