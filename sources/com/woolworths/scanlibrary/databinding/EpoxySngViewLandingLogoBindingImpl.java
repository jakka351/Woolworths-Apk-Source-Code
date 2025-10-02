package com.woolworths.scanlibrary.databinding;

import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.entry.content.TopLogo;

/* loaded from: classes7.dex */
public class EpoxySngViewLandingLogoBindingImpl extends EpoxySngViewLandingLogoBinding {
    public long A;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (266 != i) {
            return false;
        }
        this.z = (TopLogo) obj;
        synchronized (this) {
            this.A |= 1;
        }
        h(266);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        long j2 = j & 3;
        int i = (j2 == 0 || this.z == null) ? 0 : R.drawable.sng_landing_top_logo;
        if (j2 != 0) {
            BindingAdaptersKt.m(this.y, i, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.A = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
