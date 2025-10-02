package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ItemAddedGiftCardBindingImpl extends ItemAddedGiftCardBinding {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        J = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.include_checkout_error_no_rounded}, new String[]{"include_checkout_error_no_rounded"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.addedGiftCardConstraintWrapper, 2);
        sparseIntArray.put(R.id.addedCardIconImageView, 3);
        sparseIntArray.put(R.id.giftCardNumberPanel, 4);
        sparseIntArray.put(R.id.addedCardNumberTextView, 5);
        sparseIntArray.put(R.id.addedCardExpiryTextView, 6);
        sparseIntArray.put(R.id.giftCardBalanceAmountPanel, 7);
        sparseIntArray.put(R.id.balanceValueTextView, 8);
        sparseIntArray.put(R.id.balanceLabelTextView, 9);
        sparseIntArray.put(R.id.paymentAmountEditText, 10);
        sparseIntArray.put(R.id.dividerView, 11);
        sparseIntArray.put(R.id.saveNewGiftCardCheckBox, 12);
        sparseIntArray.put(R.id.removeTextView, 13);
        sparseIntArray.put(R.id.paymentInstrumentSelectedImageView, 14);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.I = 0L;
        }
        this.E.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.E.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 2L;
        }
        this.E.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }
}
