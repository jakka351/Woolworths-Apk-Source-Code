package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemOrderCardTileListSkeletonBindingImpl extends EpoxyItemOrderCardTileListSkeletonBinding {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.status_icon, 1);
        sparseIntArray.put(R.id.status_label, 2);
        sparseIntArray.put(R.id.price_label, 3);
        sparseIntArray.put(R.id.caption_label, 4);
        sparseIntArray.put(R.id.address_label, 5);
        sparseIntArray.put(R.id.estimated_arrival_time, 6);
        sparseIntArray.put(R.id.chosen_window_date, 7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.E = 0L;
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
            this.E = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
