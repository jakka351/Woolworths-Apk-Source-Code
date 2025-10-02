package au.com.woolworths.android.onesite.modules.customviews;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.compose.h;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityWebViewBinding;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.webview.ReleaseSquadHeaderInteractor;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/WebViewActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "<init>", "()V", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public class WebViewActivity extends Hilt_WebViewActivity {
    public static final /* synthetic */ int F = 0;
    public SharedHeaders B;
    public ReleaseSquadHeaderInteractor C;
    public ActivityWebViewBinding D;
    public final int E;

    public WebViewActivity() {
        this.u = true;
        this.E = R.layout.activity_web_view;
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4, reason: from getter */
    public final int getE() {
        return this.E;
    }

    public final ObservableWebView R4() {
        ActivityWebViewBinding activityWebViewBinding = this.D;
        if (activityWebViewBinding == null) {
            Intrinsics.p("activityWebViewBinding");
            throw null;
        }
        ObservableWebView observableWebView = activityWebViewBinding.z;
        Intrinsics.g(observableWebView, "observableWebView");
        return observableWebView;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (R4().canGoBack()) {
            R4().goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.Hilt_WebViewActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchMethodException, SecurityException {
        Map mapB;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Bundle cannot be null");
        }
        Activities.WebViewActivity.Extras extras2 = (Activities.WebViewActivity.Extras) extras.getParcelable("extra");
        if (extras2 == null) {
            throw new IllegalArgumentException("Extras cannot be null");
        }
        String str = extras2.f;
        Screens screens = extras2.g;
        boolean z = extras2.i;
        setTheme(z ? R.style.Theme_Wow_Light : R.style.Theme_Wow);
        super.onCreate(bundle);
        ActivityWebViewBinding activityWebViewBinding = (ActivityWebViewBinding) DataBindingUtil.d(this, this.E);
        activityWebViewBinding.L(z);
        setSupportActionBar(z ? activityWebViewBinding.B : activityWebViewBinding.A);
        this.D = activityWebViewBinding;
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        supportActionBar.A(extras2.e);
        String url = extras2.d;
        boolean z2 = extras2.h;
        Intrinsics.h(url, "url");
        ObservableWebView observableWebViewR4 = R4();
        ViewExtKt.b(observableWebViewR4, new h(2, (byte) 0));
        WebSettings settings = observableWebViewR4.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        observableWebViewR4.setWebViewClient(new WebViewClient() { // from class: au.com.woolworths.android.onesite.modules.customviews.WebViewActivity$webViewClientWithLoading$1
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView view, String url2) {
                Intrinsics.h(view, "view");
                Intrinsics.h(url2, "url");
                super.onPageFinished(view, url2);
                ActivityWebViewBinding activityWebViewBinding2 = this.f4320a.D;
                if (activityWebViewBinding2 != null) {
                    activityWebViewBinding2.y.setVisibility(8);
                } else {
                    Intrinsics.p("activityWebViewBinding");
                    throw null;
                }
            }
        });
        if (z2) {
            SharedHeaders sharedHeaders = this.B;
            if (sharedHeaders == null) {
                Intrinsics.p("shopSharedHeaders");
                throw null;
            }
            mapB = sharedHeaders.b();
        } else {
            mapB = EmptyMap.d;
        }
        if (this.C == null) {
            Intrinsics.p("squadHeaderInteractor");
            throw null;
        }
        observableWebViewR4.loadUrl(url, MapsKt.m(mapB, EmptyMap.d));
        if (screens != null) {
            O4().a(screens);
            return;
        }
        if (str != null) {
            LegacyShopAnalyticsManager legacyShopAnalyticsManager = this.w;
            if (legacyShopAnalyticsManager != null) {
                legacyShopAnalyticsManager.c(str);
            } else {
                Intrinsics.p("legacyShopAnalyticsManager");
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
