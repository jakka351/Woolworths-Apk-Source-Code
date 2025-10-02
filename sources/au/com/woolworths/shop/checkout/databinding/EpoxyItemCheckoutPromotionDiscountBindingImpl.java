package au.com.woolworths.shop.checkout.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionDiscountItem;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutPromotionDiscountBindingImpl extends EpoxyItemCheckoutPromotionDiscountBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (59 != i) {
            return false;
        }
        this.A = (CheckoutPromotionDiscountItem) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(59);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        CheckoutPromotionDiscountItem checkoutPromotionDiscountItem = this.A;
        long j2 = j & 3;
        if (j2 == 0 || checkoutPromotionDiscountItem == null) {
            str = null;
            str2 = null;
        } else {
            str = checkoutPromotionDiscountItem.b;
            str2 = checkoutPromotionDiscountItem.f10578a;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str);
            TextViewBindingAdapter.b(this.z, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
