package au.com.woolworths.feature.shop.myorders.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.models.text.Text;

/* loaded from: classes3.dex */
public class EpoxyItemSubtotalTitleBindingImpl extends EpoxyItemSubtotalTitleBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 != i) {
            return false;
        }
        this.z = (Text) obj;
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
        Text text = this.z;
        long j2 = j & 3;
        CharSequence text2 = (j2 == 0 || text == null) ? null : text.getText(this.h.getContext());
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, text2);
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
