package com.google.androidbrowserhelper.trusted;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.browser.customtabs.CustomTabsIntent;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class WebViewFallbackActivity extends Activity {
    public static final /* synthetic */ int h = 0;
    public Uri d;
    public int e;
    public WebView f;
    public final ArrayList g = new ArrayList();

    public static Intent a(Context context, Uri uri, LauncherActivityMetadata launcherActivityMetadata) {
        Intent intent = new Intent(context, (Class<?>) WebViewFallbackActivity.class);
        intent.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.LAUNCH_URL", uri);
        intent.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR", context.getColor(launcherActivityMetadata.b));
        intent.putExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR", context.getColor(launcherActivityMetadata.d));
        List list = launcherActivityMetadata.l;
        if (list != null) {
            intent.putStringArrayListExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS", new ArrayList<>(list));
        }
        return intent;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList<String> stringArrayListExtra;
        super.onCreate(bundle);
        Uri uri = (Uri) getIntent().getParcelableExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.LAUNCH_URL");
        this.d = uri;
        if (!"https".equals(uri.getScheme())) {
            throw new IllegalArgumentException("launchUrl scheme must be 'https'");
        }
        if (getIntent().hasExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR")) {
            getWindow().setNavigationBarColor(getIntent().getIntExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR", 0));
        }
        if (getIntent().hasExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR")) {
            this.e = getIntent().getIntExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR", 0);
            getWindow().setStatusBarColor(this.e);
        } else {
            this.e = getWindow().getStatusBarColor();
        }
        if (getIntent().hasExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS") && (stringArrayListExtra = getIntent().getStringArrayListExtra("com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS")) != null) {
            for (String str : stringArrayListExtra) {
                Uri uri2 = Uri.parse(str);
                if ("https".equalsIgnoreCase(uri2.getScheme())) {
                    this.g.add(uri2);
                } else {
                    Log.w("WebViewFallbackActivity", "Only 'https' origins are accepted. Ignoring extra origin: " + str);
                }
            }
        }
        WebView webView = new WebView(this);
        this.f = webView;
        webView.setWebViewClient(new WebViewClient() { // from class: com.google.androidbrowserhelper.trusted.WebViewFallbackActivity.1
            public static boolean b(Uri uri3, Uri uri4) {
                return uri3.getScheme().equalsIgnoreCase(uri4.getScheme()) && uri3.getHost().equalsIgnoreCase(uri4.getHost()) && uri3.getPort() == uri4.getPort();
            }

            public final boolean a(Uri uri3) {
                WebViewFallbackActivity webViewFallbackActivity = WebViewFallbackActivity.this;
                Uri uri4 = webViewFallbackActivity.d;
                if (!"data".equals(uri3.getScheme()) && !b(uri3, uri4)) {
                    Iterator it = webViewFallbackActivity.g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            try {
                                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                                builder.b.b(webViewFallbackActivity.e);
                                builder.a().b(webViewFallbackActivity, uri3);
                                return true;
                            } catch (ActivityNotFoundException unused) {
                                int i = WebViewFallbackActivity.h;
                                Log.e("WebViewFallbackActivity", String.format("ActivityNotFoundException while launching '%s'", uri3));
                            }
                        } else if (b((Uri) it.next(), uri3)) {
                            break;
                        }
                    }
                }
                return false;
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                ViewGroup viewGroup = (ViewGroup) webView2.getParent();
                viewGroup.removeView(webView2);
                webView2.destroy();
                WebView webView3 = new WebView(webView2.getContext());
                WebViewFallbackActivity webViewFallbackActivity = WebViewFallbackActivity.this;
                webViewFallbackActivity.f = webView3;
                webView3.setWebViewClient(this);
                WebSettings settings = webViewFallbackActivity.f.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setDatabaseEnabled(true);
                viewGroup.addView(webViewFallbackActivity.f);
                Toast.makeText(webView2.getContext(), "Recovering from crash", 1).show();
                webViewFallbackActivity.f.loadUrl(webViewFallbackActivity.d.toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str2) {
                return a(Uri.parse(str2));
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                return a(webResourceRequest.getUrl());
            }
        });
        WebSettings settings = this.f.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        setContentView(this.f, new ViewGroup.LayoutParams(-1, -1));
        if (bundle != null) {
            this.f.restoreState(bundle);
            return;
        }
        HashMap map = new HashMap();
        map.put("Referer", "android-app://" + getPackageName() + q2.c);
        this.f.loadUrl(this.d.toString(), map);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f.goBack();
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        WebView webView = this.f;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        WebView webView = this.f;
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        WebView webView = this.f;
        if (webView != null) {
            webView.saveState(bundle);
        }
    }
}
