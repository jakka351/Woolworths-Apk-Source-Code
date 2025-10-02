package au.com.woolworths.shop.product.navigation.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.data.marketplace.MarketplaceCategoriesInfo;
import au.com.woolworths.shop.product.navigation.ui.subcategory.ProductSubCategoryClickHandler;

/* loaded from: classes4.dex */
public abstract class EpoxyItemSubCategoryBinding extends ViewDataBinding {
    public ProductCategory A;
    public MarketplaceCategoriesInfo B;
    public ProductSubCategoryClickHandler C;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemSubCategoryBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }
}
