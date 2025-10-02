package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.scanlibrary.ui.entry.SngEntryViewModel;

/* loaded from: classes7.dex */
public abstract class ActivitySngLandingEntryBinding extends ViewDataBinding {
    public final Button A;
    public final EpoxyRecyclerView B;
    public final IncludeSngGenericErrorStateBinding C;
    public final Group D;
    public SngEntryViewModel E;
    public final ImageView y;
    public final Button z;

    public ActivitySngLandingEntryBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, Button button, Button button2, EpoxyRecyclerView epoxyRecyclerView, IncludeSngGenericErrorStateBinding includeSngGenericErrorStateBinding, Group group) {
        super(dataBindingComponent, view, 2);
        this.y = imageView;
        this.z = button;
        this.A = button2;
        this.B = epoxyRecyclerView;
        this.C = includeSngGenericErrorStateBinding;
        this.D = group;
    }

    public abstract void L(SngEntryViewModel sngEntryViewModel);
}
