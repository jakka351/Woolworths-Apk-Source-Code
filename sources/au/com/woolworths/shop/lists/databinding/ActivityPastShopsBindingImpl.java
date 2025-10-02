package au.com.woolworths.shop.lists.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsContract;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsViewModel;
import au.com.woolworths.shop.lists.ui.pastshops.errors.PastShopsFullPageError;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivityPastShopsBindingImpl extends ActivityPastShopsBinding {
    public static final ViewDataBinding.IncludedLayouts H;
    public static final SparseIntArray I;
    public final ContentLoadingProgressBar F;
    public long G;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        H = includedLayouts;
        includedLayouts.a(1, new int[]{4}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 5);
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.recycler_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityPastShopsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, H, I);
        super(dataBindingComponent, view, (ConstraintLayout) objArrT[1], (CoordinatorLayout) objArrT[0], (IncludeGenericErrorStateBinding) objArrT[4], (EpoxyRecyclerView) objArrT[7], (SwipeRefreshLayout) objArrT[2], (Toolbar) objArrT[6]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.A;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[3];
        this.F = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        this.C.setTag(null);
        E(view);
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
        L((PastShopsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.lists.databinding.ActivityPastShopsBinding
    public final void L(PastShopsViewModel pastShopsViewModel) throws Throwable {
        this.E = pastShopsViewModel;
        synchronized (this) {
            this.G |= 4;
        }
        h(273);
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
        PastShopsViewModel pastShopsViewModel = this.E;
        long j2 = 13 & j;
        PastShopsFullPageError pastShopsFullPageError = null;
        boolean z3 = false;
        if (j2 != 0) {
            MediatorLiveData mediatorLiveData = pastShopsViewModel != null ? pastShopsViewModel.i : null;
            I(0, mediatorLiveData);
            PastShopsContract.ViewState viewState = mediatorLiveData != null ? (PastShopsContract.ViewState) mediatorLiveData.e() : null;
            if (viewState != null) {
                pastShopsFullPageError = viewState.c;
                z = viewState.f12367a;
            } else {
                z = false;
            }
            z2 = pastShopsFullPageError == null;
            if (pastShopsFullPageError != null) {
                z3 = true;
            }
        } else {
            z = false;
            z2 = false;
        }
        if ((j & 12) != 0) {
            this.A.L(pastShopsViewModel);
        }
        if (j2 != 0) {
            this.A.M(pastShopsFullPageError);
            BindingAdaptersKt.o(this.A.h, z3);
            BindingAdaptersKt.o(this.F, z);
            BindingAdaptersKt.o(this.C, z2);
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.G != 0) {
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
            this.G = 8L;
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
                this.G |= 1;
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
            this.G |= 2;
        }
        return true;
    }
}
