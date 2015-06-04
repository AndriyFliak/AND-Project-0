package com.udacity.af.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    public void project0Button(View view) {
        Toast.makeText(this, getResources().getText(R.string.project0Button), Toast.LENGTH_LONG).show();
    }

    public void project1Button(View view) {
        Toast.makeText(this, getResources().getText(R.string.project1Button), Toast.LENGTH_LONG).show();
    }

    public void project2Button(View view) {
        Toast.makeText(this, getResources().getText(R.string.project2Button), Toast.LENGTH_LONG).show();
    }

    public void project3Button(View view) {
        Toast.makeText(this, getResources().getText(R.string.project3Button), Toast.LENGTH_LONG).show();
    }

    public void project4Button(View view) {
        Toast.makeText(this, getResources().getText(R.string.project4Button), Toast.LENGTH_LONG).show();
    }

    public void project5Button(View view) {
        Toast.makeText(this, getResources().getText(R.string.project5Button), Toast.LENGTH_LONG).show();
    }
}
