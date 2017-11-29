package com.example.rico.mydiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView quoteLabel = (TextView) findViewById(R.id.quoteLabel);
        final ImageView img = (ImageView) findViewById(R.id.gallery);
        final int[] quoteList = {R.string.quote1,R.string.quote2,R.string.quote3};
        final int[] photos = {R.drawable.img1, R.drawable.img2,R.drawable.img3};
        Button clickButton = (Button) findViewById(R.id.clickButton);

        clickButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                int randomiser = (int) (Math.random() *3);
                img.setImageResource(photos[randomiser]);
                quoteLabel.setText(quoteList[randomiser]);
            }
        });

    }
}
