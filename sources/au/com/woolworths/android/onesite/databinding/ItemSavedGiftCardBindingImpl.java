package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ItemSavedGiftCardBindingImpl extends ItemSavedGiftCardBinding {
    public static final ViewDataBinding.IncludedLayouts N;
    public static final SparseIntArray O;
    public final FrameLayout L;
    public long M;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        N = includedLayouts;
        includedLayouts.a(1, new int[]{2}, new int[]{R.layout.include_checkout_error_no_rounded}, new String[]{"include_checkout_error_no_rounded"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.savedCardLinearLayout, 3);
        sparseIntArray.put(R.id.savedCardIconImageView, 4);
        sparseIntArray.put(R.id.verticalDividerView, 5);
        sparseIntArray.put(R.id.savedCardNumberTextView, 6);
        sparseIntArray.put(R.id.savedCardExpiryTextView, 7);
        sparseIntArray.put(R.id.balanceValuePanel, 8);
        sparseIntArray.put(R.id.balanceValueTextView, 9);
        sparseIntArray.put(R.id.balanceLabelTextView, 10);
        sparseIntArray.put(R.id.cardNotAvailableTextView, 11);
        sparseIntArray.put(R.id.savedGiftCardPaymentAmountEditText, 12);
        sparseIntArray.put(R.id.removeTextView, 13);
        sparseIntArray.put(R.id.paymentInstrumentSelectedImageView, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemSavedGiftCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 15, N, O);
        super(dataBindingComponent, view, (TextView) objArrT[10], (LinearLayout) objArrT[8], (TextView) objArrT[9], (TextView) objArrT[11], (IncludeCheckoutErrorNoRoundedBinding) objArrT[2], (ImageView) objArrT[14], (TextView) objArrT[13], (TextView) objArrT[7], (ImageView) objArrT[4], (LinearLayout) objArrT[3], (TextView) objArrT[6], (EditText) objArrT[12], (View) objArrT[5]);
        this.M = -1L;
        IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding = this.C;
        if (includeCheckoutErrorNoRoundedBinding != null) {
            includeCheckoutErrorNoRoundedBinding.n = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.L = frameLayout;
        frameLayout.setTag(null);
        ((LinearLayout) objArrT[1]).setTag(null);
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
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.C.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.M = 2L;
        }
        this.C.r();
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
            this.M |= 1;
        }
        return true;
    }
}
