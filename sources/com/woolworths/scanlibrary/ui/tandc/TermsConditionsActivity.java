package com.woolworths.scanlibrary.ui.tandc;

import android.content.Intent;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityTermsConditionsSngBinding;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import com.woolworths.scanlibrary.ui.tandc.TermsConditionsContract;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tandc/TermsConditionsActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/tandc/TermsConditionsContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/tandc/TermsConditionsContract$View;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TermsConditionsActivity extends DaggerBaseActivity<TermsConditionsContract.Presenter> implements TermsConditionsContract.View {
    public static final /* synthetic */ int L = 0;
    public boolean G;
    public ActivityTermsConditionsSngBinding H;
    public String I;
    public String J;
    public String K;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tandc/TermsConditionsActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // com.woolworths.scanlibrary.ui.tandc.TermsConditionsContract.View
    public final void K2() {
        TapActivity.Companion.a(this, null, null, 12);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_terms_conditions_sng;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        ActivityTermsConditionsSngBinding activityTermsConditionsSngBinding = (ActivityTermsConditionsSngBinding) DataBindingUtil.d(this, R.layout.activity_terms_conditions_sng);
        this.H = activityTermsConditionsSngBinding;
        if (activityTermsConditionsSngBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityTermsConditionsSngBinding.B.z.setText(getString(R.string.sng_label_tnc));
        ActivityTermsConditionsSngBinding activityTermsConditionsSngBinding2 = this.H;
        if (activityTermsConditionsSngBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityTermsConditionsSngBinding2.B.y);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        ActivityTermsConditionsSngBinding activityTermsConditionsSngBinding3 = this.H;
        if (activityTermsConditionsSngBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityTermsConditionsSngBinding3.y.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 13));
        activityTermsConditionsSngBinding3.z.setOnCheckedChangeListener(new a(this, 0));
        activityTermsConditionsSngBinding3.A.setOnCheckedChangeListener(new a(this, 1));
        CharSequence text = getText(R.string.sng_label_agree_privacy);
        Intrinsics.f(text, "null cannot be cast to non-null type android.text.SpannedString");
        SpannedString spannedString = (SpannedString) text;
        SpannableString spannableString = new SpannableString(spannedString);
        Iterator itA = ArrayIteratorKt.a((Annotation[]) spannedString.getSpans(0, spannedString.length(), Annotation.class));
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            if (Intrinsics.c(annotation.getKey(), "property") && Intrinsics.c(annotation.getValue(), "policy")) {
                spannableString.setSpan(new ClickableSpan() { // from class: com.woolworths.scanlibrary.ui.tandc.TermsConditionsActivity$initViews$3
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View widget) {
                        Intrinsics.h(widget, "widget");
                        TermsConditionsActivity termsConditionsActivity = this.d;
                        String str = termsConditionsActivity.J;
                        if (str != null) {
                            ContextExtKt.e(termsConditionsActivity, str);
                        } else {
                            Intrinsics.p("privacyPolicyUrl");
                            throw null;
                        }
                    }
                }, spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation), 33);
            } else if (Intrinsics.c(annotation.getKey(), "property") && Intrinsics.c(annotation.getValue(), "notice")) {
                spannableString.setSpan(new ClickableSpan() { // from class: com.woolworths.scanlibrary.ui.tandc.TermsConditionsActivity$initViews$4
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View widget) {
                        Intrinsics.h(widget, "widget");
                        TermsConditionsActivity termsConditionsActivity = this.d;
                        String str = termsConditionsActivity.K;
                        if (str != null) {
                            ContextExtKt.e(termsConditionsActivity, str);
                        } else {
                            Intrinsics.p("collectionUrl");
                            throw null;
                        }
                    }
                }, spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation), 33);
            }
        }
        ActivityTermsConditionsSngBinding activityTermsConditionsSngBinding4 = this.H;
        if (activityTermsConditionsSngBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        TextView textView = activityTermsConditionsSngBinding4.C;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(getApplicationContext().getColor(R.color.sng_charcoal));
        textView.setHighlightColor(0);
        textView.setText(spannableString);
        ActivityTermsConditionsSngBinding activityTermsConditionsSngBinding5 = this.H;
        if (activityTermsConditionsSngBinding5 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        WebView webView = activityTermsConditionsSngBinding5.D;
        webView.setBackgroundColor(0);
        webView.setLayerType(1, null);
    }

    @Override // com.woolworths.scanlibrary.ui.tandc.TermsConditionsContract.View
    public final void X3() {
        N3(true);
        ActivityTermsConditionsSngBinding activityTermsConditionsSngBinding = this.H;
        if (activityTermsConditionsSngBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        WebView webView = activityTermsConditionsSngBinding.D;
        String str = this.I;
        if (str == null) {
            Intrinsics.p("tncUrl");
            throw null;
        }
        webView.loadUrl(str);
        ActivityTermsConditionsSngBinding activityTermsConditionsSngBinding2 = this.H;
        if (activityTermsConditionsSngBinding2 != null) {
            activityTermsConditionsSngBinding2.D.setWebViewClient(new WebViewClient() { // from class: com.woolworths.scanlibrary.ui.tandc.TermsConditionsActivity$loadTermsAndConditions$1
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView view, String url) {
                    Intrinsics.h(view, "view");
                    Intrinsics.h(url, "url");
                    TermsConditionsActivity termsConditionsActivity = this.f21346a;
                    termsConditionsActivity.G = true;
                    termsConditionsActivity.N3(false);
                    termsConditionsActivity.c5();
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    Intrinsics.h(view, "view");
                    Intrinsics.h(request, "request");
                    view.loadUrl(request.getUrl().toString());
                    return false;
                }
            });
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c5() {
        /*
            r4 = this;
            com.woolworths.scanlibrary.databinding.ActivityTermsConditionsSngBinding r0 = r4.H
            r1 = 0
            java.lang.String r2 = "viewBinding"
            if (r0 == 0) goto L34
            android.widget.CheckBox r0 = r0.z
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L25
            com.woolworths.scanlibrary.databinding.ActivityTermsConditionsSngBinding r0 = r4.H
            if (r0 == 0) goto L21
            android.widget.CheckBox r0 = r0.A
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L25
            boolean r0 = r4.G
            if (r0 == 0) goto L25
            r0 = 1
            goto L26
        L21:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L25:
            r0 = 0
        L26:
            com.woolworths.scanlibrary.databinding.ActivityTermsConditionsSngBinding r3 = r4.H
            if (r3 == 0) goto L30
            android.widget.Button r1 = r3.y
            r1.setEnabled(r0)
            return
        L30:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L34:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.ui.tandc.TermsConditionsActivity.c5():void");
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, android.app.Activity
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

    @Override // com.woolworths.scanlibrary.ui.tandc.TermsConditionsContract.View
    public final void t() {
        Pair[] pairArr = new Pair[0];
        Intent intent = new Intent(this, (Class<?>) AddPaymentActivity.class);
        intent.addFlags(872448000);
        if (pairArr.length != 0) {
            intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        }
        startActivity(intent);
        finish();
    }
}
