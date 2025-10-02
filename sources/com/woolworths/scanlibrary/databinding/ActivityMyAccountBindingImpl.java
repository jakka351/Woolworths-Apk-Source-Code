package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ActivityMyAccountBindingImpl extends ActivityMyAccountBinding {
    public static final ViewDataBinding.IncludedLayouts I;
    public static final SparseIntArray J;
    public long H;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        I = includedLayouts;
        includedLayouts.a(1, new int[]{2}, new int[]{R.layout.layout_dark_toolbar}, new String[]{"layout_dark_toolbar"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.header, 3);
        sparseIntArray.put(R.id.txtUserName, 4);
        sparseIntArray.put(R.id.txtUserEmailId, 5);
        sparseIntArray.put(R.id.separator, 6);
        sparseIntArray.put(R.id.sectionRewards, 7);
        sparseIntArray.put(R.id.label_wow_rewards, 8);
        sparseIntArray.put(R.id.txtWowRewardsNumber, 9);
        sparseIntArray.put(R.id.label_add_rewards_card, 10);
        sparseIntArray.put(R.id.label_view_rewards_info, 11);
        sparseIntArray.put(R.id.imgRewardsCard, 12);
        sparseIntArray.put(R.id.txtLabelYourCard, 13);
        sparseIntArray.put(R.id.paymentInstrumentFragmentHolder, 14);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.H = 0L;
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 2L;
        }
        this.y.r();
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
            this.H |= 1;
        }
        return true;
    }
}
