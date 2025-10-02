package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeAddNewGiftCardDigitalBindingImpl extends IncludeAddNewGiftCardDigitalBinding {
    public static final ViewDataBinding.IncludedLayouts N;
    public static final SparseIntArray O;
    public long M;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        N = includedLayouts;
        includedLayouts.a(0, new int[]{1, 2}, new int[]{R.layout.include_checkout_warning, R.layout.include_checkout_error_no_rounded}, new String[]{"include_checkout_warning", "include_checkout_error_no_rounded"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.addedGiftCardsRecyclerView, 3);
        sparseIntArray.put(R.id.addNewGiftCardDetailsLinearLayout, 4);
        sparseIntArray.put(R.id.addGiftCardIconImageView, 5);
        sparseIntArray.put(R.id.cardNumberEditText, 6);
        sparseIntArray.put(R.id.cardPinEditText, 7);
        sparseIntArray.put(R.id.giftCardAmountPanel, 8);
        sparseIntArray.put(R.id.giftCardAvailableAmountTextView, 9);
        sparseIntArray.put(R.id.giftCardAmountDollarWithBox, 10);
        sparseIntArray.put(R.id.paymentAmountEditText, 11);
        sparseIntArray.put(R.id.saveNewGiftCardCheckBox, 12);
        sparseIntArray.put(R.id.clearGiftCardTextView, 13);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.M = 0L;
        }
        this.A.k();
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.A.p() || this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.M = 4L;
        }
        this.A.r();
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.M |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.M |= 2;
        }
        return true;
    }
}
