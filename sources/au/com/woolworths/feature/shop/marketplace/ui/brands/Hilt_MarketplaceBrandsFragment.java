package au.com.woolworths.feature.shop.marketplace.ui.brands;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes3.dex */
abstract class Hilt_MarketplaceBrandsFragment extends MarketplaceFacetFragment implements GeneratedComponentManagerHolder {
    public ViewComponentManager.FragmentContextWrapper h;
    public boolean i;
    public volatile FragmentComponentManager j;
    public final Object k = new Object();
    public boolean l = false;

    public final void I1() {
        if (this.h == null) {
            this.h = new ViewComponentManager.FragmentContextWrapper(super.getContext(), this);
            this.i = FragmentGetContextFix.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.i) {
            return null;
        }
        I1();
        return this.h;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        I1();
        if (this.l) {
            return;
        }
        this.l = true;
        ((MarketplaceBrandsFragment_GeneratedInjector) t3()).e((MarketplaceBrandsFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ViewComponentManager.FragmentContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.j == null) {
            synchronized (this.k) {
                try {
                    if (this.j == null) {
                        this.j = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.j.t3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.h;
        Preconditions.a(fragmentContextWrapper == null || FragmentComponentManager.b(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        I1();
        if (this.l) {
            return;
        }
        this.l = true;
        ((MarketplaceBrandsFragment_GeneratedInjector) t3()).e((MarketplaceBrandsFragment) this);
    }
}
