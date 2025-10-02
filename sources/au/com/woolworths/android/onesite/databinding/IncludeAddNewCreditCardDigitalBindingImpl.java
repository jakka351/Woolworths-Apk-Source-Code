package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeAddNewCreditCardDigitalBindingImpl extends IncludeAddNewCreditCardDigitalBinding {
    public static final ViewDataBinding.IncludedLayouts P;
    public static final SparseIntArray Q;
    public long O;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(18);
        P = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_checkout_error_no_rounded}, new String[]{"include_checkout_error_no_rounded"});
        includedLayouts.a(1, new int[]{3}, new int[]{R.layout.include_payment_deduction}, new String[]{"include_payment_deduction"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.initialisationErrorLinearLayout, 4);
        sparseIntArray.put(R.id.initialisationFailTextView, 5);
        sparseIntArray.put(R.id.refresh_button, 6);
        sparseIntArray.put(R.id.creditCardPaymentDeductionTextView, 7);
        sparseIntArray.put(R.id.creditCardCaptureHostView, 8);
        sparseIntArray.put(R.id.saveClearLinearLayoutWrapper, 9);
        sparseIntArray.put(R.id.saveNewCreditCardCheckBox, 10);
        sparseIntArray.put(R.id.clearCardDetailsTextView, 11);
        sparseIntArray.put(R.id.acceptedPaymentTypesWrapper, 12);
        sparseIntArray.put(R.id.visaTypeImageView, 13);
        sparseIntArray.put(R.id.mastercardTypeImageView, 14);
        sparseIntArray.put(R.id.amexTypeImageView, 15);
        sparseIntArray.put(R.id.dinersTypeImageView, 16);
        sparseIntArray.put(R.id.jcbImageView, 17);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
        this.E.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.O = 0L;
        }
        this.z.k();
        this.E.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.O != 0) {
                    return true;
                }
                return this.z.p() || this.E.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.O = 4L;
        }
        this.z.r();
        this.E.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.O |= 1;
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
            this.O |= 2;
        }
        return true;
    }
}
