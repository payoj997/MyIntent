package com.example.p66na.myintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
    }
    public void screenone(View view){
        String value = editText.getText().toString();
        if(value.length() == 0){
            editText.setError("No name written");
        } else{
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name",value);
            startActivity(intent);
        }
    }
}
