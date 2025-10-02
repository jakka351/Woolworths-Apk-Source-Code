package au.com.woolworths.feature.shop.homepage.databinding;

import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.homepage.generated.callback.BannerClickListener;
import au.com.woolworths.feature.shop.homepage.generated.callback.OnClickListener;
import au.com.woolworths.feature.shop.homepage.presentation.OrdersClickListener;
import au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.FulfilmentStatusBannerView;
import au.com.woolworths.feature.shop.myorders.orders.OrdersDataExtKt;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public class EpoxyItemOrdersTileBindingImpl extends EpoxyItemOrdersTileBinding implements OnClickListener.Listener, BannerClickListener.Listener {
    public final MaterialCardView K;
    public final FulfilmentStatusBannerView L;
    public final OnClickListener M;
    public final BannerClickListener N;
    public long O;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrdersTileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, null, null);
        super(dataBindingComponent, view, (FulfilmentStatusBannerView) objArrT[9], (TextView) objArrT[5], (TextView) objArrT[8], (TextView) objArrT[7], (TextView) objArrT[6], (TextView) objArrT[4], (ImageView) objArrT[2], (TextView) objArrT[3]);
        this.O = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        ((LinearLayout) objArrT[0]).setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArrT[1];
        this.K = materialCardView;
        materialCardView.setTag(null);
        FulfilmentStatusBannerView fulfilmentStatusBannerView = (FulfilmentStatusBannerView) objArrT[10];
        this.L = fulfilmentStatusBannerView;
        fulfilmentStatusBannerView.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        E(view);
        this.M = new OnClickListener(this, 1);
        this.N = new BannerClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (66 == i) {
            this.I = (FulfilmentStatusBannerData) obj;
            synchronized (this) {
                this.O |= 1;
            }
            h(66);
            y();
            return true;
        }
        if (67 == i) {
            this.J = (Integer) obj;
            synchronized (this) {
                this.O |= 2;
            }
            h(67);
            y();
            return true;
        }
        if (37 == i) {
            this.H = (OrdersClickListener) obj;
            synchronized (this) {
                this.O |= 4;
            }
            h(37);
            y();
            return true;
        }
        if (187 != i) {
            return false;
        }
        this.G = (OrderCardData) obj;
        synchronized (this) {
            this.O |= 8;
        }
        h(187);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.homepage.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrdersClickListener ordersClickListener = this.H;
        OrderCardData orderCardData = this.G;
        if (ordersClickListener != null) {
            ordersClickListener.N4(orderCardData);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        FulfilmentStatusBannerData fulfilmentStatusBannerData;
        String str;
        SpannableString spannableStringA;
        String str2;
        String str3;
        boolean z;
        int i;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        OrderStatus orderStatus;
        int i2;
        synchronized (this) {
            j = this.O;
            this.O = 0L;
        }
        FulfilmentStatusBannerData fulfilmentStatusBannerData2 = this.I;
        Integer num = this.J;
        OrderCardData orderCardData = this.G;
        long j4 = 17 & j;
        long j5 = 18 & j;
        int iZ = j5 != 0 ? ViewDataBinding.z(num) : 0;
        long j6 = 24 & j;
        if (j6 != 0) {
            if (orderCardData != null) {
                orderStatus = orderCardData.c;
                str5 = orderCardData.f7204a;
                i2 = orderCardData.d;
                j3 = 0;
                str6 = orderCardData.b;
                str2 = orderCardData.e;
                str7 = orderCardData.g;
                str8 = orderCardData.h;
                j2 = j;
                fulfilmentStatusBannerData = orderCardData.j;
                str = orderCardData.f;
            } else {
                j2 = j;
                j3 = 0;
                fulfilmentStatusBannerData = null;
                str = null;
                str6 = null;
                str2 = null;
                str7 = null;
                str8 = null;
                orderStatus = null;
                str5 = null;
                i2 = 0;
            }
            int i3 = orderStatus != null ? orderStatus.h : 0;
            String strValueOf = String.valueOf(i2);
            boolean z2 = fulfilmentStatusBannerData != null;
            spannableStringA = OrdersDataExtKt.a(str6, strValueOf);
            str4 = str8;
            i = i3;
            str3 = str7;
            z = z2;
        } else {
            j2 = j;
            j3 = 0;
            fulfilmentStatusBannerData = null;
            str = null;
            spannableStringA = null;
            str2 = null;
            str3 = null;
            z = false;
            i = 0;
            str4 = null;
            str5 = null;
        }
        if (j6 != 0) {
            BindingAdaptersKt.o(this.y, z);
            this.y.setBannerData(fulfilmentStatusBannerData);
            TextViewBindingAdapter.b(this.z, spannableStringA);
            TextViewBindingAdapter.b(this.A, str4);
            TextViewBindingAdapter.b(this.B, str3);
            TextViewBindingAdapter.b(this.C, str);
            TextViewBindingAdapter.b(this.D, str2);
            BindingAdaptersKt.m(this.E, i, null);
            TextViewBindingAdapter.b(this.F, str5);
        }
        if ((j2 & 16) != j3) {
            this.y.setClickListener(this.N);
            this.K.setOnClickListener(this.M);
        }
        if (j5 != 0) {
            this.L.setVisibility(iZ);
        }
        if (j4 != 0) {
            this.L.setBannerData(fulfilmentStatusBannerData2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.O = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
