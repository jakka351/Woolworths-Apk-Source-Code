package au.com.woolworths.feature.product.list.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.shop.lists.databinding.IncludeBoostAllBannerBinding;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public abstract class FragmentProductListBinding extends ViewDataBinding {
    public final ComposeView A;
    public final IncludeGenericErrorStateBinding B;
    public final LinearLayout C;
    public final ComposeView D;
    public final IncludeProductListHeaderBinding E;
    public final ComposeView F;
    public final ComposeView G;
    public ProductListViewModel H;
    public final AppBarLayout y;
    public final IncludeBoostAllBannerBinding z;

    public FragmentProductListBinding(DataBindingComponent dataBindingComponent, View view, AppBarLayout appBarLayout, IncludeBoostAllBannerBinding includeBoostAllBannerBinding, ComposeView composeView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, LinearLayout linearLayout, ComposeView composeView2, IncludeProductListHeaderBinding includeProductListHeaderBinding, ComposeView composeView3, ComposeView composeView4) {
        super(dataBindingComponent, view, 4);
        this.y = appBarLayout;
        this.z = includeBoostAllBannerBinding;
        this.A = composeView;
        this.B = includeGenericErrorStateBinding;
        this.C = linearLayout;
        this.D = composeView2;
        this.E = includeProductListHeaderBinding;
        this.F = composeView3;
        this.G = composeView4;
    }

    public abstract void L(ProductListViewModel productListViewModel);
}
