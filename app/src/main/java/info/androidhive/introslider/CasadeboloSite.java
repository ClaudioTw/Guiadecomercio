package info.androidhive.introslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CasadeboloSite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.casadebolo_site);

        final WebView webView = (WebView) findViewById(R.id.webSite);

        webView.loadUrl("http://casadebolos.com.br");
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
