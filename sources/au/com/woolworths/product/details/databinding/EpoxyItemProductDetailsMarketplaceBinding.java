package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.models.ProductDetailsMarketplace;

/* loaded from: classes4.dex */
public abstract class EpoxyItemProductDetailsMarketplaceBinding extends ViewDataBinding {
    public final ImageView A;
    public final ImageButton B;
    public final TextView C;
    public final Button D;
    public ProductDetailsMarketplace E;
    public ProductDetailsClickHandler F;
    public final IncludeHorizontalDividerBinding y;
    public final TextView z;

    public EpoxyItemProductDetailsMarketplaceBinding(DataBindingComponent dataBindingComponent, View view, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, TextView textView, ImageView imageView, ImageButton imageButton, TextView textView2, Button button) {
        super(dataBindingComponent, view, 1);
        this.y = includeHorizontalDividerBinding;
        this.z = textView;
        this.A = imageView;
        this.B = imageButton;
        this.C = textView2;
        this.D = button;
    }
}
