package com.example.fblogin;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Content extends AppCompatActivity {
    ContentFragment contentFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        if(savedInstanceState == null)
        {
            String [] courses ={"Introduction to SecureX","Introduction to Cyber Security","Data Security","Application Security","Network Security"};
         contentFragment= new ContentFragment();
            contentFragment.getString(courses);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.content,contentFragment).commit();
    }}
//    String [] array = contentFragment.name();
}
