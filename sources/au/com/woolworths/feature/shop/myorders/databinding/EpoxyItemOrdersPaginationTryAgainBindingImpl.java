package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListTryAgain;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersTab;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemOrdersPaginationTryAgainBindingImpl extends EpoxyItemOrdersPaginationTryAgainBinding implements OnClickListener.Listener {
    public static final SparseIntArray D;
    public final OnClickListener B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.label, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrdersPaginationTryAgainBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, D);
        super(dataBindingComponent, view, (Button) objArrT[1]);
        this.C = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        E(view);
        this.B = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 == i) {
            this.A = (OrdersListViewModel) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(273);
            y();
            return true;
        }
        if (251 != i) {
            return false;
        }
        this.z = (OrderListTryAgain) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(251);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrdersListViewModel ordersListViewModel = this.A;
        OrderListTryAgain orderListTryAgain = this.z;
        if (ordersListViewModel == null || orderListTryAgain == null) {
            return;
        }
        ordersListViewModel.s6(Integer.valueOf(orderListTryAgain.f7875a));
        AnalyticsManager analyticsManager = ordersListViewModel.f;
        OrdersTab ordersTab = ordersListViewModel.g;
        if (ordersTab != null) {
            analyticsManager.c(ordersTab.getK());
        } else {
            Intrinsics.p("ordersTab");
            throw null;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.B);
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
        return false;
    }
}
