package au.com.woolworths.feature.shop.catalogue.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityTermsAndConditionsBindingImpl extends ActivityTermsAndConditionsBinding {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.terms_recyclerview, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.B = 0L;
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
            this.B = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
