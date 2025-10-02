package com.woolworths.scanlibrary.databinding;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingPageTemplateData;

/* loaded from: classes7.dex */
public class ItemOnboardingRefreshBindingImpl extends ItemOnboardingRefreshBinding {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.guideline_image_bottom, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (148 != i) {
            return false;
        }
        L((OnBoardingPageTemplateData) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ItemOnboardingRefreshBinding
    public final void L(OnBoardingPageTemplateData onBoardingPageTemplateData) throws Throwable {
        this.E = onBoardingPageTemplateData;
        synchronized (this) {
            this.G |= 1;
        }
        h(148);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String string;
        int i;
        int i2;
        int color;
        String string2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        OnBoardingPageTemplateData onBoardingPageTemplateData = this.E;
        long j2 = j & 3;
        if (j2 != 0) {
            if (onBoardingPageTemplateData != null) {
                z = onBoardingPageTemplateData.f;
                i3 = onBoardingPageTemplateData.f21283a;
                z2 = onBoardingPageTemplateData.g;
                i4 = onBoardingPageTemplateData.c;
                i5 = onBoardingPageTemplateData.d;
                i = onBoardingPageTemplateData.b;
            } else {
                i = 0;
                z = false;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
            }
            color = this.h.getContext().getColor(i3);
            string = this.h.getContext().getString(i4);
            string2 = this.h.getContext().getString(i5);
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            if ((j & 3) != 0) {
                j |= z2 ? 8L : 4L;
            }
            int i6 = z ? 0 : 8;
            i2 = z2 ? 0 : 8;
            i = i6;
        } else {
            string = null;
            i = 0;
            i2 = 0;
            color = 0;
            string2 = null;
        }
        if ((j & 3) != 0) {
            this.y.setVisibility(i);
            this.z.setImageResource(i);
            this.A.setVisibility(i2);
            this.B.setBackground(new ColorDrawable(color));
            TextViewBindingAdapter.b(this.C, string2);
            TextViewBindingAdapter.b(this.D, string);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
