package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class ActivityTermsConditionsSngBinding extends ViewDataBinding {
    public final CheckBox A;
    public final LayoutDarkToolbarBinding B;
    public final TextView C;
    public final WebView D;
    public final Button y;
    public final CheckBox z;

    public ActivityTermsConditionsSngBinding(DataBindingComponent dataBindingComponent, View view, Button button, CheckBox checkBox, CheckBox checkBox2, LayoutDarkToolbarBinding layoutDarkToolbarBinding, TextView textView, WebView webView) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = checkBox;
        this.A = checkBox2;
        this.B = layoutDarkToolbarBinding;
        this.C = textView;
        this.D = webView;
    }
}
