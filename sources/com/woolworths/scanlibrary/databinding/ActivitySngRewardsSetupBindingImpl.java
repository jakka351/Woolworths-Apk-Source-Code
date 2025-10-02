package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.woolworths.R;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import com.woolworths.scanlibrary.ui.reward.SngRewardSetupContract;
import com.woolworths.scanlibrary.ui.reward.SngRewardSetupViewModel;
import com.woolworths.scanlibrary.ui.reward.analytics.RewardAnalyticsData;

/* loaded from: classes7.dex */
public class ActivitySngRewardsSetupBindingImpl extends ActivitySngRewardsSetupBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public final View F;
    public final OnClickListener G;
    public final OnClickListener H;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(11);
        J = includedLayouts;
        includedLayouts.a(0, new int[]{5}, new int[]{R.layout.include_sng_generic_error_state}, new String[]{"include_sng_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.loading_layout, 4);
        sparseIntArray.put(R.id.appbar, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.toolbarTitle, 8);
        sparseIntArray.put(R.id.textViewTitle, 9);
        sparseIntArray.put(R.id.textViewBody, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivitySngRewardsSetupBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, J, K);
        Button button = (Button) objArrT[2];
        Button button2 = (Button) objArrT[1];
        IncludeSngGenericErrorStateBinding includeSngGenericErrorStateBinding = (IncludeSngGenericErrorStateBinding) objArrT[5];
        View view2 = (View) objArrT[4];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        Toolbar toolbar = (Toolbar) objArrT[7];
        super(dataBindingComponent, view, button, button2, includeSngGenericErrorStateBinding, view2, constraintLayout, toolbar);
        this.I = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        IncludeSngGenericErrorStateBinding includeSngGenericErrorStateBinding2 = this.A;
        if (includeSngGenericErrorStateBinding2 != null) {
            includeSngGenericErrorStateBinding2.n = this;
        }
        View view3 = (View) objArrT[3];
        this.F = view3;
        view3.setTag(null);
        this.C.setTag(null);
        E(view);
        this.G = new OnClickListener(this, 2);
        this.H = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((SngRewardSetupViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ActivitySngRewardsSetupBinding
    public final void L(SngRewardSetupViewModel sngRewardSetupViewModel) throws Throwable {
        this.E = sngRewardSetupViewModel;
        synchronized (this) {
            this.I |= 4;
        }
        h(273);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        SngRewardSetupViewModel sngRewardSetupViewModel;
        if (i != 1) {
            if (i == 2 && (sngRewardSetupViewModel = this.E) != null) {
                sngRewardSetupViewModel.o.f(SngRewardSetupContract.Actions.JoinReward.f21315a);
                sngRewardSetupViewModel.m.c(RewardAnalyticsData.f);
                return;
            }
            return;
        }
        SngRewardSetupViewModel sngRewardSetupViewModel2 = this.E;
        if (sngRewardSetupViewModel2 != null) {
            sngRewardSetupViewModel2.o.f(SngRewardSetupContract.Actions.LinkReward.f21317a);
            sngRewardSetupViewModel2.m.c(RewardAnalyticsData.e);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int i;
        FetchSngErrorState fetchSngErrorState;
        boolean z;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        SngRewardSetupViewModel sngRewardSetupViewModel = this.E;
        long j2 = j & 13;
        FetchSngErrorState fetchSngErrorState2 = null;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = sngRewardSetupViewModel != null ? sngRewardSetupViewModel.n : null;
            I(0, mutableLiveData);
            SngRewardSetupContract.ViewState viewState = mutableLiveData != null ? (SngRewardSetupContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z = viewState.f21318a;
                fetchSngErrorState = viewState.b;
            } else {
                fetchSngErrorState = null;
                z = false;
            }
            if (j2 != 0) {
                j |= z ? 128L : 64L;
            }
            int i2 = z ? 0 : 8;
            boolean z2 = fetchSngErrorState != null;
            if ((j & 13) != 0) {
                j |= z2 ? 32L : 16L;
            }
            i = z2 ? 0 : 8;
            i = i2;
            fetchSngErrorState2 = fetchSngErrorState;
        } else {
            i = 0;
        }
        if ((8 & j) != 0) {
            this.y.setOnClickListener(this.G);
            this.z.setOnClickListener(this.H);
        }
        if ((13 & j) != 0) {
            this.A.h.setVisibility(i);
            this.A.M(fetchSngErrorState2);
            this.B.setVisibility(i);
            this.F.setVisibility(i);
        }
        if ((j & 12) != 0) {
            this.A.L(sngRewardSetupViewModel);
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 8L;
        }
        this.A.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.I |= 1;
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
            this.I |= 2;
        }
        return true;
    }
}
