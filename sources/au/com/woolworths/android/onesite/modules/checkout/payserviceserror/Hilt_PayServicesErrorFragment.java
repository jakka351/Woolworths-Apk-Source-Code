package au.com.woolworths.android.onesite.modules.checkout.payserviceserror;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import au.com.woolworths.android.onesite.modules.BaseFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes3.dex */
public abstract class Hilt_PayServicesErrorFragment extends BaseFragment implements GeneratedComponentManagerHolder {
    public ViewComponentManager.FragmentContextWrapper g;
    public boolean h;
    public volatile FragmentComponentManager i;
    public final Object j = new Object();
    public boolean k = false;

    public final void I1() {
        if (this.g == null) {
            this.g = new ViewComponentManager.FragmentContextWrapper(super.getContext(), this);
            this.h = FragmentGetContextFix.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.h) {
            return null;
        }
        I1();
        return this.g;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        I1();
        if (this.k) {
            return;
        }
        this.k = true;
        ((PayServicesErrorFragment_GeneratedInjector) t3()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ViewComponentManager.FragmentContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.i == null) {
            synchronized (this.j) {
                try {
                    if (this.i == null) {
                        this.i = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.i.t3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.g;
        Preconditions.a(fragmentContextWrapper == null || FragmentComponentManager.b(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        I1();
        if (this.k) {
            return;
        }
        this.k = true;
        ((PayServicesErrorFragment_GeneratedInjector) t3()).getClass();
    }
}
