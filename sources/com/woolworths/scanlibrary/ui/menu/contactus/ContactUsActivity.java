package com.woolworths.scanlibrary.ui.menu.contactus;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityContactUsBinding;
import com.woolworths.scanlibrary.ui.menu.contactus.ContactUsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/contactus/ContactUsActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/menu/contactus/ContactUsContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/menu/contactus/ContactUsContract$View;", "<init>", "()V", "ScanAndGoWebViewClient", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContactUsActivity extends DaggerBaseActivity<ContactUsContract.Presenter> implements ContactUsContract.View {
    public static final /* synthetic */ int L = 0;
    public ActivityContactUsBinding G;
    public boolean I;
    public String K;
    public boolean H = true;
    public final String J = "tel:";

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_contact_us;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        ActivityContactUsBinding activityContactUsBinding = (ActivityContactUsBinding) DataBindingUtil.d(this, R.layout.activity_contact_us);
        this.G = activityContactUsBinding;
        if (activityContactUsBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityContactUsBinding.y.y);
        ActivityContactUsBinding activityContactUsBinding2 = this.G;
        if (activityContactUsBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityContactUsBinding2.y.z.setText(getResources().getString(R.string.sng_title_contact_us));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.t();
        }
        ActionBar supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.s(true);
        }
        String str = this.K;
        if (str == null) {
            Intrinsics.p("contactUsUrl");
            throw null;
        }
        ActivityContactUsBinding activityContactUsBinding3 = this.G;
        if (activityContactUsBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        WebSettings settings = activityContactUsBinding3.A.getSettings();
        Intrinsics.g(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        ActivityContactUsBinding activityContactUsBinding4 = this.G;
        if (activityContactUsBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        WebView webView = activityContactUsBinding4.A;
        webView.loadUrl(str);
        webView.setWebViewClient(new ScanAndGoWebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent event) {
        Intrinsics.h(event, "event");
        if (event.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, event);
        }
        ActivityContactUsBinding activityContactUsBinding = this.G;
        if (activityContactUsBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        if (!activityContactUsBinding.A.canGoBack()) {
            finish();
            return true;
        }
        ActivityContactUsBinding activityContactUsBinding2 = this.G;
        if (activityContactUsBinding2 != null) {
            activityContactUsBinding2.A.goBack();
            return true;
        }
        Intrinsics.p("viewBinding");
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/contactus/ContactUsActivity$ScanAndGoWebViewClient;", "Landroid/webkit/WebViewClient;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class ScanAndGoWebViewClient extends WebViewClient {
        public ScanAndGoWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String url) {
            Intrinsics.h(view, "view");
            Intrinsics.h(url, "url");
            ContactUsActivity contactUsActivity = ContactUsActivity.this;
            contactUsActivity.H = false;
            ActivityContactUsBinding activityContactUsBinding = contactUsActivity.G;
            if (activityContactUsBinding == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            activityContactUsBinding.z.setVisibility(8);
            view.setVisibility(0);
            super.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (!ContactUsActivity.this.H || webView == null) {
                return;
            }
            webView.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ContactUsActivity contactUsActivity = ContactUsActivity.this;
            if (contactUsActivity.I) {
                return;
            }
            contactUsActivity.I = true;
            String string = contactUsActivity.getString(R.string.sng_error_unhandled);
            Intrinsics.g(string, "getString(...)");
            contactUsActivity.Y4(string, new c(contactUsActivity, 14));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.h(view, "view");
            Intrinsics.h(url, "url");
            ContactUsActivity contactUsActivity = ContactUsActivity.this;
            if (StringsKt.o(url, contactUsActivity.J, false)) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse(url));
                contactUsActivity.startActivity(intent);
                return true;
            }
            ActivityContactUsBinding activityContactUsBinding = contactUsActivity.G;
            if (activityContactUsBinding == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            activityContactUsBinding.z.setVisibility(0);
            view.loadUrl(url);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            ContactUsActivity contactUsActivity = ContactUsActivity.this;
            if (contactUsActivity.I) {
                return;
            }
            contactUsActivity.I = true;
            String string = contactUsActivity.getString(R.string.sng_error_unhandled);
            Intrinsics.g(string, "getString(...)");
            contactUsActivity.Y4(string, new c(contactUsActivity, 14));
        }
    }
}
