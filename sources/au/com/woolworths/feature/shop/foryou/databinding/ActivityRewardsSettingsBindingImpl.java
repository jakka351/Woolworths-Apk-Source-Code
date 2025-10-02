package au.com.woolworths.feature.shop.foryou.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.foryou.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsContract;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityRewardsSettingsBindingImpl extends ActivityRewardsSettingsBinding implements OnClickListener.Listener {
    public static final SparseIntArray E;
    public final OnClickListener C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.loading_layout, 1);
        sparseIntArray.put(R.id.app_bar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.recycler_view, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityRewardsSettingsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, E);
        super(dataBindingComponent, view, (View) objArrT[1], (EpoxyRecyclerView) objArrT[4], (Toolbar) objArrT[3]);
        this.D = -1L;
        ((CoordinatorLayout) objArrT[0]).setTag(null);
        E(view);
        this.C = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((RewardsSettingsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.foryou.databinding.ActivityRewardsSettingsBinding
    public final void L(RewardsSettingsViewModel rewardsSettingsViewModel) throws Throwable {
        this.B = rewardsSettingsViewModel;
        synchronized (this) {
            this.D |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.shop.foryou.generated.callback.OnClickListener.Listener
    public final void a(int i) {
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        RewardsSettingsViewModel rewardsSettingsViewModel = this.B;
        long j2 = 7 & j;
        boolean z = false;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = rewardsSettingsViewModel != null ? rewardsSettingsViewModel.j : null;
            I(0, mutableLiveData);
            RewardsSettingsContract.ViewState viewState = mutableLiveData != null ? (RewardsSettingsContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z = viewState.f7142a;
            }
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.C);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 4L;
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
            this.D |= 1;
        }
        return true;
    }
}
