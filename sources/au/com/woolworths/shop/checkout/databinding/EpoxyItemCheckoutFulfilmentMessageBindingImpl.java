package au.com.woolworths.shop.checkout.databinding;

import android.util.SparseIntArray;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsMessage;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutFulfilmentMessageBindingImpl extends EpoxyItemCheckoutFulfilmentMessageBinding {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.message_top_guideline, 3);
        sparseIntArray.put(R.id.message_start_guideline, 4);
        sparseIntArray.put(R.id.message_end_guideline, 5);
        sparseIntArray.put(R.id.icon_message, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (171 != i) {
            return false;
        }
        this.A = (FulfilmentWindowsMessage) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(171);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        FulfilmentWindowsMessage fulfilmentWindowsMessage = this.A;
        long j2 = j & 3;
        if (j2 == 0 || fulfilmentWindowsMessage == null) {
            str = null;
            str2 = null;
        } else {
            str = fulfilmentWindowsMessage.f10614a;
            str2 = fulfilmentWindowsMessage.b;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            TextViewBindingAdapter.b(this.z, str);
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
