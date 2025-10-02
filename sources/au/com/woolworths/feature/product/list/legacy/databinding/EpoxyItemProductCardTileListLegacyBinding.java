package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.databinding.StockIndicatorBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.product.ui.ProductCardButtonsState;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductCardTileListLegacyBinding extends ViewDataBinding {
    public final ProductLocationInfoView A;
    public final Button B;
    public final ImageView C;
    public final Button D;
    public final Button E;
    public final ComposeView F;
    public final StockIndicatorBinding G;
    public final Button H;
    public final Button I;
    public final IncludeTintableTextBinding J;
    public final TextView K;
    public final ImageView L;
    public final IncludeBrandLabelBinding M;
    public final IncludeProductListLegacyMarketplaceDetailsBinding N;
    public final ComposeView O;
    public final IncludeProductMultibuyLabelBinding P;
    public final TextView Q;
    public final ProductPriceView R;
    public final TextView S;
    public final IncludeBrandLabelBinding T;
    public final TextView U;
    public final TextView V;
    public final TextView W;
    public final Button X;
    public final Button Y;
    public ProductClickListener Z;
    public ProductCard a0;
    public ProductCardConfig b0;
    public ProductCardButtonsState c0;
    public boolean d0;
    public boolean e0;
    public final Button y;
    public final FrameLayout z;

    public EpoxyItemProductCardTileListLegacyBinding(DataBindingComponent dataBindingComponent, View view, Button button, FrameLayout frameLayout, ProductLocationInfoView productLocationInfoView, Button button2, ImageView imageView, Button button3, Button button4, ComposeView composeView, StockIndicatorBinding stockIndicatorBinding, Button button5, Button button6, IncludeTintableTextBinding includeTintableTextBinding, TextView textView, ImageView imageView2, IncludeBrandLabelBinding includeBrandLabelBinding, IncludeProductListLegacyMarketplaceDetailsBinding includeProductListLegacyMarketplaceDetailsBinding, ComposeView composeView2, IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding, TextView textView2, ProductPriceView productPriceView, TextView textView3, IncludeBrandLabelBinding includeBrandLabelBinding2, TextView textView4, TextView textView5, TextView textView6, Button button7, Button button8) {
        super(dataBindingComponent, view, 6);
        this.y = button;
        this.z = frameLayout;
        this.A = productLocationInfoView;
        this.B = button2;
        this.C = imageView;
        this.D = button3;
        this.E = button4;
        this.F = composeView;
        this.G = stockIndicatorBinding;
        this.H = button5;
        this.I = button6;
        this.J = includeTintableTextBinding;
        this.K = textView;
        this.L = imageView2;
        this.M = includeBrandLabelBinding;
        this.N = includeProductListLegacyMarketplaceDetailsBinding;
        this.O = composeView2;
        this.P = includeProductMultibuyLabelBinding;
        this.Q = textView2;
        this.R = productPriceView;
        this.S = textView3;
        this.T = includeBrandLabelBinding2;
        this.U = textView4;
        this.V = textView5;
        this.W = textView6;
        this.X = button7;
        this.Y = button8;
    }
}
