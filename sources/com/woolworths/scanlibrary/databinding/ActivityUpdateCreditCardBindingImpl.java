package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity;

/* loaded from: classes7.dex */
public class ActivityUpdateCreditCardBindingImpl extends ActivityUpdateCreditCardBinding {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        J = includedLayouts;
        includedLayouts.a(0, new int[]{4}, new int[]{R.layout.layout_dark_toolbar}, new String[]{"layout_dark_toolbar"});
        includedLayouts.a(1, new int[]{5}, new int[]{R.layout.view_addcard_error}, new String[]{"view_addcard_error"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.scrollContainer, 6);
        sparseIntArray.put(R.id.sectionCardHolder, 7);
        sparseIntArray.put(R.id.sectionEditCard, 8);
        sparseIntArray.put(R.id.imgCardScheme, 9);
        sparseIntArray.put(R.id.divider, 10);
        sparseIntArray.put(R.id.updateCreditCardView, 11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((UpdateCreditCardActivity.ViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ActivityUpdateCreditCardBinding
    public final void L(UpdateCreditCardActivity.ViewModel viewModel) throws Throwable {
        J(5, viewModel);
        this.H = viewModel;
        synchronized (this) {
            this.I |= 32;
        }
        h(273);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.ActivityUpdateCreditCardBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.D.p() || this.C.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 128L;
        }
        this.D.r();
        this.C.r();
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
                    this.I |= 1;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.I |= 2;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.I |= 4;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.I |= 8;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.I |= 16;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.I |= 32;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.I |= 64;
                }
                return true;
            default:
                return false;
        }
    }
}
