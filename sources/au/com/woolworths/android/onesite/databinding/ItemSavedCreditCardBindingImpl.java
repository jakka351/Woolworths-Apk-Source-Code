package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ItemSavedCreditCardBindingImpl extends ItemSavedCreditCardBinding {
    public static final ViewDataBinding.IncludedLayouts N;
    public static final SparseIntArray O;
    public final FrameLayout L;
    public long M;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        N = includedLayouts;
        includedLayouts.a(1, new int[]{3}, new int[]{R.layout.include_checkout_error_no_rounded}, new String[]{"include_checkout_error_no_rounded"});
        includedLayouts.a(2, new int[]{4}, new int[]{R.layout.include_payment_deduction}, new String[]{"include_payment_deduction"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.savedCardIconImageView, 5);
        sparseIntArray.put(R.id.verticalDividerView, 6);
        sparseIntArray.put(R.id.savedCardNumberTextView, 7);
        sparseIntArray.put(R.id.savedCardExpiryTextView, 8);
        sparseIntArray.put(R.id.cvvStepUpLinearLayout, 9);
        sparseIntArray.put(R.id.dummyView, 10);
        sparseIntArray.put(R.id.cardNotAvailableTextView, 11);
        sparseIntArray.put(R.id.removeTextView, 12);
        sparseIntArray.put(R.id.paymentInstrumentSelectedImageView, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemSavedCreditCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, N, O);
        super(dataBindingComponent, view, (IncludeCheckoutErrorNoRoundedBinding) objArrT[3], (TextView) objArrT[11], (IncludePaymentDeductionBinding) objArrT[4], (LinearLayout) objArrT[9], (View) objArrT[10], (ImageView) objArrT[13], (TextView) objArrT[12], (LinearLayout) objArrT[2], (TextView) objArrT[8], (ImageView) objArrT[5], (LinearLayout) objArrT[1], (TextView) objArrT[7], (View) objArrT[6]);
        this.M = -1L;
        IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding = this.y;
        if (includeCheckoutErrorNoRoundedBinding != null) {
            includeCheckoutErrorNoRoundedBinding.n = this;
        }
        IncludePaymentDeductionBinding includePaymentDeductionBinding = this.A;
        if (includePaymentDeductionBinding != null) {
            includePaymentDeductionBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.L = frameLayout;
        frameLayout.setTag(null);
        this.F.setTag(null);
        this.I.setTag(null);
        E(view);
        r();
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
        this.y.k();
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.y.p() || this.A.p();
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
        this.y.r();
        this.A.r();
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
