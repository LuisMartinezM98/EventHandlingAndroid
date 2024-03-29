package com.example.eventhandling1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private class ButtonHandler implements View.OnClickListener{
        @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.button:
                    show("Boton uno");
                    break;
                case R.id.button2:
                    show("Boton dos");
                case R.id.button3:
                    show("Boton tres");
                default:
                    show("Esto no deberia pasar");
            }

        }
    }
    void show(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Log.i(getClass().getName(), message);
    }
}