package com.example.y700.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class Landing_Activity extends AppCompatActivity {


    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_);


        webView = (WebView)findViewById(R.id.webview);
        String getdata1 = getIntent().getStringExtra("DATA1");
        String getdata2 = getIntent().getStringExtra("DATA2");
        String getdata3 = getIntent().getStringExtra("DATA3");
        String url1     = "https://www.youtube.com/watch?v=mAKsZ26SabQ";
        String url2     = "https://www.youtube.com/watch?v=2uR9a8nRYV8";
        String url3     = "https://www.youtube.com/watch?v=dISNgvVpWlo";

        /*text2.setText("BUTTON YANG DI KLIK ADALAH = " + getdata1);*/
        if ((getdata1 == null)&&(getdata2 == null)){
            webView.loadUrl(url3);

        }else if ((getdata1 == null)&&(getdata3 == null)){
            webView.loadUrl(url2);
        }else {
            webView.loadUrl(url1);

        }

    }
}
