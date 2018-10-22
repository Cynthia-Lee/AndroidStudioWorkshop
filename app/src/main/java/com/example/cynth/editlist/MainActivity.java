package com.example.cynth.editlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // want to get the things (buttons, textview) from the xml into this java code
        // the list that we will "print", we will view it
        viewList = (EditText)this.findViewById(R.id.viewList);
        addInput = (EditText)this.findViewById(R.id.addInput);
        indexInput = (EditText)this.findViewById(R.id.indexInput);
    }
    // have to instantiate the view list outside onCreate
    EditText viewList;
    EditText addInput;
    EditText indexInput;

    // when we click "pick random" when we go back the list still exists but you can't see it
    @Override //used with onResume()
    protected void onResume() { // saves the previous things when startup
        super.onResume();
        viewList.setText(List.viewList());
    }

    //@Override //used with onResume()
    //protected void onResume() { // saves the previous things when startup
    //    super.onResume();
    //    //PUT CODE HERE
    //}

    // ADD
    public void add(View view) { // tells android that it can call this method
        String thing = addInput.getText().toString(); // gets string that the user enters in the text box
        addInput.setText(""); // clear the box so they can enter a new name
        List.addToList(thing);
        viewList.setText(List.viewList()); //sets the text box with string to view the list
    }

    // REMOVE
    public void remove(View view) {
        String index = indexInput.getText().toString();
        int a = Integer.parseInt(index);
        a = a - 1;
        indexInput.setText("");
        List.removefromList(a);
        viewList.setText(List.viewList());
    }

    // CLEAR
    public void clear(View view) {
        List.clearList();
        viewList.setText(List.viewList());
    }

    // PICK RANDOM
    public void pickRandom(View view) {
        Intent i = new Intent(getApplicationContext(), Pick.class); // forwards us to Pick.class
        startActivity(i);
    }
}
