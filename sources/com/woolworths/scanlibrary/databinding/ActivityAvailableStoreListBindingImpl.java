package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreContract;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public class ActivityAvailableStoreListBindingImpl extends ActivityAvailableStoreListBinding {
    public static final ViewDataBinding.IncludedLayouts G;
    public static final SparseIntArray H;
    public long F;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        G = includedLayouts;
        includedLayouts.a(0, new int[]{2, 3, 4}, new int[]{R.layout.layout_wow_toolbar, R.layout.include_no_sng_store, R.layout.include_sng_network_error}, new String[]{"layout_wow_toolbar", "include_no_sng_store", "include_sng_network_error"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.tabStates, 5);
        sparseIntArray.put(R.id.divider, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
        this.B.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((AvailableStoreViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ActivityAvailableStoreListBinding
    public final void L(AvailableStoreViewModel availableStoreViewModel) throws Throwable {
        this.E = availableStoreViewModel;
        synchronized (this) {
            this.F |= 16;
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
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        AvailableStoreViewModel availableStoreViewModel = this.E;
        long j2 = j & 50;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = availableStoreViewModel != null ? availableStoreViewModel.n : null;
            I(1, mutableLiveData);
            AvailableStoreContract.ViewState viewState = mutableLiveData != null ? (AvailableStoreContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z2 = viewState.f21339a;
                z = viewState.b;
            } else {
                z = false;
                z2 = false;
            }
            z3 = !z2;
            if (j2 != 0) {
                j = !z2 ? j | 128 : j | 64;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean z4 = (j & 128) != 0 ? !z : false;
        long j3 = 50 & j;
        if (j3 == 0 || !z3) {
            z4 = false;
        }
        if (j3 != 0) {
            this.A.M(Boolean.valueOf(z));
            this.B.L(Boolean.valueOf(z2));
            EpoxyRecyclerView view = this.C;
            Intrinsics.h(view, "view");
            view.setVisibility(z4 ? 0 : 4);
        }
        if ((j & 48) != 0) {
            this.A.L(availableStoreViewModel);
        }
        this.z.k();
        this.B.k();
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.z.p() || this.B.p() || this.A.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 32L;
        }
        this.z.r();
        this.B.r();
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
                this.F |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.F |= 4;
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 8;
        }
        return true;
    }
}
