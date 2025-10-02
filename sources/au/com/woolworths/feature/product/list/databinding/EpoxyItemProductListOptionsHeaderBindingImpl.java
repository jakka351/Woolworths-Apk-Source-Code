package au.com.woolworths.feature.product.list.databinding;

import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* loaded from: classes3.dex */
public class EpoxyItemProductListOptionsHeaderBindingImpl extends EpoxyItemProductListOptionsHeaderBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 != i) {
            return false;
        }
        this.z = (Integer) obj;
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
        String string;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        Integer num = this.z;
        long j2 = j & 3;
        if (j2 != 0) {
            string = this.h.getContext().getString(ViewDataBinding.z(num));
        } else {
            string = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, string);
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
