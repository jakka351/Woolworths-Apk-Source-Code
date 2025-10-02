package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes3.dex */
public class LayoutCheckedPriceViewBindingImpl extends LayoutCheckedPriceViewBinding {
    public final CheckableConstraintLayout F;
    public long G;

    /* JADX WARN: Illegal instructions before constructor call */
    public LayoutCheckedPriceViewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(dataBindingComponent, view, (CheckedTextView) objArrT[3], (CheckedTextView) objArrT[1], (CheckedTextView) objArrT[2]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        CheckableConstraintLayout checkableConstraintLayout = (CheckableConstraintLayout) objArrT[0];
        this.F = checkableConstraintLayout;
        checkableConstraintLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (123 == i) {
            this.C = (Boolean) obj;
            synchronized (this) {
                this.G |= 1;
            }
            h(123);
            y();
            return true;
        }
        if (33 == i) {
            this.E = (String) obj;
            synchronized (this) {
                this.G |= 2;
            }
            h(33);
            y();
            return true;
        }
        if (127 == i) {
            this.B = (Boolean) obj;
            synchronized (this) {
                this.G |= 4;
            }
            h(127);
            y();
            return true;
        }
        if (65 != i) {
            return false;
        }
        this.D = (String) obj;
        synchronized (this) {
            this.G |= 8;
        }
        h(65);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        Boolean bool = this.C;
        String str = this.E;
        Boolean bool2 = this.B;
        String str2 = this.D;
        long j2 = 17 & j;
        boolean zB = j2 != 0 ? ViewDataBinding.B(bool) : false;
        long j3 = 18 & j;
        long j4 = 20 & j;
        boolean zB2 = j4 != 0 ? ViewDataBinding.B(bool2) : false;
        long j5 = j & 24;
        if (j3 != 0) {
            BindingAdaptersKt.t(this.y, str);
        }
        if (j5 != 0) {
            BindingAdaptersKt.n(this.z, str2);
            BindingAdaptersKt.t(this.A, str2);
        }
        if (j2 != 0) {
            this.F.setChecked(zB);
        }
        if (j4 != 0) {
            this.F.setEnabled(zB2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
