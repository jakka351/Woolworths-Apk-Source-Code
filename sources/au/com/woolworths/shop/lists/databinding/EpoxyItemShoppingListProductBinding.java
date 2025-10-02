package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.offers.ProductsBoostView;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes4.dex */
public abstract class EpoxyItemShoppingListProductBinding extends ViewDataBinding {
    public final CheckBox A;
    public final View B;
    public final EpoxyItemShoppingListProductButtonsUpliftBinding C;
    public final ImageButton D;
    public final LottieAnimationView E;
    public final TextView F;
    public final ImageView G;
    public final IncludeBrandLabelBinding H;
    public final ItemProductListMarketplaceDetailsBinding I;
    public final ComposeView J;
    public final IncludeProductMultibuyLabelBinding K;
    public final TextView L;
    public final ProductPriceView M;
    public final TextView N;
    public final TextView O;
    public final ProductsBoostView P;
    public ProductItemUiModel Q;
    public ShoppingListItemListener R;
    public ShoppingListProductItemState S;
    public Boolean T;
    public boolean U;
    public boolean V;
    public final ProductLocationInfoView y;
    public final ImageView z;

    public EpoxyItemShoppingListProductBinding(DataBindingComponent dataBindingComponent, View view, ProductLocationInfoView productLocationInfoView, ImageView imageView, CheckBox checkBox, View view2, EpoxyItemShoppingListProductButtonsUpliftBinding epoxyItemShoppingListProductButtonsUpliftBinding, ImageButton imageButton, LottieAnimationView lottieAnimationView, TextView textView, ImageView imageView2, IncludeBrandLabelBinding includeBrandLabelBinding, ItemProductListMarketplaceDetailsBinding itemProductListMarketplaceDetailsBinding, ComposeView composeView, IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding, TextView textView2, ProductPriceView productPriceView, TextView textView3, TextView textView4, ProductsBoostView productsBoostView) {
        super(dataBindingComponent, view, 4);
        this.y = productLocationInfoView;
        this.z = imageView;
        this.A = checkBox;
        this.B = view2;
        this.C = epoxyItemShoppingListProductButtonsUpliftBinding;
        this.D = imageButton;
        this.E = lottieAnimationView;
        this.F = textView;
        this.G = imageView2;
        this.H = includeBrandLabelBinding;
        this.I = itemProductListMarketplaceDetailsBinding;
        this.J = composeView;
        this.K = includeProductMultibuyLabelBinding;
        this.L = textView2;
        this.M = productPriceView;
        this.N = textView3;
        this.O = textView4;
        this.P = productsBoostView;
    }
}
