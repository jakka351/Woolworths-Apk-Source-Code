package au.com.woolworths.shop.checkout.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerGroup;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutMarketSellerGroupBindingImpl extends EpoxyItemCheckoutMarketSellerGroupBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (167 != i) {
            return false;
        }
        this.B = (MarketSellerGroup) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(167);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        MarketSellerGroup marketSellerGroup = this.B;
        long j2 = j & 3;
        if (j2 == 0 || marketSellerGroup == null) {
            str = null;
            str2 = null;
        } else {
            str = marketSellerGroup.f10621a;
            str2 = marketSellerGroup.b;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, str2);
            TextViewBindingAdapter.b(this.A, str);
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
            this.C = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
