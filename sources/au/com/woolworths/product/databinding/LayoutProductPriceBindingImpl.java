package au.com.woolworths.product.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class LayoutProductPriceBindingImpl extends LayoutProductPriceBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.currency_text_view, 1);
        sparseIntArray.put(R.id.dollar_unit_text_view, 2);
        sparseIntArray.put(R.id.cent_unit_text_view, 3);
        sparseIntArray.put(R.id.unit_label_text_view, 4);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.D = 0L;
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
            this.D = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
