package com.example.kevin.manipulatingarrayvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtIndex = (TextView)findViewById(R.id.txtIndex);
        TextView txtValue = (TextView)findViewById(R.id.txtValue);
        String oldTextIndexValue;
        String oldTextValueValue;

        final int LENGHT_OF_ARRAY =15;
        float[] floatNumbersArray = new float[LENGHT_OF_ARRAY];

        for (int index = 0; index < floatNumbersArray.length; index++) {

            floatNumbersArray[index] = 5 + 3 * index;


        }


        for (int index = 0; index < floatNumbersArray.length; index++) {

            oldTextIndexValue = txtIndex.getText().toString();
            oldTextValueValue = txtValue.getText().toString();

            txtIndex.setText(oldTextIndexValue + index + "\n");
            txtValue.setText(oldTextValueValue + floatNumbersArray[index] + "\n");

        }
    }
}
