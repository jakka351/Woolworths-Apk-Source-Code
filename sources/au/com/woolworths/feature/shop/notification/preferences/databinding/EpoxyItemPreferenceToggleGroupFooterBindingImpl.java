package au.com.woolworths.feature.shop.notification.preferences.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;

/* loaded from: classes3.dex */
public class EpoxyItemPreferenceToggleGroupFooterBindingImpl extends EpoxyItemPreferenceToggleGroupFooterBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (83 != i) {
            return false;
        }
        this.z = (String) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(83);
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
        String str = this.z;
        long j2 = j & 3;
        boolean z = false;
        if (j2 != 0 && str != null) {
            z = true;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str);
            BindingAdaptersKt.o(this.y, z);
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
