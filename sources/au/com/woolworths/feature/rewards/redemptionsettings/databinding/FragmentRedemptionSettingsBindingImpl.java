package au.com.woolworths.feature.rewards.redemptionsettings.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsErrorState;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsViewModel;
import au.com.woolworths.rewards.base.databinding.IncludeRewardsGenericErrorStateFullScreenBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentRedemptionSettingsBindingImpl extends FragmentRedemptionSettingsBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public final ProgressBar C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_rewards_generic_error_state_full_screen}, new String[]{"include_rewards_generic_error_state_full_screen"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.rewards_settings_recycler_view, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentRedemptionSettingsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, E, F);
        super(dataBindingComponent, view, (IncludeRewardsGenericErrorStateFullScreenBinding) objArrT[2], (EpoxyRecyclerView) objArrT[3]);
        this.D = -1L;
        IncludeRewardsGenericErrorStateFullScreenBinding includeRewardsGenericErrorStateFullScreenBinding = this.y;
        if (includeRewardsGenericErrorStateFullScreenBinding != null) {
            includeRewardsGenericErrorStateFullScreenBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ProgressBar progressBar = (ProgressBar) objArrT[1];
        this.C = progressBar;
        progressBar.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((RewardsRedemptionSettingsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.databinding.FragmentRedemptionSettingsBinding
    public final void L(RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel) throws Throwable {
        this.A = rewardsRedemptionSettingsViewModel;
        synchronized (this) {
            this.D |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel = this.A;
        long j2 = j & 13;
        RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState = null;
        int i = 0;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = rewardsRedemptionSettingsViewModel != null ? rewardsRedemptionSettingsViewModel.l : null;
            I(0, mutableLiveData);
            RewardsRedemptionSettingsContract.ViewState viewState = mutableLiveData != null ? (RewardsRedemptionSettingsContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                rewardsRedemptionSettingsErrorState = viewState.d;
                z = viewState.f6432a;
            } else {
                z = false;
            }
            boolean z2 = rewardsRedemptionSettingsErrorState != null;
            if (j2 != 0) {
                j |= z2 ? 32L : 16L;
            }
            if (!z2) {
                i = 8;
            }
        } else {
            z = false;
        }
        if ((13 & j) != 0) {
            this.y.h.setVisibility(i);
            this.y.M(rewardsRedemptionSettingsErrorState);
            BindingAdaptersKt.o(this.C, z);
        }
        if ((j & 12) != 0) {
            this.y.L(rewardsRedemptionSettingsViewModel);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 8L;
        }
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.D |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 2;
        }
        return true;
    }
}
