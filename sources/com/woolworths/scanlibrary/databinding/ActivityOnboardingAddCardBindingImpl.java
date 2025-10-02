package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ActivityOnboardingAddCardBindingImpl extends ActivityOnboardingAddCardBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public static final SparseIntArray F;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.layout_dark_toolbar}, new String[]{"layout_dark_toolbar"});
        includedLayouts.a(1, new int[]{3}, new int[]{R.layout.view_addcard_error}, new String[]{"view_addcard_error"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.no_payment_card_warning, 4);
        sparseIntArray.put(R.id.imageview_add_card_error, 5);
        sparseIntArray.put(R.id.txtErrorHeader, 6);
        sparseIntArray.put(R.id.txtErrorBody, 7);
        sparseIntArray.put(R.id.add_payment_card_info_msg, 8);
        sparseIntArray.put(R.id.addCreditCardView, 9);
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
        this.C.k();
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.C.p() || this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 4L;
        }
        this.C.r();
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.D |= 1;
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
            this.D |= 2;
        }
        return true;
    }
}
