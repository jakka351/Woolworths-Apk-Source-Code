package au.com.woolworths.feature.shared.receipt.details.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsTotal;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptTotalBindingImpl extends EpoxyItemEReceiptTotalBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.z = (EReceiptDetailsTotal) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(53);
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
        EReceiptDetailsTotal eReceiptDetailsTotal = this.z;
        long j2 = j & 3;
        String total = (j2 == 0 || eReceiptDetailsTotal == null) ? null : eReceiptDetailsTotal.getTotal();
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, total);
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
