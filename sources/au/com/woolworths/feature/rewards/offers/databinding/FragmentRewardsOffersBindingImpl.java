package au.com.woolworths.feature.rewards.offers.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.offers.RewardsOffersContractLegacy;
import au.com.woolworths.feature.rewards.offers.RewardsOffersContractLegacyKt;
import au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy;
import au.com.woolworths.feature.rewards.offers.generated.callback.OnRefreshListener;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.KonfettiView;

/* loaded from: classes3.dex */
public class FragmentRewardsOffersBindingImpl extends FragmentRewardsOffersBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.IncludedLayouts I;
    public static final SparseIntArray J;
    public final FrameLayout F;
    public final OnRefreshListener G;
    public long H;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        I = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.confetti_view, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentRewardsOffersBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, I, J);
        super(dataBindingComponent, view, (KonfettiView) objArrT[5], (EpoxyRecyclerView) objArrT[2], (IncludeGenericErrorStateBinding) objArrT[4], (ContentLoadingProgressBar) objArrT[3], (SwipeRefreshLayout) objArrT[1]);
        this.H = -1L;
        this.z.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.A;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.F = frameLayout;
        frameLayout.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.G = new OnRefreshListener(this);
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
        L((RewardsOffersViewModelLegacy) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.offers.databinding.FragmentRewardsOffersBinding
    public final void L(RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy) throws Throwable {
        this.D = rewardsOffersViewModelLegacy;
        synchronized (this) {
            this.H |= 4;
        }
        h(273);
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = this.D;
        long j3 = j & 13;
        boolean z4 = false;
        if (j3 != 0) {
            MutableLiveData mutableLiveData = rewardsOffersViewModelLegacy != null ? rewardsOffersViewModelLegacy.t : null;
            I(0, mutableLiveData);
            RewardsOffersContractLegacy.ViewState viewState = mutableLiveData != null ? (RewardsOffersContractLegacy.ViewState) mutableLiveData.e() : null;
            rewardsOfferListFullPageErrorState = viewState != null ? viewState.b : null;
            Intrinsics.h(viewState, "<this>");
            z2 = viewState.f6252a && !RewardsOffersContractLegacyKt.a(viewState);
            z3 = viewState.f6252a && RewardsOffersContractLegacyKt.a(viewState);
            boolean z5 = (!viewState.f6252a || RewardsOffersContractLegacyKt.a(viewState)) && RewardsOffersContractLegacyKt.a(viewState) && viewState.b != null;
            boolean zA = RewardsOffersContractLegacyKt.a(viewState);
            j2 = 0;
            byte b = (viewState.b == null || viewState.f6252a) ? false : true;
            if (j3 != 0) {
                j |= b != false ? 32L : 16L;
            }
            z = !z5;
            i = b == true ? 0 : 8;
            z4 = zA;
        } else {
            j2 = 0;
            i = 0;
            z = false;
            z2 = false;
            z3 = false;
        }
        if ((13 & j) != j2) {
            BindingAdaptersKt.o(this.z, z4);
            this.A.h.setVisibility(i);
            this.A.M(rewardsOfferListFullPageErrorState);
            BindingAdaptersKt.o(this.B, z2);
            this.C.setEnabled(z);
            this.C.setRefreshing(z3);
        }
        if ((12 & j) != j2) {
            this.A.L(rewardsOffersViewModelLegacy);
        }
        if ((j & 8) != j2) {
            this.C.setOnRefreshListener(this.G);
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.H != 0) {
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
            this.H = 8L;
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
                this.H |= 1;
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
            this.H |= 2;
        }
        return true;
    }
}
