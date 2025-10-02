package au.com.woolworths.shop.checkout.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutSectionTitleBindingImpl extends EpoxyItemCheckoutSectionTitleBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 != i) {
            return false;
        }
        this.z = (String) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(263);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        String str = this.z;
        if ((j & 3) != 0) {
            TextViewBindingAdapter.b(this.y, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.A = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
