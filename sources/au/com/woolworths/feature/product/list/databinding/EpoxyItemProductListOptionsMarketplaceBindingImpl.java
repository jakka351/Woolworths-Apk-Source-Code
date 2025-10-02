package au.com.woolworths.feature.product.list.databinding;

import android.util.SparseIntArray;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.product.list.data.ProductFilterSwitch;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemProductListOptionsMarketplaceBindingImpl extends EpoxyItemProductListOptionsMarketplaceBinding {
    public static final ViewDataBinding.IncludedLayouts G;
    public static final SparseIntArray H;
    public long F;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        G = includedLayouts;
        includedLayouts.a(0, new int[]{3, 4}, new int[]{R.layout.include_horizontal_divider, R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider", "include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.description_text_view, 5);
        sparseIntArray.put(R.id.marketplace_switch, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.E = (ProductFilterSwitch) obj;
        synchronized (this) {
            this.F |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String title;
        String imageUrl;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        ProductFilterSwitch productFilterSwitch = this.E;
        long j2 = j & 12;
        if (j2 == 0 || productFilterSwitch == null) {
            title = null;
            imageUrl = null;
        } else {
            title = productFilterSwitch.getTitle();
            imageUrl = productFilterSwitch.getImageUrl();
        }
        if (j2 != 0) {
            ImageView imageView = this.B;
            d.z(imageView, R.drawable.ic_everyday_market_logo_small, imageView, imageUrl, null);
            TextViewBindingAdapter.b(this.D, title);
        }
        this.A.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.A.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 8L;
        }
        this.A.r();
        this.z.r();
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
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 2;
        }
        return true;
    }
}
