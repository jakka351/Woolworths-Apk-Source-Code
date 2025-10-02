package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityProgressStepperInfoBindingImpl extends ActivityProgressStepperInfoBinding {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.root, 1);
        sparseIntArray.put(R.id.appbar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.info_rv, 4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.A = 0L;
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
            this.A = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
