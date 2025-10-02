package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemYourGroceriesSkeletonHeaderTileBindingImpl extends EpoxyItemYourGroceriesSkeletonHeaderTileBinding {
    public static final ViewDataBinding.IncludedLayouts F;
    public static final SparseIntArray G;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{1, 2, 3}, new int[]{R.layout.include_horizontal_divider, R.layout.include_horizontal_divider, R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider", "include_horizontal_divider", "include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.chips_collection, 4);
        sparseIntArray.put(R.id.item_count, 5);
        sparseIntArray.put(R.id.title, 6);
        sparseIntArray.put(R.id.help_icon, 7);
        sparseIntArray.put(R.id.category, 8);
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
        this.z.k();
        this.A.k();
        this.B.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.z.p() || this.A.p() || this.B.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 8L;
        }
        this.z.r();
        this.A.r();
        this.B.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.E |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.E |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 4;
        }
        return true;
    }
}
