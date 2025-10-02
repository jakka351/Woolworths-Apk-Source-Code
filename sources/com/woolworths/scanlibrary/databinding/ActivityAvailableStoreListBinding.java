package com.woolworths.scanlibrary.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreViewModel;

/* loaded from: classes7.dex */
public abstract class ActivityAvailableStoreListBinding extends ViewDataBinding {
    public final IncludeSngNetworkErrorBinding A;
    public final IncludeNoSngStoreBinding B;
    public final EpoxyRecyclerView C;
    public final TabLayout D;
    public AvailableStoreViewModel E;
    public final View y;
    public final LayoutWowToolbarBinding z;

    public ActivityAvailableStoreListBinding(DataBindingComponent dataBindingComponent, View view, View view2, LayoutWowToolbarBinding layoutWowToolbarBinding, IncludeSngNetworkErrorBinding includeSngNetworkErrorBinding, IncludeNoSngStoreBinding includeNoSngStoreBinding, EpoxyRecyclerView epoxyRecyclerView, TabLayout tabLayout) {
        super(dataBindingComponent, view, 4);
        this.y = view2;
        this.z = layoutWowToolbarBinding;
        this.A = includeSngNetworkErrorBinding;
        this.B = includeNoSngStoreBinding;
        this.C = epoxyRecyclerView;
        this.D = tabLayout;
    }

    public abstract void L(AvailableStoreViewModel availableStoreViewModel);
}
