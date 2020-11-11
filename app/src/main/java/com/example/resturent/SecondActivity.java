package com.example.resturent;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView txtView,txtView1;
    private Button buttonConvert;
    private float tk,dlr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView txtView = (TextView) findViewById(R.id.text_id);
        txtView1=findViewById(R.id.doller);
        buttonConvert=findViewById(R.id.convert);




        Bundle bundle=getIntent().getExtras();

        if (bundle!=null)
        {
            String food= bundle.getString("name");
            showDetails(food);
        }

         }

     void showDetails(String food) {
        if(food.equals("Mexican"))
        {
            TextView txtView = (TextView) findViewById(R.id.text_id);

            this.tk=480;
            txtView.setText("Mexican = "+tk+"tk");
        }
        if(food.equals("Indian"))
        {
            TextView txtView = (TextView) findViewById(R.id.text_id);

            this.tk=390;
            txtView.setText("Indian = "+tk+"tk");
        }
        if(food.equals("Korean"))
        {
            TextView txtView = (TextView) findViewById(R.id.text_id);

            this.tk=560;
            txtView.setText("Korean = "+tk+"tk");
        }
        if(food.equals("Contential"))
        {
            TextView txtView = (TextView) findViewById(R.id.text_id);

            this.tk=220;
            txtView.setText("Contential = "+tk+"tk");
        }

         buttonConvert.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 dlr= (float) (tk/84);
                 txtView1.setText(dlr+"$");
             }
         });
    }



}
