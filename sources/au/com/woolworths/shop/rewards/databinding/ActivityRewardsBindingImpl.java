package au.com.woolworths.shop.rewards.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.rewards.RewardsContractLegacy;
import au.com.woolworths.shop.rewards.RewardsViewModelLegacy;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivityRewardsBindingImpl extends ActivityRewardsBinding {
    public static final SparseIntArray C;
    public final ContentLoadingProgressBar A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.fragment_container, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityRewardsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, C);
        super(dataBindingComponent, view, (Toolbar) objArrT[2]);
        this.B = -1L;
        ((CoordinatorLayout) objArrT[0]).setTag(null);
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[1];
        this.A = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((RewardsViewModelLegacy) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.rewards.databinding.ActivityRewardsBinding
    public final void L(RewardsViewModelLegacy rewardsViewModelLegacy) throws Throwable {
        this.z = rewardsViewModelLegacy;
        synchronized (this) {
            this.B |= 2;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        RewardsViewModelLegacy rewardsViewModelLegacy = this.z;
        long j2 = j & 7;
        boolean z = false;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = rewardsViewModelLegacy != null ? rewardsViewModelLegacy.h : null;
            I(0, mutableLiveData);
            RewardsContractLegacy.ViewState viewState = mutableLiveData != null ? (RewardsContractLegacy.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z = viewState.f12888a;
            }
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.A, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }
}
