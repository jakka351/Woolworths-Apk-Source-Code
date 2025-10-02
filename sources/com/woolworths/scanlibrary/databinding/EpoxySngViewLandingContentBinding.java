package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.entry.content.ContentItem;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentActionListener;

/* loaded from: classes7.dex */
public abstract class EpoxySngViewLandingContentBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public ContentItem C;
    public LandingContentActionListener D;
    public final TextView y;
    public final TextView z;

    public EpoxySngViewLandingContentBinding(View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = imageView;
        this.B = textView3;
    }
}
