package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class ActivityContactUsBinding extends ViewDataBinding {
    public final WebView A;
    public final LayoutDarkToolbarBinding y;
    public final ProgressBar z;

    public ActivityContactUsBinding(DataBindingComponent dataBindingComponent, View view, LayoutDarkToolbarBinding layoutDarkToolbarBinding, ProgressBar progressBar, WebView webView) {
        super(dataBindingComponent, view, 1);
        this.y = layoutDarkToolbarBinding;
        this.z = progressBar;
        this.A = webView;
    }
}
