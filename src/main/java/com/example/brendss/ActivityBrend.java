package com.example.brendss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class ActivityBrend extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brend_act);
        TextView textView = findViewById(R.id.BrendName);
        WebView browser = (WebView) findViewById(R.id.webBrowser);

        String ListInfo = getIntent().getStringExtra("abcd");
        switch (ListInfo) {
            case ("Adidas"):
                textView.setText(ListInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Adidas");
                break;
            case ("Nike"):
                textView.setText(ListInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Nike");
                break;
            case ("Louis_Vuitton"):
                textView.setText(ListInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Louis_Vuitton");
                break;
            case ("Gucci"):
                textView.setText(ListInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Gucci");
                break;
            case ("Versace"):
                textView.setText(ListInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Versace");
                break;
            case ("Giorgio_Armani"):
                textView.setText(ListInfo);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Giorgio_Armani");
                break;

        }
    }
}