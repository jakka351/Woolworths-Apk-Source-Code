package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreViewModel;

/* loaded from: classes7.dex */
public class ActivityAvailableStoresBindingImpl extends ActivityAvailableStoresBinding {
    public static final ViewDataBinding.IncludedLayouts G;
    public static final SparseIntArray H;
    public long F;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        G = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.layout_dark_toolbar}, new String[]{"layout_dark_toolbar"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.availableStates, 2);
        sparseIntArray.put(R.id.availableStores, 3);
        sparseIntArray.put(R.id.empty_icon, 4);
        sparseIntArray.put(R.id.storeEmptyMsg, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.B.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        if (273 != i) {
            return false;
        }
        this.E = (AvailableStoreViewModel) obj;
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ActivityAvailableStoresBinding
    public final void L(AvailableStoreViewModel availableStoreViewModel) {
        this.E = availableStoreViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.F = 0L;
        }
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 4L;
        }
        this.B.r();
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
            this.F |= 1;
        }
        return true;
    }
}
