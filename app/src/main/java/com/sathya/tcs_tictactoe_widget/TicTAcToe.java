package com.sathya.tcs_tictactoe_widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class TicTAcToe extends View {

    Paint paint ;
    float x,y ;

    Path path = new Path();

    Bitmap bm = BitmapFactory.decodeResource(getResources(),R.drawable.buttontick);
    Bitmap bm2 = BitmapFactory.decodeResource(getResources(),R.drawable.redcross);




    public TicTAcToe(Context context) {
        super(context);
        init();
    }



    public TicTAcToe(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TicTAcToe(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public TicTAcToe(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {


        paint = new Paint() ;
        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // What kind of a device we are addressing
        // size of the screen

        // Assignment.
        // Use move to  / line to API.. ( to grab your x,y )
        // store that in array list and reproduce the same to display your signature

        int board_size_width = getWidth();
        int board_size_height = getHeight();

        int column_size = 290 ;
        int row_size    = 240 ;

        int no_column = getWidth() / column_size ;
        int no_row    = getHeight() / row_size ;

        // display the tic tac toe box

        for( int column = 1 ; column <= no_column -1 ; column++){

            canvas.drawLine(column * column_size , 100, column * column_size,board_size_width,paint);

        }

        for( int row = 1 ; row <= no_row -1 ; row++) {

            canvas.drawLine(100,row * row_size,board_size_height, row * row_size,paint);
        }



        // display a circle on where the user clicks..
        //canvas.drawCircle(x,y,50,paint);
        canvas.drawBitmap(bm2,x,y,paint);  // draw the cross here...



    }

    public void clickListener(float x, float y) {

        this.x = x ;
        this.y = y ;

        // lets call draw now to draw the TicTacToe board and to  plot where the user has clicked on
        // onDraw
        invalidate();  // will force onDraw()
    }
}
