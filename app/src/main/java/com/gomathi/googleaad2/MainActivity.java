package com.gomathi.googleaad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView a_txt;
    private  TextView b_txt;
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private int mScore1,mScore2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScore1 =0;
        mScore2 = 0;
        imageButton1 = (ImageButton)findViewById(R.id.imageButton);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        a_txt = (TextView)findViewById(R.id.textView);
        b_txt = (TextView)findViewById(R.id.textView2);


    }

    public void scorePopulate(View view)
    {
        int id = view.getId();
        switch (id)
        {
            case R.id.imageButton:
                mScore1++;
                a_txt.setText(String.valueOf(mScore1));
                break;
            case R.id.imageButton3:
                mScore2++;
                b_txt.setText(String.valueOf(mScore2));
                break;
            case R.id.imageButton2:
                if(mScore1 > 0)
                    mScore1--;
                a_txt.setText(String.valueOf(mScore1));
                break;
            case R.id.imageButton4:
                if(mScore2 > 0)
                    mScore2--;
                b_txt.setText(String.valueOf(mScore2));
                break;

        }
    }

}
