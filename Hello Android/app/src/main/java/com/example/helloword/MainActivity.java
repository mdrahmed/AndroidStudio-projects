package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view)
    {
        EditText editText = findViewById(R.id.userMessage);
        String message = editText.getText().toString();

        Intent intent = new Intent(this,MessageActivity.class);
        intent.putExtra("Extra_Message",message);
        startActivity(intent);
    }


    int t =0;

    public void aaaa(View view){
        final RadioGroup ww = (RadioGroup) findViewById(R.id.ww);
        int wwId = ww.getCheckedRadioButtonId();
        RadioButton rr = (RadioButton) findViewById(wwId);
        TextView display = findViewById(R.id.displaySelected);
        display.setText(Integer.toString(t));
    }
    public void getSelectedRadioButton(View view) {

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.paymentMethod);

        int radioID = radioGroup.getCheckedRadioButtonId();

        RadioButton singleButton = (RadioButton) findViewById(radioID);

        TextView display = findViewById(R.id.displaySelected);
        display.setText(singleButton.getText());
    }

    public void getSelectedCheckbox(View view){
        CheckBox java = findViewById(R.id.Java);
        CheckBox android = findViewById(R.id.android);
        CheckBox csharp = findViewById(R.id.csharp);

        String displayMessage="";

        if(java.isChecked()){
            displayMessage += java.getText()+"\n";
        }
        if(android.isChecked()){
            displayMessage += android.getText()+"\n";
        }
        if(csharp.isChecked()){
            displayMessage += csharp.getText()+"\n";
        }

        TextView display = findViewById(R.id.displaySelected);
        display.setText(displayMessage);
    }
}
