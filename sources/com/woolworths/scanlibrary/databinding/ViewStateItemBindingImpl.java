package com.woolworths.scanlibrary.databinding;

import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.scanlibrary.ui.stores.dto.StateDTO;

/* loaded from: classes7.dex */
public class ViewStateItemBindingImpl extends ViewStateItemBinding {
    public long B;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (252 != i) {
            return false;
        }
        this.A = (StateDTO) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(252);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        StateDTO stateDTO = this.A;
        long j2 = j & 3;
        String str = (j2 == 0 || stateDTO == null) ? null : stateDTO.f21343a;
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, str);
            this.z.setTag(str);
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
