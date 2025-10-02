package au.com.woolworths.feature.shop.myorders.databinding;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsExtKt;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsAmountItemIcon;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemIcon;

/* loaded from: classes3.dex */
public class EpoxyItemPaymentItemBindingImpl extends EpoxyItemPaymentItemBinding {
    public long F;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (269 == i) {
            this.E = ((Integer) obj).intValue();
            synchronized (this) {
                this.F |= 1;
            }
            h(269);
            y();
            return true;
        }
        if (6 == i) {
            this.D = ((Integer) obj).intValue();
            synchronized (this) {
                this.F |= 2;
            }
            h(6);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.C = (OrderPaymentDetailsItemData) obj;
        synchronized (this) {
            this.F |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        int i;
        OrderPaymentDetailsAmountItemIcon orderPaymentDetailsAmountItemIcon;
        OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        int i2 = this.E;
        int i3 = this.D;
        OrderPaymentDetailsItemData orderPaymentDetailsItemData = this.C;
        long j2 = 9 & j;
        Typeface typefaceE = j2 != 0 ? ResourcesCompat.e(i2, this.h.getContext()) : null;
        long j3 = 10 & j;
        int iA = j3 != 0 ? Extensions.a(i3, this.h.getContext()) : 0;
        long j4 = j & 12;
        if (j4 != 0) {
            if (orderPaymentDetailsItemData != null) {
                str = orderPaymentDetailsItemData.d;
                orderPaymentDetailsAmountItemIcon = orderPaymentDetailsItemData.g;
                orderPaymentDetailsItemIcon = orderPaymentDetailsItemData.e;
                str2 = orderPaymentDetailsItemData.f;
            } else {
                str = null;
                orderPaymentDetailsAmountItemIcon = null;
                orderPaymentDetailsItemIcon = null;
                str2 = null;
            }
            int i4 = orderPaymentDetailsAmountItemIcon != null ? orderPaymentDetailsAmountItemIcon.d : 0;
            iA = OrderDetailsExtKt.a(orderPaymentDetailsItemIcon);
            i = i4;
        } else {
            str = null;
            str2 = null;
            i = 0;
        }
        if (j4 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            BindingAdaptersKt.q(this.z, iA);
            BindingAdaptersKt.m(this.z, iA, null);
            BindingAdaptersKt.q(this.A, i);
            BindingAdaptersKt.m(this.A, i, null);
            TextViewBindingAdapter.b(this.B, str);
        }
        if (j3 != 0) {
            this.y.setTextColor(iA);
        }
        if (j2 != 0) {
            this.y.setTypeface(typefaceE);
            this.B.setTypeface(typefaceE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
