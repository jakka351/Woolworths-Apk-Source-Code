package com.woolworths.scanlibrary.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public abstract class CustomInstrumentListsViewBinding extends ViewDataBinding {
    public static final /* synthetic */ int z = 0;
    public final RecyclerView y;

    public CustomInstrumentListsViewBinding(DataBindingComponent dataBindingComponent, View view, RecyclerView recyclerView) {
        super(dataBindingComponent, view, 0);
        this.y = recyclerView;
    }
}
