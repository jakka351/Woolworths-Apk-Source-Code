package au.com.woolworths.shop.buyagain.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.databinding.LayoutProductInfoBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorViewModel;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;

/* loaded from: classes4.dex */
public abstract class FragmentBuyAgainQuantitySelectorBinding extends ViewDataBinding {
    public static final /* synthetic */ int F = 0;
    public final Button A;
    public final Button B;
    public HorizontalSelectorViewListener C;
    public ProductCard D;
    public BuyAgainQuantitySelectorViewModel E;
    public final LayoutProductInfoBinding y;
    public final HorizontalSelectorView z;

    public FragmentBuyAgainQuantitySelectorBinding(DataBindingComponent dataBindingComponent, View view, LayoutProductInfoBinding layoutProductInfoBinding, HorizontalSelectorView horizontalSelectorView, Button button, Button button2) {
        super(dataBindingComponent, view, 2);
        this.y = layoutProductInfoBinding;
        this.z = horizontalSelectorView;
        this.A = button;
        this.B = button2;
    }

    public abstract void L(ProductCard productCard);

    public abstract void M(HorizontalSelectorViewListener horizontalSelectorViewListener);

    public abstract void N(BuyAgainQuantitySelectorViewModel buyAgainQuantitySelectorViewModel);
}
