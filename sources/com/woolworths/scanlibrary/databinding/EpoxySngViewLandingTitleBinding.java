package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.entry.content.ContentTitle;

/* loaded from: classes7.dex */
public abstract class EpoxySngViewLandingTitleBinding extends ViewDataBinding {
    public ContentTitle A;
    public final TextView y;
    public final TextView z;

    public EpoxySngViewLandingTitleBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
    }
}
