package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueHeroProductImageLoadListener;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.HeroProductItemState;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.tile.ProductPriceView;

/* loaded from: classes3.dex */
public abstract class ItemCatalogueHeroProductDetailsBinding extends ViewDataBinding {
    public static final /* synthetic */ int O = 0;
    public final ComposeView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final ProductPriceView H;
    public final TextView I;
    public final TextView J;
    public final ProgressBar K;
    public HeroProductItemState L;
    public CatalogueProductListViewModel M;
    public CatalogueHeroProductImageLoadListener N;
    public final FrameLayout y;
    public final ProductLocationInfoView z;

    public ItemCatalogueHeroProductDetailsBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, ProductLocationInfoView productLocationInfoView, ComposeView composeView, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ProductPriceView productPriceView, TextView textView6, TextView textView7, ProgressBar progressBar) {
        super(dataBindingComponent, view, 0);
        this.y = frameLayout;
        this.z = productLocationInfoView;
        this.A = composeView;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
        this.H = productPriceView;
        this.I = textView6;
        this.J = textView7;
        this.K = progressBar;
    }

    public abstract void L(CatalogueHeroProductImageLoadListener catalogueHeroProductImageLoadListener);

    public abstract void M(HeroProductItemState heroProductItemState);

    public abstract void N(CatalogueProductListViewModel catalogueProductListViewModel);
}
