package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.ProductListViewModel;

/* loaded from: classes3.dex */
public abstract class IncludeProductListHeaderBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public ProductListViewModel C;
    public final ComposeView y;
    public final ImageView z;

    public IncludeProductListHeaderBinding(DataBindingComponent dataBindingComponent, View view, ComposeView composeView, ImageView imageView, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 1);
        this.y = composeView;
        this.z = imageView;
        this.A = textView;
        this.B = textView2;
    }

    public abstract void L(ProductListViewModel productListViewModel);
}
