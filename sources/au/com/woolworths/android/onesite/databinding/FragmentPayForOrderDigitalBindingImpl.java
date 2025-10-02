package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderErrorState;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentPayForOrderDigitalBindingImpl extends FragmentPayForOrderDigitalBinding {
    public static final ViewDataBinding.IncludedLayouts q0;
    public static final SparseIntArray r0;
    public long p0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(50);
        q0 = includedLayouts;
        includedLayouts.a(0, new int[]{12}, new int[]{R.layout.include_generic_inline_error_state}, new String[]{"include_generic_inline_error_state"});
        includedLayouts.a(1, new int[]{5}, new int[]{R.layout.include_checkout_error_no_rounded}, new String[]{"include_checkout_error_no_rounded"});
        includedLayouts.a(2, new int[]{6, 7, 8, 10}, new int[]{R.layout.include_checkout_expired_error, R.layout.include_checkout_warning, R.layout.include_add_new_gift_card_digital, R.layout.include_add_new_credit_card_digital}, new String[]{"include_checkout_expired_error", "include_checkout_warning", "include_add_new_gift_card_digital", "include_add_new_credit_card_digital"});
        includedLayouts.a(3, new int[]{9}, new int[]{R.layout.include_checkout_expired_error}, new String[]{"include_checkout_expired_error"});
        includedLayouts.a(4, new int[]{11}, new int[]{R.layout.include_payment_deduction}, new String[]{"include_payment_deduction"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        r0 = sparseIntArray;
        sparseIntArray.put(R.id.wrapperNestScrollView, 13);
        sparseIntArray.put(R.id.paymentInstrumentsLinearLayout, 14);
        sparseIntArray.put(R.id.orderTotalRemainingLabelTextView, 15);
        sparseIntArray.put(R.id.globalErrorLinearLayout, 16);
        sparseIntArray.put(R.id.globalErrorTextView, 17);
        sparseIntArray.put(R.id.addGiftCardLinearLayout, 18);
        sparseIntArray.put(R.id.addGiftCardTextView, 19);
        sparseIntArray.put(R.id.expiredZeroBalanceGiftCardsRecycleView, 20);
        sparseIntArray.put(R.id.giftCardsRecycleView, 21);
        sparseIntArray.put(R.id.addEditGiftCardsLinearLayout, 22);
        sparseIntArray.put(R.id.addNewGiftCardTextView, 23);
        sparseIntArray.put(R.id.manageGiftCardTextView, 24);
        sparseIntArray.put(R.id.doneGiftCardManageTextView, 25);
        sparseIntArray.put(R.id.addCreditCardLinearLayout, 26);
        sparseIntArray.put(R.id.addCreditCardTextView, 27);
        sparseIntArray.put(R.id.expiredCreditCardsRecycleView, 28);
        sparseIntArray.put(R.id.creditCardsRecycleView, 29);
        sparseIntArray.put(R.id.addNewCreditCardSectionMarker, 30);
        sparseIntArray.put(R.id.addEditCreditCardsLinearLayout, 31);
        sparseIntArray.put(R.id.addNewCreditCardTextView, 32);
        sparseIntArray.put(R.id.manageCreditCardTextView, 33);
        sparseIntArray.put(R.id.doneCreditCardManageTextView, 34);
        sparseIntArray.put(R.id.payPalFrameLayout, 35);
        sparseIntArray.put(R.id.addPayPalTextView, 36);
        sparseIntArray.put(R.id.linkToPayPalTextView, 37);
        sparseIntArray.put(R.id.payPalDivider, 38);
        sparseIntArray.put(R.id.payPalEmailTextView, 39);
        sparseIntArray.put(R.id.payPalSelectedImageView, 40);
        sparseIntArray.put(R.id.deletePayPalLinearLayout, 41);
        sparseIntArray.put(R.id.deletePayPalTextView, 42);
        sparseIntArray.put(R.id.addAndroidPayLinearLayout, 43);
        sparseIntArray.put(R.id.addAndroidPayTextView, 44);
        sparseIntArray.put(R.id.divider_view, 45);
        sparseIntArray.put(R.id.total_label_text_view, 46);
        sparseIntArray.put(R.id.total_value_text_view, 47);
        sparseIntArray.put(R.id.outstanding_balance_text_view, 48);
        sparseIntArray.put(R.id.place_order_button, 49);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.h0.D(lifecycleOwner);
        this.S.D(lifecycleOwner);
        this.j0.D(lifecycleOwner);
        this.H.D(lifecycleOwner);
        this.R.D(lifecycleOwner);
        this.F.D(lifecycleOwner);
        this.e0.D(lifecycleOwner);
        this.W.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (116 != i) {
            return false;
        }
        L((DigitalPayForOrderErrorState) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding
    public final void L(DigitalPayForOrderErrorState digitalPayForOrderErrorState) throws Throwable {
        this.o0 = digitalPayForOrderErrorState;
        synchronized (this) {
            this.p0 |= 256;
        }
        h(116);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.p0;
            this.p0 = 0L;
        }
        DigitalPayForOrderErrorState digitalPayForOrderErrorState = this.o0;
        if ((j & 768) != 0) {
            this.W.M(digitalPayForOrderErrorState);
        }
        this.h0.k();
        this.S.k();
        this.j0.k();
        this.H.k();
        this.R.k();
        this.F.k();
        this.e0.k();
        this.W.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.p0 != 0) {
                    return true;
                }
                return this.h0.p() || this.S.p() || this.j0.p() || this.H.p() || this.R.p() || this.F.p() || this.e0.p() || this.W.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.p0 = 512L;
        }
        this.h0.r();
        this.S.r();
        this.j0.r();
        this.H.r();
        this.R.r();
        this.F.r();
        this.e0.r();
        this.W.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        switch (i) {
            case 0:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.p0 |= 1;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.p0 |= 2;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.p0 |= 4;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.p0 |= 8;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.p0 |= 16;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.p0 |= 32;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.p0 |= 64;
                }
                return true;
            case 7:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.p0 |= 128;
                }
                return true;
            default:
                return false;
        }
    }
}
