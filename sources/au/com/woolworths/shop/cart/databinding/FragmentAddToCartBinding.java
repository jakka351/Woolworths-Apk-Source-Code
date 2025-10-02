package au.com.woolworths.shop.cart.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.product.addtocart.AddToCartViewModel;
import au.com.woolworths.product.databinding.LayoutProductInfoBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;

/* loaded from: classes4.dex */
public abstract class FragmentAddToCartBinding extends ViewDataBinding {
    public static final /* synthetic */ int I = 0;
    public final HorizontalSelectorView A;
    public final FrameLayout B;
    public final ComposeView C;
    public final StatefulButton D;
    public final StatefulButton E;
    public AddToCartViewModel F;
    public ProductCardConfig G;
    public ProductCard H;
    public final StatefulButton y;
    public final LayoutProductInfoBinding z;

    public FragmentAddToCartBinding(DataBindingComponent dataBindingComponent, View view, StatefulButton statefulButton, LayoutProductInfoBinding layoutProductInfoBinding, HorizontalSelectorView horizontalSelectorView, FrameLayout frameLayout, ComposeView composeView, StatefulButton statefulButton2, StatefulButton statefulButton3) {
        super(dataBindingComponent, view, 2);
        this.y = statefulButton;
        this.z = layoutProductInfoBinding;
        this.A = horizontalSelectorView;
        this.B = frameLayout;
        this.C = composeView;
        this.D = statefulButton2;
        this.E = statefulButton3;
    }

    public abstract void L(ProductCardConfig productCardConfig);

    public abstract void M(ProductCard productCard);

    public abstract void N(AddToCartViewModel addToCartViewModel);
}
