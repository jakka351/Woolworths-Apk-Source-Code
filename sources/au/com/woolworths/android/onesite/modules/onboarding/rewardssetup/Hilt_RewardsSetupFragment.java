package au.com.woolworths.android.onesite.modules.onboarding.rewardssetup;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import au.com.woolworths.android.onesite.modules.LegacyBaseFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes3.dex */
abstract class Hilt_RewardsSetupFragment extends LegacyBaseFragment implements GeneratedComponentManagerHolder {
    public ViewComponentManager.FragmentContextWrapper f;
    public boolean g;
    public volatile FragmentComponentManager h;
    public final Object i = new Object();
    public boolean j = false;

    public final void E1() {
        if (this.f == null) {
            this.f = new ViewComponentManager.FragmentContextWrapper(super.getContext(), this);
            this.g = FragmentGetContextFix.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.g) {
            return null;
        }
        E1();
        return this.f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        E1();
        if (this.j) {
            return;
        }
        this.j = true;
        ((RewardsSetupFragment_GeneratedInjector) t3()).g((RewardsSetupFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ViewComponentManager.FragmentContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.h == null) {
            synchronized (this.i) {
                try {
                    if (this.h == null) {
                        this.h = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.h.t3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.f;
        Preconditions.a(fragmentContextWrapper == null || FragmentComponentManager.b(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        E1();
        if (this.j) {
            return;
        }
        this.j = true;
        ((RewardsSetupFragment_GeneratedInjector) t3()).g((RewardsSetupFragment) this);
    }
}
