package au.com.woolworths.product.details.databinding;

import au.com.woolworths.product.details.models.CountryOfOriginAndHealthInfo;
import au.com.woolworths.product.details.ui.CountryOfOriginImageLoaderListener;

/* loaded from: classes4.dex */
public class EpoxyItemCountryOfOriginAndHealthInfoBindingImpl extends EpoxyItemCountryOfOriginAndHealthInfoBinding {
    public long E;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (106 == i) {
            this.D = (CountryOfOriginImageLoaderListener) obj;
            synchronized (this) {
                this.E |= 1;
            }
            h(106);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.C = (CountryOfOriginAndHealthInfo) obj;
        synchronized (this) {
            this.E |= 2;
        }
        h(53);
        y();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.details.databinding.EpoxyItemCountryOfOriginAndHealthInfoBindingImpl.j():void");
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
