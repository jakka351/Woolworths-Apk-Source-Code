package au.com.woolworths.feature.shop.myorders.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;

/* loaded from: classes3.dex */
public class EpoxyItemParkingStepBindingImpl extends EpoxyItemParkingStepBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (254 == i) {
            this.A = ((Integer) obj).intValue();
            synchronized (this) {
                this.C |= 1;
            }
            h(254);
            y();
            return true;
        }
        if (253 != i) {
            return false;
        }
        this.B = (String) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(253);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        int i = this.A;
        String str = this.B;
        long j2 = 5 & j;
        String string = j2 != 0 ? Integer.toString(i) : null;
        if ((j & 6) != 0) {
            TextViewBindingAdapter.b(this.y, str);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, string);
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
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
