package au.com.woolworths.shop.buyagain.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.offers.ProductsBoostView;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainProductItemListenerLegacy;

/* loaded from: classes4.dex */
public abstract class EpoxyItemBuyAgainProductBinding extends ViewDataBinding {
    public final ImageView A;
    public final CheckBox B;
    public final ImageView C;
    public final IncludeBrandLabelBinding D;
    public final ComposeView E;
    public final IncludeProductMultibuyLabelBinding F;
    public final TextView G;
    public final ProductPriceView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final Button L;
    public final ProductsBoostView M;
    public ProductCard N;
    public BuyAgainProductItemListenerLegacy O;
    public Float P;
    public boolean Q;
    public boolean R;
    public final FrameLayout y;
    public final ProductLocationInfoView z;

    public EpoxyItemBuyAgainProductBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, ProductLocationInfoView productLocationInfoView, ImageView imageView, CheckBox checkBox, ImageView imageView2, IncludeBrandLabelBinding includeBrandLabelBinding, ComposeView composeView, IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding, TextView textView, ProductPriceView productPriceView, TextView textView2, TextView textView3, TextView textView4, Button button, ProductsBoostView productsBoostView) {
        super(dataBindingComponent, view, 2);
        this.y = frameLayout;
        this.z = productLocationInfoView;
        this.A = imageView;
        this.B = checkBox;
        this.C = imageView2;
        this.D = includeBrandLabelBinding;
        this.E = composeView;
        this.F = includeProductMultibuyLabelBinding;
        this.G = textView;
        this.H = productPriceView;
        this.I = textView2;
        this.J = textView3;
        this.K = textView4;
        this.L = button;
        this.M = productsBoostView;
    }
}
