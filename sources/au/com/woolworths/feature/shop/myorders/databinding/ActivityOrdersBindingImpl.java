package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.myorders.orders.OrdersContract;
import au.com.woolworths.feature.shop.myorders.orders.OrdersViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityOrdersBindingImpl extends ActivityOrdersBinding {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.appbar_orders, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.order_list_pager, 4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((OrdersViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.ActivityOrdersBinding
    public final void L(OrdersViewModel ordersViewModel) throws Throwable {
        this.B = ordersViewModel;
        synchronized (this) {
            this.C |= 2;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        OrdersViewModel ordersViewModel = this.B;
        long j2 = j & 7;
        boolean z = false;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = ordersViewModel != null ? ordersViewModel.j : null;
            I(0, mutableLiveData);
            OrdersContract.ViewState viewState = mutableLiveData != null ? (OrdersContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z = viewState.b;
            }
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.z, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
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
            this.C |= 1;
        }
        return true;
    }
}
