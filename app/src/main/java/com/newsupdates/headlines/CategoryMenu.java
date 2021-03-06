package com.newsupdates.headlines;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class CategoryMenu extends AppCompatActivity {

    CardView general, busniess, entertainment, health, science, sports, technology, change_location, rate;
    EditText search_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_menu);
        general= findViewById(R.id.generalNews);
        busniess= findViewById(R.id.businessNews);
        entertainment= findViewById(R.id.entertainmentNews);
        health= findViewById(R.id.healthNews);
        science= findViewById(R.id.scienceNews);
        sports= findViewById(R.id.sportsNews);
        technology= findViewById(R.id.techNews);
        change_location= findViewById(R.id.changeLocation);
        rate= findViewById(R.id.rate);


        search_bar= findViewById(R.id.search_bar);

        search_bar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
//                if (keyEvent==KeyEzz)
                if (i == EditorInfo.IME_ACTION_NEXT) {
                    String search_query=search_bar.getText().toString();
                    Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("newsUrl", "https://newsapi.org/v2/top-headlines?apiKey=e1d2194d001540cd903f61c8f8966390&pageSize=100&q="+search_query);
                    intent.putExtra("isSearch","yes");
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });

        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("newsUrl", "https://newsapi.org/v2/top-headlines?apiKey=e1d2194d001540cd903f61c8f8966390&pageSize=100&category=general");
                startActivity(intent);
            }
        });


        busniess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("newsUrl", "https://newsapi.org/v2/top-headlines?apiKey=e1d2194d001540cd903f61c8f8966390&pageSize=100&category=business");
                startActivity(intent);
            }
        });

        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("newsUrl", "https://newsapi.org/v2/top-headlines?apiKey=e1d2194d001540cd903f61c8f8966390&pageSize=100&category=entertainment");
                startActivity(intent);
            }
        });


        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("newsUrl", "https://newsapi.org/v2/top-headlines?apiKey=e1d2194d001540cd903f61c8f8966390&pageSize=100&category=health");
                startActivity(intent);
            }
        });


        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("newsUrl", "https://newsapi.org/v2/top-headlines?apiKey=e1d2194d001540cd903f61c8f8966390&pageSize=100&pageSize=100&category=science");
                startActivity(intent);
            }
        });



        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("newsUrl", "https://newsapi.org/v2/top-headlines?apiKey=e1d2194d001540cd903f61c8f8966390&pageSize=100&pageSize=100&category=sports");
                startActivity(intent);
            }
        });


        technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("newsUrl", "https://newsapi.org/v2/top-headlines?apiKey=e1d2194d001540cd903f61c8f8966390&pageSize=100&category=technology");
                startActivity(intent);
            }
        });



        change_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), CountryOptions.class);
                startActivity(intent);
            }
        });


        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.newsupdates.headlines";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
