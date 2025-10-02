package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsPaymentInfo;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptPaymentDetailBindingImpl extends EpoxyItemEReceiptPaymentDetailBinding {
    public long A;
    public final TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyItemEReceiptPaymentDetailBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        this.A = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[1];
        this.z = textView;
        textView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.y = (EReceiptDetailsPaymentInfo) obj;
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
        EReceiptDetailsPaymentInfo eReceiptDetailsPaymentInfo = this.y;
        long j2 = j & 3;
        String text = (j2 == 0 || eReceiptDetailsPaymentInfo == null) ? null : eReceiptDetailsPaymentInfo.getText();
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, text);
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
