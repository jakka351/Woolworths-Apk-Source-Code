package au.com.woolworths.feature.shop.notification.preferences.guest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes3.dex */
public abstract class Hilt_ShopNotificationPreferencesGuestFragment extends GuestLoginFragment implements GeneratedComponentManagerHolder {
    public ViewComponentManager.FragmentContextWrapper k;
    public boolean l;
    public volatile FragmentComponentManager m;
    public final Object n = new Object();
    public boolean o = false;

    public final void R1() {
        if (this.k == null) {
            this.k = new ViewComponentManager.FragmentContextWrapper(super.getContext(), this);
            this.l = FragmentGetContextFix.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.l) {
            return null;
        }
        R1();
        return this.k;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        R1();
        if (this.o) {
            return;
        }
        this.o = true;
        ((ShopNotificationPreferencesGuestFragment_GeneratedInjector) t3()).K((ShopNotificationPreferencesGuestFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ViewComponentManager.FragmentContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.m == null) {
            synchronized (this.n) {
                try {
                    if (this.m == null) {
                        this.m = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.m.t3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.k;
        Preconditions.a(fragmentContextWrapper == null || FragmentComponentManager.b(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        R1();
        if (this.o) {
            return;
        }
        this.o = true;
        ((ShopNotificationPreferencesGuestFragment_GeneratedInjector) t3()).K((ShopNotificationPreferencesGuestFragment) this);
    }
}
