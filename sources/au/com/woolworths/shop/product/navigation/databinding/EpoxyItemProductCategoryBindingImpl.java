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
import au.com.woolworths.shop.product.navigation.generated.callback.OnClickListener;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryClickHandler;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemProductCategoryBindingImpl extends EpoxyItemProductCategoryBinding implements OnClickListener.Listener {
    public final ConstraintLayout C;
    public final OnClickListener D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductCategoryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (ImageView) objArrT[1], (TextView) objArrT[2], dataBindingComponent);
        this.E = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        this.z.setTag(null);
        E(view);
        this.D = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.B = (ProductCategoryClickHandler) obj;
            synchronized (this) {
                this.E |= 1;
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
            this.E |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.product.navigation.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductCategoryClickHandler productCategoryClickHandler = this.B;
        if (productCategoryClickHandler != null) {
            productCategoryClickHandler.a();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String title;
        String iconUrl;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        ProductCategory productCategory = this.A;
        long j2 = 6 & j;
        if (j2 == 0 || productCategory == null) {
            title = null;
            iconUrl = null;
        } else {
            title = productCategory.getTitle();
            iconUrl = productCategory.getIconUrl();
        }
        if (j2 != 0) {
            ImageView imageView = this.y;
            d.z(this.y, R.drawable.ic_product_image_unavailable_circle, imageView, iconUrl, AppCompatResources.b(R.drawable.ic_product_category_image_loading, imageView.getContext()));
            TextViewBindingAdapter.b(this.z, title);
        }
        if ((j & 4) != 0) {
            this.C.setOnClickListener(this.D);
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
            this.E = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
