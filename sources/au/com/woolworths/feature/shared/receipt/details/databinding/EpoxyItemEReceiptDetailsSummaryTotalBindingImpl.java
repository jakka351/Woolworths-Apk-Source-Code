package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsItem;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptDetailsSummaryTotalBindingImpl extends EpoxyItemEReceiptDetailsSummaryTotalBinding {
    public final TextView A;
    public long B;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemEReceiptDetailsSummaryTotalBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[2]);
        this.B = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[1];
        this.A = textView;
        textView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.z = (EReceiptDetailsItem) obj;
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
        String description;
        String amount;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        EReceiptDetailsItem eReceiptDetailsItem = this.z;
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
                this.y.setContentDescription(amount);
            }
            TextViewBindingAdapter.b(this.y, amount);
            TextViewBindingAdapter.b(this.A, description);
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
