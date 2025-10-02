package au.com.woolworths.feature.shop.myorders.databinding;

import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.myorders.orders.OrdersClickListener;
import au.com.woolworths.feature.shop.myorders.orders.OrdersDataExtKt;
import au.com.woolworths.feature.shop.myorders.orders.data.DeliveryOrder;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public class EpoxyItemOrdersDeliveryBindingImpl extends EpoxyItemOrdersDeliveryBinding implements OnClickListener.Listener {
    public final MaterialCardView K;
    public final OnClickListener L;
    public long M;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrdersDeliveryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[5], (TextView) objArrT[4], (TextView) objArrT[10], (TextView) objArrT[9], (TextView) objArrT[8], (TextView) objArrT[7], (TextView) objArrT[6], (TextView) objArrT[3], (ImageView) objArrT[1], (TextView) objArrT[2]);
        this.M = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.K = materialCardView;
        materialCardView.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        E(view);
        this.L = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.J = (OrdersClickListener) obj;
            synchronized (this) {
                this.M |= 1;
            }
            h(92);
            y();
            return true;
        }
        if (187 != i) {
            return false;
        }
        this.I = (DeliveryOrder) obj;
        synchronized (this) {
            this.M |= 2;
        }
        h(187);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrdersClickListener ordersClickListener = this.J;
        DeliveryOrder deliveryOrder = this.I;
        if (ordersClickListener != null) {
            ordersClickListener.K0(deliveryOrder);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        String str;
        String str2;
        String str3;
        String str4;
        SpannableString spannableString;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        OrderStatus orderStatus;
        String str9;
        String str10;
        String str11;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        DeliveryOrder deliveryOrder = this.I;
        long j3 = 6 & j;
        if (j3 != 0) {
            if (deliveryOrder != null) {
                orderStatus = deliveryOrder.c;
                str9 = deliveryOrder.f7865a;
                str10 = deliveryOrder.d;
                str6 = deliveryOrder.j;
                str7 = deliveryOrder.f;
                str11 = deliveryOrder.b;
                str8 = deliveryOrder.e;
                j2 = 0;
                str2 = deliveryOrder.k;
                str3 = deliveryOrder.h;
                str4 = deliveryOrder.i;
                str = deliveryOrder.g;
            } else {
                j2 = 0;
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                orderStatus = null;
                str9 = null;
                str10 = null;
                str6 = null;
                str7 = null;
                str11 = null;
                str8 = null;
            }
            int i2 = orderStatus != null ? orderStatus.h : 0;
            SpannableString spannableStringA = OrdersDataExtKt.a(str11, str10);
            str5 = str9;
            spannableString = spannableStringA;
            i = i2;
        } else {
            j2 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            spannableString = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            i = 0;
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.y, str7);
            TextViewBindingAdapter.b(this.z, spannableString);
            TextViewBindingsKt.a(this.A, str2);
            TextViewBindingsKt.a(this.B, str6);
            TextViewBindingAdapter.b(this.C, str4);
            TextViewBindingAdapter.b(this.D, str3);
            TextViewBindingAdapter.b(this.E, str);
            TextViewBindingAdapter.b(this.F, str8);
            BindingAdaptersKt.m(this.G, i, null);
            TextViewBindingAdapter.b(this.H, str5);
        }
        if ((j & 4) != j2) {
            this.K.setOnClickListener(this.L);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.M = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
