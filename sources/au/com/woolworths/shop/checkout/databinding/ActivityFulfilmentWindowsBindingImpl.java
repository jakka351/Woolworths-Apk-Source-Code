package au.com.woolworths.shop.checkout.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivityFulfilmentWindowsBindingImpl extends ActivityFulfilmentWindowsBinding {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.toolbar_container, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.nav_host_fragment, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.z = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
