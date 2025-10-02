package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import au.com.woolworths.android.onesite.ui.HtmlTextBindingAdapterKt;
import au.com.woolworths.android.onesite.ui.HtmlTextListener;

/* loaded from: classes4.dex */
public class EpoxyItemFooterBindingImpl extends EpoxyItemFooterBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (102 == i) {
            this.A = (HtmlTextListener) obj;
            synchronized (this) {
                this.B |= 1;
            }
            h(102);
            y();
            return true;
        }
        if (83 != i) {
            return false;
        }
        this.z = (String) obj;
        synchronized (this) {
            this.B |= 2;
        }
        h(83);
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
        HtmlTextListener htmlTextListener = this.A;
        String str = this.z;
        if ((j & 7) != 0) {
            HtmlTextBindingAdapterKt.a(this.y, str, htmlTextListener);
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
