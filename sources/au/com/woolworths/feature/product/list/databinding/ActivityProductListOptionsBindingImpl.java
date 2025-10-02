package au.com.woolworths.feature.product.list.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBindingKtx;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.ProductListOptionsViewModel;
import com.woolworths.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class ActivityProductListOptionsBindingImpl extends ActivityProductListOptionsBinding {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.product_list_options_fragment_container, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        this.z = (ProductListOptionsViewModel) obj;
        synchronized (this) {
            this.A |= 2;
        }
        h(273);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        ProductListOptionsViewModel productListOptionsViewModel = this.z;
        long j2 = j & 7;
        boolean z = false;
        if (j2 != 0) {
            StateFlow stateFlow = productListOptionsViewModel != null ? productListOptionsViewModel.j : null;
            ViewDataBindingKtx.a(this, 0, stateFlow);
            ProductListOptionsContract.ViewState viewState = stateFlow != null ? (ProductListOptionsContract.ViewState) stateFlow.getValue() : null;
            if (viewState != null) {
                z = viewState.f5258a;
            }
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.A = 4L;
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
            this.A |= 1;
        }
        return true;
    }
}
