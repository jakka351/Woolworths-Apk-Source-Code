package au.com.woolworths.product.details.databinding;

import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;

/* loaded from: classes4.dex */
public class EpoxyItemProductBadgeImageBindingImpl extends EpoxyItemProductBadgeImageBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (10 != i) {
            return false;
        }
        this.z = (String) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(10);
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
            BindingAdaptersKt.d(this.y, str);
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
