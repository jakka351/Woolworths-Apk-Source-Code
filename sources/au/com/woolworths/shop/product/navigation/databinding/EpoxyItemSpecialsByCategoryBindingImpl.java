package au.com.woolworths.shop.product.navigation.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.generated.callback.OnClickListener;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryClickHandler;

/* loaded from: classes4.dex */
public class EpoxyItemSpecialsByCategoryBindingImpl extends EpoxyItemSpecialsByCategoryBinding implements OnClickListener.Listener {
    public final OnClickListener B;
    public long C;

    public EpoxyItemSpecialsByCategoryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
        this.C = -1L;
        this.y.setTag(null);
        E(view);
        this.B = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.A = (ProductCategoryClickHandler) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.z = (ProductCategory) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.product.navigation.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductCategoryClickHandler productCategoryClickHandler = this.A;
        if (productCategoryClickHandler != null) {
            productCategoryClickHandler.a();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        ProductCategory productCategory = this.z;
        long j2 = 6 & j;
        String title = (j2 == 0 || productCategory == null) ? null : productCategory.getTitle();
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.B);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, title);
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
