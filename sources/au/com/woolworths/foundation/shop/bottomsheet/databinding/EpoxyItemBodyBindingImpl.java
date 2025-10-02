package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.handlers.LinkHandler;

/* loaded from: classes4.dex */
public class EpoxyItemBodyBindingImpl extends EpoxyItemBodyBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (153 == i) {
            this.A = (LinkHandler) obj;
            synchronized (this) {
                this.B |= 1;
            }
            h(153);
            y();
            return true;
        }
        if (17 != i) {
            return false;
        }
        this.z = (String) obj;
        synchronized (this) {
            this.B |= 2;
        }
        h(17);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        LinkHandler linkHandler = this.A;
        String str = this.z;
        if ((j & 7) != 0) {
            BindingAdaptersKt.l(this.y, str, false, linkHandler, null);
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
            this.B = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
