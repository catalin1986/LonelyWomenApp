package date.lonelywomen.lonelywomen18;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import date.lonelywomen.lonelywomen18.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private AdView mAdView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        WebView view = (WebView) findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("http://lonelywomen.date/register");
        this.mAdView = (AdView) findViewById(R.id.adView);
        this.mAdView.loadAd(new Builder().build());
    }
}
