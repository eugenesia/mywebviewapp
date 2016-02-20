package com.example.mywebviewapp;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Eugene on 16/02/16.
 * Override WebViewClient to control when to open links in a browser,
 * and when internally.
 */
public class MyAppWebViewClient extends WebViewClient {

  @Override
  public boolean shouldOverrideUrlLoading(WebView view, String url) {

    if (Uri.parse(url).getHost().endsWith("html5test.com")) {
      // Don't override URL loading for internal links, open in WebView.
      return false;
    }

    // Create a new intent and launch a new activity, that handles the
    // URL intent.
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
    view.getContext().startActivity(intent);

    // Override URL loading, to open in a browser.
    return true;
  }
}
