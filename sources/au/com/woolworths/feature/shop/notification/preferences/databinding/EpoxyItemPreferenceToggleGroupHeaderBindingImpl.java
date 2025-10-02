package au.com.woolworths.feature.shop.notification.preferences.databinding;

import YU.a;
import android.text.TextUtils;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;

/* loaded from: classes3.dex */
public class EpoxyItemPreferenceToggleGroupHeaderBindingImpl extends EpoxyItemPreferenceToggleGroupHeaderBinding {
    public long D;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (141 == i) {
            this.C = (Boolean) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(141);
            y();
            return true;
        }
        if (263 == i) {
            this.A = (String) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(263);
            y();
            return true;
        }
        if (56 != i) {
            return false;
        }
        this.B = (String) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(56);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String strG;
        boolean z;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Boolean bool = this.C;
        String str = this.A;
        String str2 = this.B;
        long j2 = 9 & j;
        boolean z2 = j2 != 0 ? !ViewDataBinding.B(bool) : false;
        long j3 = 10 & j;
        if (j3 != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            strG = a.g(str, " category");
            z = !zIsEmpty;
        } else {
            strG = null;
            z = false;
        }
        long j4 = j & 12;
        boolean z3 = j4 != 0 ? !TextUtils.isEmpty(str2) : false;
        if (j4 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            BindingAdaptersKt.o(this.y, z3);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.z, str);
            BindingAdaptersKt.o(this.z, z);
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(strG);
            }
        }
        if (j2 != 0) {
            this.z.setEnabled(z2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
