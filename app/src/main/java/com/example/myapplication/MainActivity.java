package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtEnterHobby;
    private Button btnAdd;
    private TextView txtHobbies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpVars();
    }

    public void setUpVars() {
        txtEnterHobby = findViewById(R.id.txtEnterHobby);
        btnAdd = findViewById(R.id.btnAdd);
        txtHobbies = findViewById(R.id.txtHobbies);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hobbies = txtEnterHobby.getText().toString();
                if(!hobbies.isEmpty()){
                    txtHobbies.setText(hobbies);
                    txtHobbies.setVisibility(View.VISIBLE);
                    txtEnterHobby.setText("");
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "please Enter a value",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }




}