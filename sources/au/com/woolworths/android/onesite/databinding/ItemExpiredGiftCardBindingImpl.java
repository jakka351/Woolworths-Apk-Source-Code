package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ItemExpiredGiftCardBindingImpl extends ItemExpiredGiftCardBinding {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.savedCardIconImageView, 1);
        sparseIntArray.put(R.id.verticalDividerView, 2);
        sparseIntArray.put(R.id.savedCardNumberTextView, 3);
        sparseIntArray.put(R.id.savedCardExpiryTextView, 4);
        sparseIntArray.put(R.id.balanceValueTextView, 5);
        sparseIntArray.put(R.id.balanceLabelTextView, 6);
        sparseIntArray.put(R.id.removeTextView, 7);
        sparseIntArray.put(R.id.cardNotAvailableTextView, 8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.G = 0L;
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
            this.G = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
