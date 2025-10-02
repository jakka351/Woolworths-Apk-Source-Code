package au.com.woolworths.feature.shop.myorders.databinding;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListContract;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel;
import au.com.woolworths.feature.shop.myorders.orders.models.OrderCompactUiModel;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemOrdersCompactBindingImpl extends EpoxyItemOrdersCompactBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts K;
    public static final SparseIntArray L;
    public final MaterialCardView H;
    public final OnClickListener I;
    public long J;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(11);
        K = includedLayouts;
        includedLayouts.a(1, new int[]{8}, new int[]{R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.barrier, 9);
        sparseIntArray.put(R.id.chevron, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrdersCompactBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, K, L);
        super(dataBindingComponent, view, (IncludeHorizontalDividerBinding) objArrT[8], (TextView) objArrT[7], (ImageView) objArrT[4], (ImageView) objArrT[5], (TextView) objArrT[6], (TextView) objArrT[3], (TextView) objArrT[2]);
        this.J = -1L;
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = this.y;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.H = materialCardView;
        materialCardView.setTag(null);
        ((ConstraintLayout) objArrT[1]).setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        this.I = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (187 == i) {
            this.F = (OrderCompactUiModel) obj;
            synchronized (this) {
                this.J |= 2;
            }
            h(187);
            y();
            return true;
        }
        if (273 != i) {
            return false;
        }
        this.G = (OrdersListViewModel) obj;
        synchronized (this) {
            this.J |= 4;
        }
        h(273);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrderCompactUiModel order = this.F;
        OrdersListViewModel ordersListViewModel = this.G;
        if (ordersListViewModel != null) {
            Intrinsics.h(order, "order");
            AnalyticsManager analyticsManager = ordersListViewModel.f;
            OrdersActions ordersActions = OrdersActions.u;
            TrackableValue trackableValue = TrackableValue.h1;
            String str = order.f7879a;
            analyticsManager.j(ordersActions, TrackingMetadata.Companion.a(trackableValue, str));
            ordersListViewModel.j.f(new OrderListContract.Action.LaunchOrderDetails(str));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int iZ;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        CharSequence charSequence3;
        CharSequence charSequence4;
        Integer num;
        int i;
        OrderStatus orderStatus;
        Integer num2;
        int iA;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        OrderCompactUiModel orderCompactUiModel = this.F;
        long j2 = 10 & j;
        int i2 = 0;
        if (j2 != 0) {
            if (orderCompactUiModel != null) {
                orderStatus = orderCompactUiModel.f;
                charSequence2 = orderCompactUiModel.b;
                str = orderCompactUiModel.g;
                charSequence3 = orderCompactUiModel.c;
                charSequence4 = orderCompactUiModel.d;
                charSequence = orderCompactUiModel.e;
            } else {
                charSequence = null;
                orderStatus = null;
                charSequence2 = null;
                str = null;
                charSequence3 = null;
                charSequence4 = null;
            }
            if (orderStatus != null) {
                Context ctx = this.h.getContext();
                Intrinsics.h(ctx, "ctx");
                Integer num3 = orderStatus.f;
                if (num3 == null) {
                    iA = Extensions.a(android.R.attr.textColorSecondary, ctx);
                } else {
                    iA = ResourcesCompat.a(num3.intValue(), ctx.getTheme(), ctx.getResources());
                }
                Integer num4 = orderStatus.d;
                i = iA;
                i2 = orderStatus.g;
                num = orderStatus.e;
                num2 = num4;
            } else {
                num2 = null;
                num = null;
                i = 0;
            }
            iZ = ViewDataBinding.z(num2);
        } else {
            iZ = 0;
            charSequence = null;
            charSequence2 = null;
            str = null;
            charSequence3 = null;
            charSequence4 = null;
            num = null;
            i = 0;
        }
        if ((j & 8) != 0) {
            this.H.setOnClickListener(this.I);
        }
        if (j2 != 0) {
            if (ViewDataBinding.s >= 23) {
                this.z.setTextAppearance(i2);
            }
            TextViewBindingAdapter.b(this.z, charSequence);
            this.z.setTextColor(i);
            BindingAdaptersKt.d(this.A, str);
            BindingAdaptersKt.m(this.B, iZ, num);
            TextViewBindingAdapter.b(this.C, charSequence3);
            TextViewBindingAdapter.b(this.D, charSequence4);
            TextViewBindingAdapter.b(this.E, charSequence2);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.J != 0) {
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
            this.J = 8L;
        }
        this.y.r();
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
            this.J |= 1;
        }
        return true;
    }
}
