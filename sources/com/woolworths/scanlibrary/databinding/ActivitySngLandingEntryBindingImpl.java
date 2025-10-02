package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import com.woolworths.scanlibrary.generated.callback.OnClickListener;
import com.woolworths.scanlibrary.ui.entry.SngEntryContract;
import com.woolworths.scanlibrary.ui.entry.SngEntryViewModel;
import com.woolworths.scanlibrary.ui.entry.analytics.SngWelcomeTracking;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public class ActivitySngLandingEntryBindingImpl extends ActivitySngLandingEntryBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public final OnClickListener F;
    public final OnClickListener G;
    public final OnClickListener H;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        J = includedLayouts;
        includedLayouts.a(0, new int[]{5}, new int[]{R.layout.include_sng_generic_error_state}, new String[]{"include_sng_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.content_recyclerview, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivitySngLandingEntryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, J, K);
        super(dataBindingComponent, view, (ImageView) objArrT[4], (Button) objArrT[2], (Button) objArrT[3], (EpoxyRecyclerView) objArrT[6], (IncludeSngGenericErrorStateBinding) objArrT[5], (Group) objArrT[1]);
        this.I = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        IncludeSngGenericErrorStateBinding includeSngGenericErrorStateBinding = this.C;
        if (includeSngGenericErrorStateBinding != null) {
            includeSngGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.D.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 3);
        this.G = new OnClickListener(this, 1);
        this.H = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.C.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((SngEntryViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ActivitySngLandingEntryBinding
    public final void L(SngEntryViewModel sngEntryViewModel) throws Throwable {
        this.E = sngEntryViewModel;
        synchronized (this) {
            this.I |= 4;
        }
        h(273);
        y();
    }

    @Override // com.woolworths.scanlibrary.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        SngEntryViewModel sngEntryViewModel;
        if (i == 1) {
            SngEntryViewModel sngEntryViewModel2 = this.E;
            if (sngEntryViewModel2 != null) {
                sngEntryViewModel2.j.c(SngWelcomeTracking.h);
                sngEntryViewModel2.m.f(SngEntryContract.Actions.ShowNearestStore.f21248a);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (sngEntryViewModel = this.E) != null) {
                sngEntryViewModel.j.c(SngWelcomeTracking.e);
                sngEntryViewModel.m.f(SngEntryContract.Actions.Close.f21245a);
                return;
            }
            return;
        }
        SngEntryViewModel sngEntryViewModel3 = this.E;
        if (sngEntryViewModel3 != null) {
            sngEntryViewModel3.j.c(SngWelcomeTracking.f);
            RewardsCardData b = sngEntryViewModel3.h.getB();
            String number = b != null ? b.getNumber() : null;
            if (number == null || StringsKt.D(number)) {
                sngEntryViewModel3.m.f(SngEntryContract.Actions.ShowAddRewardSetup.f21247a);
            } else {
                sngEntryViewModel3.r6();
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int i;
        boolean z;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        SngEntryViewModel sngEntryViewModel = this.E;
        long j2 = j & 13;
        FetchSngErrorState fetchSngErrorState = null;
        int i2 = 0;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = sngEntryViewModel != null ? sngEntryViewModel.o : null;
            I(0, mutableLiveData);
            SngEntryContract.ViewState viewState = mutableLiveData != null ? (SngEntryContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                fetchSngErrorState = viewState.c;
                z = viewState.b;
            } else {
                z = false;
            }
            if (j2 != 0) {
                j |= z ? 128L : 64L;
            }
            boolean z2 = fetchSngErrorState != null;
            i = z ? 0 : 8;
            if ((j & 13) != 0) {
                j |= z2 ? 32L : 16L;
            }
            if (!z2) {
                i2 = 8;
            }
        } else {
            i = 0;
        }
        if ((8 & j) != 0) {
            this.y.setOnClickListener(this.F);
            this.z.setOnClickListener(this.G);
            this.A.setOnClickListener(this.H);
        }
        if ((13 & j) != 0) {
            this.C.h.setVisibility(i2);
            this.C.M(fetchSngErrorState);
            this.D.setVisibility(i);
        }
        if ((j & 12) != 0) {
            this.C.L(sngEntryViewModel);
        }
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.C.p();
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
        this.C.r();
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
