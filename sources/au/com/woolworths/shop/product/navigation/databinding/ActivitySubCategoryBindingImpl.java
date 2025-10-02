package au.com.woolworths.shop.product.navigation.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryContract;
import au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivitySubCategoryBindingImpl extends ActivitySubCategoryBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((SubCategoryViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.product.navigation.databinding.ActivitySubCategoryBinding
    public final void L(SubCategoryViewModel subCategoryViewModel) throws Throwable {
        this.C = subCategoryViewModel;
        synchronized (this) {
            this.D |= 4;
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
            j = this.D;
            this.D = 0L;
        }
        SubCategoryViewModel subCategoryViewModel = this.C;
        long j2 = j & 13;
        FullPageErrorCause fullPageErrorCause = null;
        int i = 0;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = subCategoryViewModel != null ? subCategoryViewModel.j : null;
            I(0, mutableLiveData);
            SubCategoryContract.ViewState viewState = mutableLiveData != null ? (SubCategoryContract.ViewState) mutableLiveData.e() : null;
            z2 = (viewState == null || viewState.f12646a || viewState.c != null) ? false : true;
            if (viewState != null) {
                fullPageErrorCause = viewState.c;
                z = viewState.f12646a;
            } else {
                z = false;
            }
            boolean z3 = fullPageErrorCause != null;
            if (j2 != 0) {
                j |= z3 ? 32L : 16L;
            }
            if (!z3) {
                i = 8;
            }
        } else {
            z = false;
            z2 = false;
        }
        if ((13 & j) != 0) {
            this.y.h.setVisibility(i);
            this.y.M(fullPageErrorCause);
            BindingAdaptersKt.o(this.z, z2);
            BindingAdaptersKt.o(this.A, z);
        }
        if ((j & 12) != 0) {
            this.y.L(subCategoryViewModel);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.y.p();
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
        this.y.r();
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
