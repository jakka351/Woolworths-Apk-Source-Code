package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelNzBinding;
import au.com.woolworths.product.databinding.StockIndicatorBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.product.ui.ProductCardButtonsState;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductCardTileGridLegacyBinding extends ViewDataBinding {
    public final ProductLocationInfoView A;
    public final Button B;
    public final Button C;
    public final Button D;
    public final StockIndicatorBinding E;
    public final Button F;
    public final Button G;
    public final TextView H;
    public final TextView I;
    public final IncludeTintableTextBinding J;
    public final TextView K;
    public final ComposeView L;
    public final IncludeBrandLabelBinding M;
    public final IncludeProductListLegacyMarketplaceDetailsBinding N;
    public final ComposeView O;
    public final IncludeProductMultibuyLabelBinding P;
    public final IncludeProductMultibuyLabelNzBinding Q;
    public final TextView R;
    public final ProductPriceView S;
    public final TextView T;
    public final IncludeBrandLabelBinding U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final Button Y;
    public final Button Z;
    public String a0;
    public ProductClickListener b0;
    public ProductCard c0;
    public ProductCardConfig d0;
    public ProductCardButtonsState e0;
    public boolean f0;
    public ProductListViewModel g0;
    public final Button y;
    public final FrameLayout z;

    public EpoxyItemProductCardTileGridLegacyBinding(DataBindingComponent dataBindingComponent, View view, Button button, FrameLayout frameLayout, ProductLocationInfoView productLocationInfoView, Button button2, Button button3, Button button4, StockIndicatorBinding stockIndicatorBinding, Button button5, Button button6, TextView textView, TextView textView2, IncludeTintableTextBinding includeTintableTextBinding, TextView textView3, ComposeView composeView, IncludeBrandLabelBinding includeBrandLabelBinding, IncludeProductListLegacyMarketplaceDetailsBinding includeProductListLegacyMarketplaceDetailsBinding, ComposeView composeView2, IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding, IncludeProductMultibuyLabelNzBinding includeProductMultibuyLabelNzBinding, TextView textView4, ProductPriceView productPriceView, TextView textView5, IncludeBrandLabelBinding includeBrandLabelBinding2, TextView textView6, TextView textView7, TextView textView8, Button button7, Button button8) {
        super(dataBindingComponent, view, 7);
        this.y = button;
        this.z = frameLayout;
        this.A = productLocationInfoView;
        this.B = button2;
        this.C = button3;
        this.D = button4;
        this.E = stockIndicatorBinding;
        this.F = button5;
        this.G = button6;
        this.H = textView;
        this.I = textView2;
        this.J = includeTintableTextBinding;
        this.K = textView3;
        this.L = composeView;
        this.M = includeBrandLabelBinding;
        this.N = includeProductListLegacyMarketplaceDetailsBinding;
        this.O = composeView2;
        this.P = includeProductMultibuyLabelBinding;
        this.Q = includeProductMultibuyLabelNzBinding;
        this.R = textView4;
        this.S = productPriceView;
        this.T = textView5;
        this.U = includeBrandLabelBinding2;
        this.V = textView6;
        this.W = textView7;
        this.X = textView8;
        this.Y = button7;
        this.Z = button8;
    }

    public abstract void L(String str);

    public abstract void M(ProductCard productCard);

    public abstract void N(ProductClickListener productClickListener);

    public abstract void O(ProductCardButtonsState productCardButtonsState);

    public abstract void P(ProductCardConfig productCardConfig);
}
