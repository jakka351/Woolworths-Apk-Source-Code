package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeProductListMarketplaceDetailsBindingImpl extends IncludeProductListMarketplaceDetailsBinding {
    public final TextView A;
    public long B;
    public final ImageView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncludeProductListMarketplaceDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 0);
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        this.B = -1L;
        ((LinearLayout) objArrT[0]).setTag(null);
        ImageView imageView = (ImageView) objArrT[1];
        this.z = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArrT[2];
        this.A = textView;
        textView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (168 != i) {
            return false;
        }
        this.y = (ProductListMarketplace) obj;
        synchronized (this) {
            this.B |= 1;
        }
        h(168);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String imageUrl;
        String title;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        ProductListMarketplace productListMarketplace = this.y;
        long j2 = j & 3;
        if (j2 == 0 || productListMarketplace == null) {
            imageUrl = null;
            title = null;
        } else {
            imageUrl = productListMarketplace.getImageUrl();
            title = productListMarketplace.getTitle();
        }
        if (j2 != 0) {
            ImageView imageView = this.z;
            d.z(imageView, R.drawable.ic_everyday_market_logo_small, imageView, imageUrl, null);
            TextViewBindingAdapter.b(this.A, title);
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
