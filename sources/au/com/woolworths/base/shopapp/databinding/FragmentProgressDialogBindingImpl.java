package au.com.woolworths.base.shopapp.databinding;

import android.util.SparseIntArray;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentProgressDialogBindingImpl extends FragmentProgressDialogBinding {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.loading_layout, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (158 != i) {
            return false;
        }
        L((String) obj);
        return true;
    }

    @Override // au.com.woolworths.base.shopapp.databinding.FragmentProgressDialogBinding
    public final void L(String str) throws Throwable {
        this.A = str;
        synchronized (this) {
            this.C |= 1;
        }
        h(158);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        String str = this.A;
        if ((j & 3) != 0) {
            TextViewBindingsKt.a(this.z, str);
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
