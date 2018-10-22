package com.example.cynth.editlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Pick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);
        displayPick = (TextView)this.findViewById(R.id.displayPick);
    }
    TextView displayPick;

    // Pick method for the button
    public void chooseRandom(View view) { // tells android that it can call this method
        displayPick.setText(List.pickRandom());
    }

    // go back to MainActivity button
    public void goBack(View view) {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}
