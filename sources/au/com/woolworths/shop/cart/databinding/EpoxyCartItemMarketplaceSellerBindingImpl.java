package au.com.woolworths.shop.cart.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.foundation.shop.cart.data.model.MarketplaceSeller;

/* loaded from: classes4.dex */
public class EpoxyCartItemMarketplaceSellerBindingImpl extends EpoxyCartItemMarketplaceSellerBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (225 != i) {
            return false;
        }
        this.B = (MarketplaceSeller) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(225);
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
        MarketplaceSeller marketplaceSeller = this.B;
        long j2 = j & 3;
        if (j2 == 0 || marketplaceSeller == null) {
            str = null;
            str2 = null;
        } else {
            str = marketplaceSeller.b;
            str2 = marketplaceSeller.f8696a;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, str);
            TextViewBindingAdapter.b(this.A, str2);
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
