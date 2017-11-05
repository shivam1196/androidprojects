package com.example.shivam.quizdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button_true,button_false,button_next;
    Question[] mQuestion = {new Question("New Delhi is the Capital of India",true),new Question("Dehradun is the Capital of Uttarakhand",true),new Question("Pakistan is a great country",false)};
    int mindex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null)
        {
            mindex= savedInstanceState.getInt("Key");
        }
        textView=(TextView)findViewById(R.id.textView);
        button_true=(Button)findViewById(R.id.button_true);
        button_false=(Button)findViewById(R.id.button_false);
        button_next=(Button)findViewById(R.id.button_next);

        textView.setText(mQuestion[mindex].getQuesId());
        button_true.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuestion[mindex].isAnswerId() == true)
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                else{
                    Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button_false.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mQuestion[mindex].isAnswerId()==false)
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                else
                {
                    Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
            }

        });
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mindex++;
                textView.setText(mQuestion[mindex].getQuesId());
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Key",mindex);
    }
}
