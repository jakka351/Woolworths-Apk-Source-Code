package au.com.woolworths.feature.shop.catalogue.databinding;

import android.util.SparseIntArray;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePage;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ItemCatalogueDetailsBindingImpl extends ItemCatalogueDetailsBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.progress_bar, 2);
        sparseIntArray.put(R.id.retry_image_view, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (32 != i) {
            return false;
        }
        L((CataloguePage) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueDetailsBinding
    public final void L(CataloguePage cataloguePage) throws Throwable {
        this.B = cataloguePage;
        synchronized (this) {
            this.D |= 1;
        }
        h(32);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        CataloguePage cataloguePage = this.B;
        if ((j & 3) != 0) {
            this.y.setCataloguePageInfo(cataloguePage);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
