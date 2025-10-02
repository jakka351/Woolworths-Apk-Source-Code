package au.com.woolworths.feature.rewards.account.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlContract;
import au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlErrorState;
import au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel;
import au.com.woolworths.rewards.base.databinding.IncludeRewardsGenericErrorStateFullScreenBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityRewardsCallbackUrlBindingImpl extends ActivityRewardsCallbackUrlBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public final ContentLoadingProgressBar C;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.include_rewards_generic_error_state_full_screen}, new String[]{"include_rewards_generic_error_state_full_screen"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityRewardsCallbackUrlBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, E, F);
        super(dataBindingComponent, view, (IncludeRewardsGenericErrorStateFullScreenBinding) objArrT[4], (Toolbar) objArrT[1], (WebView) objArrT[2]);
        this.D = -1L;
        IncludeRewardsGenericErrorStateFullScreenBinding includeRewardsGenericErrorStateFullScreenBinding = this.y;
        if (includeRewardsGenericErrorStateFullScreenBinding != null) {
            includeRewardsGenericErrorStateFullScreenBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[3];
        this.C = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
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
        L((RewardsCallbackUrlViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.account.databinding.ActivityRewardsCallbackUrlBinding
    public final void L(RewardsCallbackUrlViewModel rewardsCallbackUrlViewModel) throws Throwable {
        this.B = rewardsCallbackUrlViewModel;
        synchronized (this) {
            this.D |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        RewardsCallbackUrlViewModel rewardsCallbackUrlViewModel = this.B;
        long j2 = 13 & j;
        RewardsCallbackUrlErrorState rewardsCallbackUrlErrorState = null;
        boolean z3 = false;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = rewardsCallbackUrlViewModel != null ? rewardsCallbackUrlViewModel.h : null;
            I(0, mutableLiveData);
            RewardsCallbackUrlContract.ViewState viewState = mutableLiveData != null ? (RewardsCallbackUrlContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                rewardsCallbackUrlErrorState = viewState.d;
                z = viewState.f5679a;
                str = viewState.b;
            } else {
                str = null;
                z = false;
            }
            z2 = rewardsCallbackUrlErrorState == null;
            if (rewardsCallbackUrlErrorState != null) {
                z3 = true;
            }
        } else {
            str = null;
            z = false;
            z2 = false;
        }
        if ((j & 12) != 0) {
            this.y.L(rewardsCallbackUrlViewModel);
        }
        if (j2 != 0) {
            this.y.M(rewardsCallbackUrlErrorState);
            BindingAdaptersKt.o(this.y.h, z3);
            BindingAdaptersKt.o(this.C, z);
            this.z.setTitle(str);
            BindingAdaptersKt.o(this.A, z2);
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
