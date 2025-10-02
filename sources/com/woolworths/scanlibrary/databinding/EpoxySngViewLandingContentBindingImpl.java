package com.woolworths.scanlibrary.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.scanlibrary.ui.entry.content.ContentItem;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentActionListener;

/* loaded from: classes7.dex */
public class EpoxySngViewLandingContentBindingImpl extends EpoxySngViewLandingContentBinding {
    public long E;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 != i) {
            if (2 != i) {
                return false;
            }
            this.D = (LandingContentActionListener) obj;
            return true;
        }
        this.C = (ContentItem) obj;
        synchronized (this) {
            this.E |= 1;
        }
        h(145);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int i;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        ContentItem contentItem = this.C;
        long j2 = j & 5;
        boolean z = false;
        if (j2 != 0) {
            if (contentItem != null) {
                str = contentItem.c;
                i = contentItem.f21252a;
                str3 = contentItem.d;
                str2 = contentItem.b;
            } else {
                i = 0;
                str = null;
                str2 = null;
                str3 = null;
            }
            if (str3 != null) {
                z = true;
            }
        } else {
            i = 0;
            str = null;
            str2 = null;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str);
            BindingAdaptersKt.o(this.z, z);
            BindingAdaptersKt.m(this.A, i, null);
            TextViewBindingAdapter.b(this.B, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
