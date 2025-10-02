package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.SortOptionsClickListener;

/* loaded from: classes3.dex */
public class EpoxyItemProductListOptionsSortExpandLegacyBindingImpl extends EpoxyItemProductListOptionsSortExpandLegacyBinding implements OnClickListener.Listener {
    public final OnClickListener C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductListOptionsSortExpandLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (ConstraintLayout) objArrT[0], (TextView) objArrT[1]);
        this.D = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (250 == i) {
            this.B = (SortOptionsClickListener) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(250);
            y();
            return true;
        }
        if (263 != i) {
            return false;
        }
        this.A = (Integer) obj;
        synchronized (this) {
            this.D |= 2;
        }
        h(263);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        SortOptionsClickListener sortOptionsClickListener = this.B;
        if (sortOptionsClickListener != null) {
            sortOptionsClickListener.A();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String string;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Integer num = this.A;
        long j2 = 6 & j;
        if (j2 != 0) {
            string = this.h.getContext().getString(ViewDataBinding.z(num));
        } else {
            string = null;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.C);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, string);
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
            this.D = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
