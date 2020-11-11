package com.example.resturent;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioButton genderradioButton,mexicanButton,IndianButton,KoreanButton,ContinetialButton;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        mexicanButton=findViewById(R.id.Mexican);
        IndianButton=findViewById(R.id.Indian);
        KoreanButton=findViewById(R.id.Korean);
        ContinetialButton=findViewById(R.id.Continetial);
    }


    public void onclickbuttonMethod(View v){
        int selectedId = radioGroup.getCheckedRadioButtonId();
        Intent i = new Intent(this.getApplicationContext(), SecondActivity.class);
        genderradioButton = (RadioButton) findViewById(selectedId);
        String selectedRbText = genderradioButton.getText().toString();
        if(selectedId==-1){
            Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }
        else if (mexicanButton.isChecked()){

            i.putExtra("name", "Mexican");


        }else if (IndianButton.isChecked()){

            i.putExtra("name", "Indian");

        }else if (KoreanButton.isChecked()){

            i.putExtra("name", "Korean");


        }else {

            i.putExtra("name", "Contential");


        }

        startActivity(i);

    }
}