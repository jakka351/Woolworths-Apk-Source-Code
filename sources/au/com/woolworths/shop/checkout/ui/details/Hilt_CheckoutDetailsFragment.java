package au.com.woolworths.shop.checkout.ui.details;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes4.dex */
abstract class Hilt_CheckoutDetailsFragment extends CheckoutContentFragment implements GeneratedComponentManagerHolder {
    public ViewComponentManager.FragmentContextWrapper m;
    public boolean n;
    public volatile FragmentComponentManager o;
    public final Object p = new Object();
    public boolean q = false;

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.n) {
            return null;
        }
        n2();
        return this.m;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void n2() {
        if (this.m == null) {
            this.m = new ViewComponentManager.FragmentContextWrapper(super.getContext(), this);
            this.n = FragmentGetContextFix.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        n2();
        if (this.q) {
            return;
        }
        this.q = true;
        ((CheckoutDetailsFragment_GeneratedInjector) t3()).R((CheckoutDetailsFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ViewComponentManager.FragmentContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.o == null) {
            synchronized (this.p) {
                try {
                    if (this.o == null) {
                        this.o = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.o.t3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.m;
        Preconditions.a(fragmentContextWrapper == null || FragmentComponentManager.b(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        n2();
        if (this.q) {
            return;
        }
        this.q = true;
        ((CheckoutDetailsFragment_GeneratedInjector) t3()).R((CheckoutDetailsFragment) this);
    }
}
