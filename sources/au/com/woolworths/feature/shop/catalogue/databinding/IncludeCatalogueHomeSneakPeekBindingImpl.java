package au.com.woolworths.feature.shop.catalogue.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeCatalogueHomeSneakPeekBindingImpl extends IncludeCatalogueHomeSneakPeekBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.top_guideline, 1);
        sparseIntArray.put(R.id.sneak_peek_title_text_view, 2);
        sparseIntArray.put(R.id.sneak_peek_subtitle_text_view, 3);
        sparseIntArray.put(R.id.sneak_peek_date_text_view, 4);
        sparseIntArray.put(R.id.bottom_guideline, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.D = 0L;
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
            this.D = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
