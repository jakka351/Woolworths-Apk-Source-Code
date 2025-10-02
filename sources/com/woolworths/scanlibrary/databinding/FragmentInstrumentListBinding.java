package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.InstrumentListView;

/* loaded from: classes7.dex */
public abstract class FragmentInstrumentListBinding extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView y;
    public final InstrumentListView z;

    public FragmentInstrumentListBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, InstrumentListView instrumentListView, LinearLayout linearLayout) {
        super(dataBindingComponent, view, 1);
        this.y = textView;
        this.z = instrumentListView;
        this.A = linearLayout;
    }
}
