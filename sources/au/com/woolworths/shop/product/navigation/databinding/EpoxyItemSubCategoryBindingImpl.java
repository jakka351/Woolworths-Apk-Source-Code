package au.com.woolworths.shop.product.navigation.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.data.marketplace.MarketplaceCategoriesInfo;
import au.com.woolworths.shop.product.navigation.generated.callback.OnClickListener;
import au.com.woolworths.shop.product.navigation.ui.subcategory.ProductSubCategoryClickHandler;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemSubCategoryBindingImpl extends EpoxyItemSubCategoryBinding implements OnClickListener.Listener {
    public final ConstraintLayout D;
    public final OnClickListener E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemSubCategoryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[2], dataBindingComponent);
        this.F = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        E(view);
        this.E = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (169 == i) {
            this.B = (MarketplaceCategoriesInfo) obj;
            synchronized (this) {
                this.F |= 1;
            }
            h(169);
            y();
            return true;
        }
        if (35 == i) {
            this.C = (ProductSubCategoryClickHandler) obj;
            synchronized (this) {
                this.F |= 2;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.A = (ProductCategory) obj;
        synchronized (this) {
            this.F |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.product.navigation.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductSubCategoryClickHandler productSubCategoryClickHandler = this.C;
        MarketplaceCategoriesInfo marketplaceCategoriesInfo = this.B;
        ProductCategory productCategory = this.A;
        if (productSubCategoryClickHandler != null) {
            productSubCategoryClickHandler.Y5(productCategory, marketplaceCategoriesInfo);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        ProductCategory productCategory = this.A;
        long j2 = j & 12;
        String iconUrl = null;
        int i = 0;
        if (j2 != 0) {
            if (productCategory != null) {
                String title = productCategory.getTitle();
                iconUrl = productCategory.getIconUrl();
                str = title;
            } else {
                str = null;
            }
            boolean z = iconUrl == null;
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            if (z) {
                i = 8;
            }
        } else {
            str = null;
        }
        if ((12 & j) != 0) {
            this.y.setVisibility(i);
            ImageView imageView = this.y;
            d.z(this.y, R.drawable.ic_product_image_unavailable_circle, imageView, iconUrl, AppCompatResources.b(R.drawable.ic_product_category_image_loading, imageView.getContext()));
            TextViewBindingAdapter.b(this.z, str);
        }
        if ((j & 8) != 0) {
            this.D.setOnClickListener(this.E);
        }
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
            this.F = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
