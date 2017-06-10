package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.myfirstapp.R.id.editText;
import static com.example.myfirstapp.R.id.editText1;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        Bundle b = new Bundle();

        //Inserts a String value into the mapping of this Bundle

        //Add the bundle to the intent.



        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        EditText editText1 = (EditText) findViewById(R.id.editText5);
        String message1 = editText1.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.editText1);
        String message2 = editText2.getText().toString();
        EditText editText3 = (EditText) findViewById(R.id.editText2);
        String message3 = editText3.getText().toString();
        EditText editText4 = (EditText) findViewById(R.id.editText3);
        String message4 = editText4.getText().toString();



        b.putString("Name", message);
        b.putString("DOB",message1);
        b.putString("Mobile Number",message2);
        b.putString("E-mail",message3);
        b.putString("Address",message4);





        intent.putExtras(b);
        startActivity(intent);
    }

}