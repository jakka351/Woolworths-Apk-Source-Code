package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ItemExpiredCreditCardBindingImpl extends ItemExpiredCreditCardBinding {
    public static final ViewDataBinding.IncludedLayouts S;
    public static final SparseIntArray T;
    public long R;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(20);
        S = includedLayouts;
        includedLayouts.a(1, new int[]{2}, new int[]{R.layout.include_checkout_error_no_rounded}, new String[]{"include_checkout_error_no_rounded"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.expireCardDetailsLinearLayout, 3);
        sparseIntArray.put(R.id.savedCardIconImageView, 4);
        sparseIntArray.put(R.id.verticalDividerView, 5);
        sparseIntArray.put(R.id.savedCardNumberTextView, 6);
        sparseIntArray.put(R.id.savedCardExpiryTextView, 7);
        sparseIntArray.put(R.id.editTextView, 8);
        sparseIntArray.put(R.id.removeTextView, 9);
        sparseIntArray.put(R.id.cardNotAvailableTextView, 10);
        sparseIntArray.put(R.id.horizontalDividerView, 11);
        sparseIntArray.put(R.id.getUpdateCreditLinearLayout, 12);
        sparseIntArray.put(R.id.dummyView, 13);
        sparseIntArray.put(R.id.editActionsLinearLayout, 14);
        sparseIntArray.put(R.id.cancelEditButton, 15);
        sparseIntArray.put(R.id.updateButton, 16);
        sparseIntArray.put(R.id.initialisationErrorLinearLayout, 17);
        sparseIntArray.put(R.id.initialisationFailTextView, 18);
        sparseIntArray.put(R.id.refresh_button, 19);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.R = 0L;
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.R != 0) {
                    return true;
                }
                return this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.R = 2L;
        }
        this.z.r();
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
            this.R |= 1;
        }
        return true;
    }
}
