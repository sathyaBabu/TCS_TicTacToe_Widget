package com.sathya.tcs_tictactoe_widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnTouchListener{

    private TicTAcToe ticTAcToe ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ticTAcToe = ( TicTAcToe)  findViewById(R.id.tictactoe);
        ticTAcToe.setOnTouchListener( this );


    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        ticTAcToe.clickListener( motionEvent.getX(),motionEvent.getY());


        return true;
    }
}