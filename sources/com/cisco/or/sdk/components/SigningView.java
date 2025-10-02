package com.cisco.or.sdk.components;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/cisco/or/sdk/components/SigningView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/webkit/WebView;", "d", "Landroid/webkit/WebView;", "getWebView$sdk_release", "()Landroid/webkit/WebView;", "webView", "Landroid/widget/ProgressBar;", "e", "Landroid/widget/ProgressBar;", "getProgressBar$sdk_release", "()Landroid/widget/ProgressBar;", "progressBar", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SigningView extends RelativeLayout {

    /* renamed from: d, reason: from kotlin metadata */
    public final WebView webView;

    /* renamed from: e, reason: from kotlin metadata */
    public final ProgressBar progressBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SigningView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        WebView webView = new WebView(context);
        this.webView = webView;
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleLarge);
        this.progressBar = progressBar;
        webView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams);
        addView(webView);
        addView(progressBar);
    }

    @NotNull
    /* renamed from: getProgressBar$sdk_release, reason: from getter */
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    @NotNull
    /* renamed from: getWebView$sdk_release, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }
}
