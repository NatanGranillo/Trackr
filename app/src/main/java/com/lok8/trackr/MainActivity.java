package com.lok8.trackr;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "androidMessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //setContentView(R.layout.activity_main);
        RelativeLayout trackrLayout = new RelativeLayout(this);


        //Login Button
        Button loginButton = new Button(this);
        loginButton.setText("Login");
        loginButton.setBackgroundColor(Color.YELLOW);

        //Username input
        EditText username = new EditText(this);
        loginButton.setId(1);
        username.setId(2);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        usernameDetails.addRule(RelativeLayout.ABOVE, loginButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        trackrLayout.addView(username, usernameDetails);




        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Add widget to layout
        trackrLayout.addView(loginButton);

        setContentView(trackrLayout);


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
