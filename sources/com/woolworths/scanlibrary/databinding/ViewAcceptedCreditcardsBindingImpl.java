package com.woolworths.scanlibrary.databinding;

import com.woolworths.scanlibrary.util.widget.AddCreditCardView;

/* loaded from: classes7.dex */
public class ViewAcceptedCreditcardsBindingImpl extends ViewAcceptedCreditcardsBinding {
    public long F;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((AddCreditCardView.ViewModel) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewAcceptedCreditcardsBinding
    public final void L(AddCreditCardView.ViewModel viewModel) throws Throwable {
        J(5, viewModel);
        this.E = viewModel;
        synchronized (this) {
            this.F |= 32;
        }
        h(273);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[PHI: r2
  0x004a: PHI (r2v3 long) = (r2v0 long), (r2v19 long) binds: [B:9:0x0024, B:22:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2 A[PHI: r2
  0x00a2: PHI (r2v7 long) = (r2v6 long), (r2v15 long) binds: [B:47:0x007d, B:60:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d7  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.databinding.ViewAcceptedCreditcardsBindingImpl.j():void");
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
            this.F = 64L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.F |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.F |= 4;
            }
            return true;
        }
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.F |= 8;
            }
            return true;
        }
        if (i == 4) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.F |= 16;
            }
            return true;
        }
        if (i != 5) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 32;
        }
        return true;
    }
}
