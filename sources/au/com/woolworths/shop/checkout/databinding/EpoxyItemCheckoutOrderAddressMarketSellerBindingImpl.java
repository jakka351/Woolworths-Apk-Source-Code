package au.com.woolworths.shop.checkout.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerInfo;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutOrderAddressMarketSellerBindingImpl extends EpoxyItemCheckoutOrderAddressMarketSellerBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.A = (MarketSellerInfo) obj;
        synchronized (this) {
            this.B |= 1;
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
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        MarketSellerInfo marketSellerInfo = this.A;
        long j2 = j & 3;
        if (j2 == 0 || marketSellerInfo == null) {
            str = null;
            str2 = null;
        } else {
            str = marketSellerInfo.f10622a;
            str2 = marketSellerInfo.b;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            TextViewBindingAdapter.b(this.z, str);
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
