package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.ProductListClickHandler;
import au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemIngredientCardSeparatorBinding extends ViewDataBinding {
    public final View A;
    public IngredientCardApiData B;
    public ProductListClickHandler C;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemIngredientCardSeparatorBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, TextView textView, View view2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = view2;
    }
}
