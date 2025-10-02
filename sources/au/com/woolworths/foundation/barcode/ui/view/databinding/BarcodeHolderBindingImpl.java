package au.com.woolworths.foundation.barcode.ui.view.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;

/* loaded from: classes4.dex */
public class BarcodeHolderBindingImpl extends BarcodeHolderBinding {
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeHolderBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        Object[] objArrU = ViewDataBinding.u(dataBindingComponent, viewArr, 2, null);
        super(viewArr[0], (ImageView) objArrU[0], (TextView) objArrU[1], dataBindingComponent);
        this.C = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        F(viewArr);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (240 != i) {
            return false;
        }
        L(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // au.com.woolworths.foundation.barcode.ui.view.databinding.BarcodeHolderBinding
    public final void L(boolean z) throws Throwable {
        this.A = z;
        synchronized (this) {
            this.C |= 1;
        }
        h(240);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        boolean z = this.A;
        long j2 = j & 3;
        boolean z2 = j2 != 0 ? !z : false;
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z2);
            BindingAdaptersKt.o(this.z, z);
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
