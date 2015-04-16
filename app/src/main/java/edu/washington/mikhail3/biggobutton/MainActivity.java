package edu.washington.mikhail3.biggobutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class MainActivity extends Activity {

    Button button;
    int pressNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        pressNumber = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pressNumber++;
                button.setText("You have pushed me " + pressNumber + " times!");
            }
        });
    }



}
