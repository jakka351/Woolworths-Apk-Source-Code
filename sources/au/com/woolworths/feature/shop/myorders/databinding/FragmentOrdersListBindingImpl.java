package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnRefreshListener;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class FragmentOrdersListBindingImpl extends FragmentOrdersListBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public final FrameLayout G;
    public final OnRefreshListener H;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        J = includedLayouts;
        includedLayouts.a(2, new int[]{4, 5}, new int[]{R.layout.include_generic_error_state, R.layout.epoxy_item_orders_see_all_link}, new String[]{"include_generic_error_state", "epoxy_item_orders_see_all_link"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.progress_bar, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentOrdersListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, J, K);
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = (IncludeGenericErrorStateBinding) objArrT[4];
        EpoxyItemOrdersSeeAllLinkBinding epoxyItemOrdersSeeAllLinkBinding = (EpoxyItemOrdersSeeAllLinkBinding) objArrT[5];
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) objArrT[3];
        super(dataBindingComponent, view, includeGenericErrorStateBinding, epoxyItemOrdersSeeAllLinkBinding, epoxyRecyclerView, (SwipeRefreshLayout) objArrT[1]);
        this.I = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding2 = this.y;
        if (includeGenericErrorStateBinding2 != null) {
            includeGenericErrorStateBinding2.n = this;
        }
        EpoxyItemOrdersSeeAllLinkBinding epoxyItemOrdersSeeAllLinkBinding2 = this.z;
        if (epoxyItemOrdersSeeAllLinkBinding2 != null) {
            epoxyItemOrdersSeeAllLinkBinding2.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrT[2];
        this.G = frameLayout;
        frameLayout.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.H = new OnRefreshListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (77 == i) {
            L((FullPageErrorStateClickHandler) obj);
            return true;
        }
        if (259 == i) {
            N((Function0) obj);
            return true;
        }
        if (156 != i) {
            return false;
        }
        M((OrdersListViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.FragmentOrdersListBinding
    public final void L(FullPageErrorStateClickHandler fullPageErrorStateClickHandler) throws Throwable {
        this.D = fullPageErrorStateClickHandler;
        synchronized (this) {
            this.I |= 8;
        }
        h(77);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.FragmentOrdersListBinding
    public final void M(OrdersListViewModel ordersListViewModel) throws Throwable {
        this.E = ordersListViewModel;
        synchronized (this) {
            this.I |= 32;
        }
        h(156);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.FragmentOrdersListBinding
    public final void N(Function0 function0) throws Throwable {
        this.C = function0;
        synchronized (this) {
            this.I |= 16;
        }
        h(259);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.I     // Catch: java.lang.Throwable -> L8a
            r2 = 0
            r14.I = r2     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8a
            au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler r4 = r14.D
            au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel r5 = r14.E
            r6 = 72
            long r6 = r6 & r0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r7 = 97
            long r7 = r7 & r0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L3c
            if (r5 == 0) goto L1f
            androidx.lifecycle.MutableLiveData r10 = r5.i
            goto L20
        L1f:
            r10 = r8
        L20:
            r14.I(r9, r10)
            if (r10 == 0) goto L2c
            java.lang.Object r10 = r10.e()
            au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract$ViewState r10 = (au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract.ViewState) r10
            goto L2d
        L2c:
            r10 = r8
        L2d:
            if (r10 == 0) goto L3c
            boolean r8 = r10.h
            au.com.woolworths.feature.shop.myorders.orders.OrdersFullPageErrorState r11 = r10.c
            boolean r12 = r10.f
            boolean r10 = r10.g
            r13 = r10
            r10 = r8
            r8 = r11
            r11 = r13
            goto L3f
        L3c:
            r10 = r9
            r11 = r10
            r12 = r11
        L3f:
            if (r6 == 0) goto L46
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding r6 = r14.y
            r6.L(r4)
        L46:
            if (r7 == 0) goto L65
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding r4 = r14.y
            r4.M(r8)
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding r4 = r14.y
            android.view.View r4 = r4.h
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(r4, r11)
            au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersSeeAllLinkBinding r4 = r14.z
            android.view.View r4 = r4.h
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(r4, r10)
            com.airbnb.epoxy.EpoxyRecyclerView r4 = r14.A
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.o(r4, r12)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r14.B
            r4.setRefreshing(r9)
        L65:
            r6 = 96
            long r6 = r6 & r0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L71
            au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersSeeAllLinkBinding r4 = r14.z
            r4.L(r5)
        L71:
            r4 = 64
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L7f
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r14.B
            au.com.woolworths.feature.shop.myorders.generated.callback.OnRefreshListener r1 = r14.H
            r0.setOnRefreshListener(r1)
        L7f:
            au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding r0 = r14.y
            r0.k()
            au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrdersSeeAllLinkBinding r0 = r14.z
            r0.k()
            return
        L8a:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.databinding.FragmentOrdersListBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.y.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 64L;
        }
        this.y.r();
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
                this.I |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.I |= 2;
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
            this.I |= 4;
        }
        return true;
    }
}
