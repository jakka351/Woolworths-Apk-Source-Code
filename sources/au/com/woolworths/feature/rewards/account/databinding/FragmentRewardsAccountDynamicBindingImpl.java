package au.com.woolworths.feature.rewards.account.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.feature.rewards.account.generated.callback.OnRefreshListener;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsContractOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentRewardsAccountDynamicBindingImpl extends FragmentRewardsAccountDynamicBinding implements OnRefreshListener.Listener {
    public static final SparseIntArray H;
    public final OnRefreshListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.recycler_view, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentRewardsAccountDynamicBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, H);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArrT[0];
        super(dataBindingComponent, view, coordinatorLayout, (EpoxyRecyclerView) objArrT[4], (SwipeRefreshLayout) objArrT[1], (Toolbar) objArrT[3]);
        this.G = -1L;
        this.y.setTag(null);
        this.A.setTag(null);
        E(view);
        this.F = new OnRefreshListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (274 == i) {
            M((AccountSettingsContractOld.ViewState) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        L((AccountSettingsViewModelOld) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsAccountDynamicBinding
    public final void L(AccountSettingsViewModelOld accountSettingsViewModelOld) throws Throwable {
        this.C = accountSettingsViewModelOld;
        synchronized (this) {
            this.G |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsAccountDynamicBinding
    public final void M(AccountSettingsContractOld.ViewState viewState) throws Throwable {
        this.D = viewState;
        synchronized (this) {
            this.G |= 1;
        }
        h(274);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        AccountSettingsContractOld.ViewState viewState = this.D;
        long j2 = 5 & j;
        if (j2 == 0 || viewState == null) {
            z = false;
            z2 = false;
        } else {
            z = viewState.f;
            z2 = viewState.g;
        }
        if (j2 != 0) {
            this.A.setEnabled(z2);
            this.A.setRefreshing(z);
        }
        if ((j & 4) != 0) {
            this.A.setOnRefreshListener(this.F);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
