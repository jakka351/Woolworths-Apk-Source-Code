package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.views.CheckableLinearLayout;

/* loaded from: classes3.dex */
public class EpoxyItemCollectionModeVariantFootnoteBindingImpl extends EpoxyItemCollectionModeVariantFootnoteBinding {
    public final CheckableLinearLayout C;
    public long D;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCollectionModeVariantFootnoteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, (CheckedTextView) objArrT[1]);
        this.D = -1L;
        CheckableLinearLayout checkableLinearLayout = (CheckableLinearLayout) objArrT[0];
        this.C = checkableLinearLayout;
        checkableLinearLayout.setTag(null);
        this.y.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (123 == i) {
            this.z = (Boolean) obj;
            synchronized (this) {
                this.D |= 1;
            }
            h(123);
            y();
            return true;
        }
        if (127 == i) {
            this.A = (Boolean) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(127);
            y();
            return true;
        }
        if (261 != i) {
            return false;
        }
        this.B = (String) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(261);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        Boolean bool = this.z;
        Boolean bool2 = this.A;
        String str = this.B;
        long j2 = 9 & j;
        boolean zB = j2 != 0 ? ViewDataBinding.B(bool) : false;
        long j3 = 10 & j;
        boolean zB2 = j3 != 0 ? ViewDataBinding.B(bool2) : false;
        long j4 = j & 12;
        if (j2 != 0) {
            this.C.setChecked(zB);
        }
        if (j3 != 0) {
            this.C.setEnabled(zB2);
        }
        if (j4 != 0) {
            TextViewBindingAdapter.b(this.y, str);
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
