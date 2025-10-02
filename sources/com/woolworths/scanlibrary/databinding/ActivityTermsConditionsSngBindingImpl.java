package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ActivityTermsConditionsSngBindingImpl extends ActivityTermsConditionsSngBinding {
    public static final ViewDataBinding.IncludedLayouts F;
    public static final SparseIntArray G;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{1}, new int[]{R.layout.layout_dark_toolbar}, new String[]{"layout_dark_toolbar"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.sectionAgreement, 2);
        sparseIntArray.put(R.id.chkTnc, 3);
        sparseIntArray.put(R.id.lblAgreeTnc, 4);
        sparseIntArray.put(R.id.chkPolicy, 5);
        sparseIntArray.put(R.id.lblPrivacy, 6);
        sparseIntArray.put(R.id.btnTnCAgree, 7);
        sparseIntArray.put(R.id.webViewTermsNConditions, 8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.E = 0L;
        }
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 2L;
        }
        this.B.r();
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
            this.E |= 1;
        }
        return true;
    }
}
