package au.com.woolworths.feature.shop.catalogue.databinding;

import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePage;

/* loaded from: classes3.dex */
public class ItemCataloguePageImageBindingImpl extends ItemCataloguePageImageBinding {
    public long C;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (106 == i) {
            M((ImageLoaderListener) obj);
            return true;
        }
        if (32 != i) {
            return false;
        }
        L((CataloguePage) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCataloguePageImageBinding
    public final void L(CataloguePage cataloguePage) throws Throwable {
        this.z = cataloguePage;
        synchronized (this) {
            this.C |= 2;
        }
        h(32);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCataloguePageImageBinding
    public final void M(ImageLoaderListener imageLoaderListener) throws Throwable {
        this.A = imageLoaderListener;
        synchronized (this) {
            this.C |= 1;
        }
        h(106);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        ImageLoaderListener imageLoaderListener = this.A;
        CataloguePage cataloguePage = this.z;
        long j2 = j & 7;
        String pageImageLink = (j2 == 0 || cataloguePage == null) ? null : cataloguePage.getPageImageLink();
        if (j2 != 0) {
            BindingAdaptersKt.e(this.y, pageImageLink, imageLoaderListener);
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
