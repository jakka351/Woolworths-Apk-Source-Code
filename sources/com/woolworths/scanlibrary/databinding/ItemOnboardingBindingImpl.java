package com.woolworths.scanlibrary.databinding;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingPageTemplateData;

/* loaded from: classes7.dex */
public class ItemOnboardingBindingImpl extends ItemOnboardingBinding {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.guideline_image_bottom, 5);
        sparseIntArray.put(R.id.guideline_image_start, 6);
        sparseIntArray.put(R.id.guideline_image_end, 7);
        sparseIntArray.put(R.id.guideline_title, 8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (148 != i) {
            return false;
        }
        L((OnBoardingPageTemplateData) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ItemOnboardingBinding
    public final void L(OnBoardingPageTemplateData onBoardingPageTemplateData) throws Throwable {
        this.D = onBoardingPageTemplateData;
        synchronized (this) {
            this.F |= 1;
        }
        h(148);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String string;
        int i;
        int color;
        String string2;
        boolean z;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        OnBoardingPageTemplateData onBoardingPageTemplateData = this.D;
        long j2 = j & 3;
        int i5 = 0;
        if (j2 != 0) {
            if (onBoardingPageTemplateData != null) {
                z = onBoardingPageTemplateData.f;
                i2 = onBoardingPageTemplateData.f21283a;
                i3 = onBoardingPageTemplateData.c;
                i4 = onBoardingPageTemplateData.d;
                i = onBoardingPageTemplateData.b;
            } else {
                i = 0;
                z = false;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            color = this.h.getContext().getColor(i2);
            string = this.h.getContext().getString(i3);
            string2 = this.h.getContext().getString(i4);
            if (j2 != 0) {
                j |= z ? 8L : 4L;
            }
            if (!z) {
                i5 = 8;
            }
        } else {
            string = null;
            i = 0;
            color = 0;
            string2 = null;
        }
        if ((j & 3) != 0) {
            this.y.setVisibility(i5);
            this.z.setImageResource(i);
            this.A.setBackground(new ColorDrawable(color));
            TextViewBindingAdapter.b(this.B, string2);
            TextViewBindingAdapter.b(this.C, string);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
