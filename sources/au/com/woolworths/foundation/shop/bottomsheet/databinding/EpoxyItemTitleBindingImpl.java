package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.content.res.Resources;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemTitleBindingImpl extends EpoxyItemTitleBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 == i) {
            this.z = (String) obj;
            synchronized (this) {
                this.B |= 1;
            }
            h(263);
            y();
            return true;
        }
        if (135 != i) {
            return false;
        }
        this.A = (Boolean) obj;
        synchronized (this) {
            this.B |= 2;
        }
        h(135);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        boolean zB;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        String str = this.z;
        Boolean bool = this.A;
        int i = (j & 4) != 0 ? R.style.TextAppearance_H5_Fresh_Medium : 0;
        long j2 = j & 6;
        if (j2 != 0) {
            zB = ViewDataBinding.B(bool);
            if (j2 != 0) {
                j = zB ? j | 16 : j | 8;
            }
        } else {
            zB = false;
        }
        long j3 = 6 & j;
        int i2 = j3 != 0 ? zB ? (j & 16) != 0 ? R.dimen.double_default_margin : 0 : (8 & j) != 0 ? R.dimen.default_margin : 0 : 0;
        if (j3 != 0) {
            BindingAdaptersKt.k(i2, this.y);
        }
        if ((5 & j) != 0) {
            TextViewBindingAdapter.b(this.y, str);
        }
        if ((j & 4) == 0 || ViewDataBinding.s < 23) {
            return;
        }
        this.y.setTextAppearance(i);
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
