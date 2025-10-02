package au.com.woolworths.feature.rewards.account.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContract;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageErrorState;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityRewardsAuthenicationBindingImpl extends ActivityRewardsAuthenicationBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 4);
        sparseIntArray.put(R.id.toolbar, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((RewardsAuthenticationViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.account.databinding.ActivityRewardsAuthenicationBinding
    public final void L(RewardsAuthenticationViewModel rewardsAuthenticationViewModel) throws Throwable {
        this.C = rewardsAuthenticationViewModel;
        synchronized (this) {
            this.D |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int i;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        RewardsAuthenticationViewModel rewardsAuthenticationViewModel = this.C;
        long j2 = j & 13;
        RewardsAuthenticationFullPageErrorState rewardsAuthenticationFullPageErrorState = null;
        boolean z3 = false;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = rewardsAuthenticationViewModel != null ? rewardsAuthenticationViewModel.n : null;
            I(0, mutableLiveData);
            RewardsAuthenticationContract.ViewState viewState = mutableLiveData != null ? (RewardsAuthenticationContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                rewardsAuthenticationFullPageErrorState = viewState.b;
                z2 = viewState.f5655a;
            } else {
                z2 = false;
            }
            boolean z4 = rewardsAuthenticationFullPageErrorState != null;
            z = !z2;
            if (j2 != 0) {
                j |= z4 ? 32L : 16L;
            }
            i = z4 ? 0 : 8;
            z3 = z2;
        } else {
            i = 0;
            z = false;
        }
        if ((13 & j) != 0) {
            BindingAdaptersKt.o(this.y, z3);
            this.z.h.setVisibility(i);
            this.z.M(rewardsAuthenticationFullPageErrorState);
            BindingAdaptersKt.o(this.B, z);
        }
        if ((j & 12) != 0) {
            this.z.L(rewardsAuthenticationViewModel);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.z.p();
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
        this.z.r();
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
