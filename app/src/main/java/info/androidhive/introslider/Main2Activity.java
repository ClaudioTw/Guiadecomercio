package info.androidhive.introslider;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


public class Main2Activity  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final WebView webView = (WebView) findViewById(R.id.webView2);

        webView.loadUrl("file:///android_asset/site1/index.html");
        webView.getSettings().setJavaScriptEnabled(true);





    }
}
