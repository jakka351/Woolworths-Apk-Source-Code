package au.com.woolworths.shop.product.navigation.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryClickHandler;

/* loaded from: classes4.dex */
public abstract class EpoxyItemProductCategoryBinding extends ViewDataBinding {
    public ProductCategory A;
    public ProductCategoryClickHandler B;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemProductCategoryBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }
}
