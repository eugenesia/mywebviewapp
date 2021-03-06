package com.example.mywebviewapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

  private WebView mWebView;

  public MainActivityFragment() {
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

    View v = inflater.inflate(R.layout.fragment_main, container, false);
    mWebView = (WebView) v.findViewById(R.id.activity_main_webview);

    // Enable Javascript
    WebSettings webSettings = mWebView.getSettings();
    webSettings.setJavaScriptEnabled(true);

    // Force links and redirects to open in the WebView instead of in a browser.
    // mWebView.setWebViewClient(new WebViewClient());

    // Stop local links and redirects from opening in browser instead of WebView.
    mWebView.setWebViewClient(new MyAppWebViewClient());

    mWebView.loadUrl("http://beta.html5test.com/");

    return v;
  }
}
