package au.com.woolworths.feature.shop.recipes.databinding;

import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;

/* loaded from: classes3.dex */
public class ClickableRectGroupBindingImpl extends ClickableRectGroupBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (107 == i) {
            M((String) obj);
            return true;
        }
        if (106 != i) {
            return false;
        }
        L((ImageLoaderListener) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ClickableRectGroupBinding
    public final void L(ImageLoaderListener imageLoaderListener) throws Throwable {
        this.A = imageLoaderListener;
        synchronized (this) {
            this.C |= 2;
        }
        h(106);
        y();
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ClickableRectGroupBinding
    public final void M(String str) throws Throwable {
        this.z = str;
        synchronized (this) {
            this.C |= 1;
        }
        h(107);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        String str = this.z;
        ImageLoaderListener imageLoaderListener = this.A;
        if ((j & 7) != 0) {
            BindingAdaptersKt.e(this.y, str, imageLoaderListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
