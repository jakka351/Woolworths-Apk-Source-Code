package au.com.woolworths.shop.checkout.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutProductsHeaderBindingImpl extends EpoxyItemCheckoutProductsHeaderBinding {
    public long D;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 == i) {
            this.B = (String) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(263);
            y();
            return true;
        }
        if (57 != i) {
            return false;
        }
        this.C = (String) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(57);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        String str = this.B;
        String str2 = this.C;
        long j2 = 5 & j;
        if ((j & 6) != 0) {
            TextViewBindingAdapter.b(this.y, str2);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.A, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
