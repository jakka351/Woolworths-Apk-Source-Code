package au.com.woolworths.feature.shared.receipt.details.databinding;

import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsItem;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptDetailsHeaderBindingImpl extends EpoxyItemEReceiptDetailsHeaderBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.B = (EReceiptDetailsItem) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String description;
        String amount;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        EReceiptDetailsItem eReceiptDetailsItem = this.B;
        long j2 = j & 3;
        if (j2 == 0 || eReceiptDetailsItem == null) {
            description = null;
            amount = null;
        } else {
            description = eReceiptDetailsItem.getDescription();
            amount = eReceiptDetailsItem.getAmount();
        }
        if (j2 != 0) {
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(amount);
            }
            TextViewBindingAdapter.b(this.z, amount);
            TextViewBindingAdapter.b(this.A, description);
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
