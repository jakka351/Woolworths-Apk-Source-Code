package au.com.woolworths.shop.product.navigation.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryClickHandler;

/* loaded from: classes4.dex */
public abstract class EpoxyItemSpecialsByCategoryBinding extends ViewDataBinding {
    public ProductCategoryClickHandler A;
    public final TextView y;
    public ProductCategory z;

    public EpoxyItemSpecialsByCategoryBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
