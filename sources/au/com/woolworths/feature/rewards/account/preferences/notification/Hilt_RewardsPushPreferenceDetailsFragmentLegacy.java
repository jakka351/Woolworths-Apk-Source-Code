package au.com.woolworths.feature.rewards.account.preferences.notification;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes3.dex */
public abstract class Hilt_RewardsPushPreferenceDetailsFragmentLegacy extends RewardsPreferenceDetailsFragmentLegacy {
    public ViewComponentManager.FragmentContextWrapper l;
    public boolean m;
    public boolean n = false;

    @Override // au.com.woolworths.feature.rewards.account.preferences.Hilt_RewardsPreferenceDetailsFragmentLegacy
    public final void Q1() {
        if (this.n) {
            return;
        }
        this.n = true;
        ((RewardsPushPreferenceDetailsFragmentLegacy_GeneratedInjector) t3()).getClass();
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.Hilt_RewardsPreferenceDetailsFragmentLegacy, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.m) {
            return null;
        }
        h2();
        return this.l;
    }

    public final void h2() {
        if (this.l == null) {
            this.l = new ViewComponentManager.FragmentContextWrapper(super.getContext(), this);
            this.m = FragmentGetContextFix.a(super.getContext());
        }
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.Hilt_RewardsPreferenceDetailsFragmentLegacy, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        h2();
        Q1();
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.Hilt_RewardsPreferenceDetailsFragmentLegacy, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ViewComponentManager.FragmentContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.Hilt_RewardsPreferenceDetailsFragmentLegacy, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.l;
        Preconditions.a(fragmentContextWrapper == null || FragmentComponentManager.b(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h2();
        Q1();
    }
}
