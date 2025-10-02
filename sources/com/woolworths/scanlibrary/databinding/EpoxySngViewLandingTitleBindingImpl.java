package com.woolworths.scanlibrary.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.scanlibrary.ui.entry.content.ContentTitle;

/* loaded from: classes7.dex */
public class EpoxySngViewLandingTitleBindingImpl extends EpoxySngViewLandingTitleBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (268 != i) {
            return false;
        }
        this.A = (ContentTitle) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(268);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        ContentTitle contentTitle = this.A;
        long j2 = j & 3;
        if (j2 == 0 || contentTitle == null) {
            str = null;
            str2 = null;
        } else {
            str = contentTitle.b;
            str2 = contentTitle.f21253a;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str);
            TextViewBindingAdapter.b(this.z, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
