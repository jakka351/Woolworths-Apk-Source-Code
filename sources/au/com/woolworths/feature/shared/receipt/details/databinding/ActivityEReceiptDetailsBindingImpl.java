package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsContract;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsFullPageErrorState;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityEReceiptDetailsBindingImpl extends ActivityEReceiptDetailsBinding {
    public static final ViewDataBinding.IncludedLayouts H;
    public static final SparseIntArray I;
    public final ContentLoadingProgressBar F;
    public long G;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        H = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.guideline, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityEReceiptDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, H, I);
        super(dataBindingComponent, view, (CoordinatorLayout) objArrT[0], (IncludeGenericErrorStateBinding) objArrT[4], (View) objArrT[6], (ProgressBar) objArrT[1], (EpoxyRecyclerView) objArrT[2], (Toolbar) objArrT[5]);
        this.G = -1L;
        this.y.setTag(null);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.z;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) objArrT[3];
        this.F = contentLoadingProgressBar;
        contentLoadingProgressBar.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        r();
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
        L((EReceiptDetailsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shared.receipt.details.databinding.ActivityEReceiptDetailsBinding
    public final void L(EReceiptDetailsViewModel eReceiptDetailsViewModel) throws Throwable {
        this.E = eReceiptDetailsViewModel;
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
        boolean z3;
        boolean z4;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        EReceiptDetailsViewModel eReceiptDetailsViewModel = this.E;
        long j2 = j & 13;
        EReceiptDetailsFullPageErrorState eReceiptDetailsFullPageErrorState = null;
        int i = 0;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = eReceiptDetailsViewModel != null ? eReceiptDetailsViewModel.i : null;
            I(0, mutableLiveData);
            EReceiptDetailsContract.ViewState viewState = mutableLiveData != null ? (EReceiptDetailsContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                eReceiptDetailsFullPageErrorState = viewState.e;
                z2 = viewState.f6552a;
                z4 = viewState.b;
            } else {
                z4 = false;
                z2 = false;
            }
            boolean z5 = eReceiptDetailsFullPageErrorState != null;
            z3 = !z2;
            z = !z4;
            if (j2 != 0) {
                j |= z5 ? 32L : 16L;
            }
            if (!z5) {
                i = 8;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        if ((13 & j) != 0) {
            this.z.h.setVisibility(i);
            this.z.M(eReceiptDetailsFullPageErrorState);
            BindingAdaptersKt.o(this.F, z2);
            BindingAdaptersKt.j(this.B, z);
            BindingAdaptersKt.o(this.C, z3);
        }
        if ((j & 12) != 0) {
            this.z.L(eReceiptDetailsViewModel);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.G != 0) {
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
            this.G = 8L;
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
