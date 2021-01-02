package com.example.androidstudiotutorial;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SQLTutorialActivity extends AppCompatActivity implements View.OnClickListener {
    private WebView mywebView;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);
        mywebView=(WebView) findViewById(R.id.webview3);
        mywebView.setWebViewClient(new WebViewClient());
        mywebView.loadUrl("https://www.w3schools.com/sql/default.asp");
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        btnBack=(Button)findViewById(R.id.btnSqlBack);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }

    public class mywebClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed(){
        if(mywebView.canGoBack()) {
            mywebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
