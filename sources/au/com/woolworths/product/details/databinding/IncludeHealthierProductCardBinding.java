package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.details.models.HealthierOption;
import au.com.woolworths.product.tile.ProductPriceView;

/* loaded from: classes4.dex */
public abstract class IncludeHealthierProductCardBinding extends ViewDataBinding {
    public final ImageView A;
    public final IncludeBrandLabelBinding B;
    public final ComposeView C;
    public final IncludeProductMultibuyLabelBinding D;
    public final TextView E;
    public final ProductPriceView F;
    public final TextView G;
    public final TextView H;
    public HealthierOption I;
    public final ImageView y;
    public final ImageView z;

    public IncludeHealthierProductCardBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, IncludeBrandLabelBinding includeBrandLabelBinding, ComposeView composeView, IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding, TextView textView, ProductPriceView productPriceView, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 2);
        this.y = imageView;
        this.z = imageView2;
        this.A = imageView3;
        this.B = includeBrandLabelBinding;
        this.C = composeView;
        this.D = includeProductMultibuyLabelBinding;
        this.E = textView;
        this.F = productPriceView;
        this.G = textView2;
        this.H = textView3;
    }

    public abstract void L(HealthierOption healthierOption);
}
