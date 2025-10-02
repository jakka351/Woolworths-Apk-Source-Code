package au.com.woolworths.product.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.offers.ProductsBoostView;
import au.com.woolworths.product.offers.ProductsBoostViewListener;
import au.com.woolworths.product.tile.ProductPriceView;

/* loaded from: classes4.dex */
public abstract class LayoutProductInfoBinding extends ViewDataBinding {
    public static final /* synthetic */ int P = 0;
    public final ImageView A;
    public final IncludeBrandLabelBinding B;
    public final IncludeProductMultibuyLabelBinding C;
    public final TextView D;
    public final ProductPriceView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final ProductsBoostView J;
    public ProductCard K;
    public ProductCardConfig L;
    public ProductsBoostViewListener M;
    public boolean N;
    public boolean O;
    public final ImageView y;
    public final ComposeView z;

    public LayoutProductInfoBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, ComposeView composeView, ImageView imageView2, IncludeBrandLabelBinding includeBrandLabelBinding, IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding, TextView textView, ProductPriceView productPriceView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ProductsBoostView productsBoostView) {
        super(dataBindingComponent, view, 2);
        this.y = imageView;
        this.z = composeView;
        this.A = imageView2;
        this.B = includeBrandLabelBinding;
        this.C = includeProductMultibuyLabelBinding;
        this.D = textView;
        this.E = productPriceView;
        this.F = textView2;
        this.G = textView3;
        this.H = textView4;
        this.I = textView5;
        this.J = productsBoostView;
    }

    public abstract void L(ProductsBoostViewListener productsBoostViewListener);

    public abstract void M(boolean z);

    public abstract void N(boolean z);

    public abstract void O(ProductCardConfig productCardConfig);

    public abstract void P(ProductCard productCard);
}
