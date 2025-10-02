package au.com.woolworths.feature.product.list;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes3.dex */
public abstract class Hilt_ProductListFragment extends Fragment implements GeneratedComponentManagerHolder {
    public ViewComponentManager.FragmentContextWrapper d;
    public boolean e;
    public volatile FragmentComponentManager f;
    public final Object g = new Object();
    public boolean h = false;

    public final void E1() {
        if (this.d == null) {
            this.d = new ViewComponentManager.FragmentContextWrapper(super.getContext(), this);
            this.e = FragmentGetContextFix.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.e) {
            return null;
        }
        E1();
        return this.d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        E1();
        if (this.h) {
            return;
        }
        this.h = true;
        ((ProductListFragment_GeneratedInjector) t3()).M((ProductListFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ViewComponentManager.FragmentContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.f == null) {
            synchronized (this.g) {
                try {
                    if (this.f == null) {
                        this.f = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f.t3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.d;
        Preconditions.a(fragmentContextWrapper == null || FragmentComponentManager.b(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        E1();
        if (this.h) {
            return;
        }
        this.h = true;
        ((ProductListFragment_GeneratedInjector) t3()).M((ProductListFragment) this);
    }
}
