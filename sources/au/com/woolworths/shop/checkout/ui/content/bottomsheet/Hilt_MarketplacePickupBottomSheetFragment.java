package au.com.woolworths.shop.checkout.ui.content.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes4.dex */
abstract class Hilt_MarketplacePickupBottomSheetFragment extends BaseBottomSheetFragment implements GeneratedComponentManagerHolder {
    public ViewComponentManager.FragmentContextWrapper e;
    public boolean f;
    public volatile FragmentComponentManager g;
    public final Object h = new Object();
    public boolean i = false;

    public final void b2() {
        if (this.e == null) {
            this.e = new ViewComponentManager.FragmentContextWrapper(super.getContext(), this);
            this.f = FragmentGetContextFix.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f) {
            return null;
        }
        b2();
        return this.e;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        b2();
        if (this.i) {
            return;
        }
        this.i = true;
        ((MarketplacePickupBottomSheetFragment_GeneratedInjector) t3()).getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ViewComponentManager.FragmentContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.g == null) {
            synchronized (this.h) {
                try {
                    if (this.g == null) {
                        this.g = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.g.t3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.e;
        Preconditions.a(fragmentContextWrapper == null || FragmentComponentManager.b(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b2();
        if (this.i) {
            return;
        }
        this.i = true;
        ((MarketplacePickupBottomSheetFragment_GeneratedInjector) t3()).getClass();
    }
}
