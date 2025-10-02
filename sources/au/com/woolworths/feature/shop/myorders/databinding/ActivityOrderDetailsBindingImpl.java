package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ActivityOrderDetailsBindingImpl extends ActivityOrderDetailsBinding {
    public static final ViewDataBinding.IncludedLayouts H;
    public static final SparseIntArray I;
    public long G;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        H = includedLayouts;
        includedLayouts.a(1, new int[]{5, 6}, new int[]{R.layout.include_generic_error_state, R.layout.include_order_delivered_animation_view}, new String[]{"include_generic_error_state", "include_order_delivered_animation_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.appbar_orders, 7);
        sparseIntArray.put(R.id.toolbar, 8);
        sparseIntArray.put(R.id.order_details, 9);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
        this.E.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((OrderDetailsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderDetailsBinding
    public final void L(OrderDetailsViewModel orderDetailsViewModel) throws Throwable {
        this.F = orderDetailsViewModel;
        synchronized (this) {
            this.G |= 8;
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
            j = this.G;
            this.G = 0L;
        }
        OrderDetailsViewModel orderDetailsViewModel = this.F;
        long j2 = j & 25;
        int i = 0;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = orderDetailsViewModel != null ? orderDetailsViewModel.w : null;
            I(0, mutableLiveData);
            OrderDetailsContract.ViewState viewState = mutableLiveData != null ? (OrderDetailsContract.ViewState) mutableLiveData.e() : null;
            orderDetailsFullPageErrorState = viewState != null ? viewState.b : null;
            Intrinsics.h(viewState, "<this>");
            OrderDetailsContract.LoadingState loadingState = viewState.f7671a;
            z2 = loadingState == OrderDetailsContract.LoadingState.f;
            z = loadingState == OrderDetailsContract.LoadingState.d;
            z3 = orderDetailsFullPageErrorState == null;
            if (j2 != 0) {
                j |= z3 ? 64L : 32L;
            }
            if (z3) {
                i = 8;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        if ((25 & j) != 0) {
            this.y.h.setVisibility(i);
            this.y.M(orderDetailsFullPageErrorState);
            BindingAdaptersKt.o(this.z, z);
            BindingAdaptersKt.o(this.B, z);
            this.C.setRefreshing(z2);
            BindingAdaptersKt.o(this.C, z3);
        }
        if ((j & 24) != 0) {
            this.y.L(orderDetailsViewModel);
        }
        this.y.k();
        this.E.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                return this.y.p() || this.E.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 16L;
        }
        this.y.r();
        this.E.r();
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
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 4;
        }
        return true;
    }
}
