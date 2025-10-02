package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;

/* loaded from: classes3.dex */
public class EpoxyItemEditOrderWarningImageBindingImpl extends EpoxyItemEditOrderWarningImageBinding {
    public final FrameLayout A;
    public long B;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemEditOrderWarningImageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (ImageView) objArrT[1]);
        this.B = -1L;
        this.y.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.A = frameLayout;
        frameLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (107 != i) {
            return false;
        }
        this.z = (String) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(107);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        String str = this.z;
        if ((j & 3) != 0) {
            BindingAdaptersKt.d(this.y, str);
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
