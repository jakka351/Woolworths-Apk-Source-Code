package au.com.woolworths.feature.shop.myorders.databinding;

import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.myorders.orders.OrdersClickListener;
import au.com.woolworths.feature.shop.myorders.orders.OrdersDataExtKt;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus;
import au.com.woolworths.feature.shop.myorders.orders.data.PickUpOrder;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public class EpoxyItemOrdersPickUpBindingImpl extends EpoxyItemOrdersPickUpBinding implements OnClickListener.Listener {
    public final MaterialCardView I;
    public final OnClickListener J;
    public final OnClickListener K;
    public long L;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrdersPickUpBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[8], (TextView) objArrT[6], (TextView) objArrT[7], (TextView) objArrT[5], (TextView) objArrT[3], (ImageView) objArrT[1], (TextView) objArrT[2], (TextView) objArrT[4]);
        this.L = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArrT[0];
        this.I = materialCardView;
        materialCardView.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        E(view);
        this.J = new OnClickListener(this, 1);
        this.K = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.H = (OrdersClickListener) obj;
            synchronized (this) {
                this.L |= 1;
            }
            h(92);
            y();
            return true;
        }
        if (187 != i) {
            return false;
        }
        this.G = (PickUpOrder) obj;
        synchronized (this) {
            this.L |= 2;
        }
        h(187);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            OrdersClickListener ordersClickListener = this.H;
            PickUpOrder pickUpOrder = this.G;
            if (ordersClickListener != null) {
                ordersClickListener.h2(pickUpOrder);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        OrdersClickListener ordersClickListener2 = this.H;
        PickUpOrder pickUpOrder2 = this.G;
        if (ordersClickListener2 == null || pickUpOrder2 == null) {
            return;
        }
        ordersClickListener2.C0(pickUpOrder2.g);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        String str;
        String str2;
        SpannableString spannableStringA;
        String str3;
        String str4;
        String str5;
        String str6;
        OrderStatus orderStatus;
        String str7;
        String str8;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        PickUpOrder pickUpOrder = this.G;
        long j3 = 6 & j;
        if (j3 != 0) {
            if (pickUpOrder != null) {
                orderStatus = pickUpOrder.c;
                str3 = pickUpOrder.f7869a;
                str7 = pickUpOrder.d;
                str4 = pickUpOrder.f;
                str8 = pickUpOrder.b;
                str5 = pickUpOrder.e;
                str6 = pickUpOrder.i;
                j2 = 0;
                str2 = pickUpOrder.j;
                str = pickUpOrder.h;
            } else {
                j2 = 0;
                str = null;
                str2 = null;
                orderStatus = null;
                str3 = null;
                str7 = null;
                str4 = null;
                str8 = null;
                str5 = null;
                str6 = null;
            }
            i = orderStatus != null ? orderStatus.h : 0;
            spannableStringA = OrdersDataExtKt.a(str8, str7);
        } else {
            j2 = 0;
            str = null;
            str2 = null;
            spannableStringA = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            TextViewBindingAdapter.b(this.z, str);
            TextViewBindingAdapter.b(this.A, str6);
            TextViewBindingAdapter.b(this.B, str4);
            TextViewBindingAdapter.b(this.C, str5);
            BindingAdaptersKt.m(this.D, i, null);
            TextViewBindingAdapter.b(this.E, str3);
            TextViewBindingAdapter.b(this.F, spannableStringA);
        }
        if ((j & 4) != j2) {
            this.I.setOnClickListener(this.J);
            this.B.setOnClickListener(this.K);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.L = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
