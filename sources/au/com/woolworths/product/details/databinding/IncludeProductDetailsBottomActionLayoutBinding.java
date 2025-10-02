package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.product.databinding.StockIndicatorBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductCardButtonType;

/* loaded from: classes4.dex */
public abstract class IncludeProductDetailsBottomActionLayoutBinding extends ViewDataBinding {
    public final Button A;
    public final Button B;
    public final StockIndicatorBinding C;
    public final Button D;
    public final Button E;
    public final FrameLayout F;
    public final Button G;
    public final Button H;
    public ProductCard I;
    public ProductDetailsClickHandler J;
    public CollectionMode K;
    public ProductCardButtonType L;
    public final ConstraintLayout y;
    public final Button z;

    public IncludeProductDetailsBottomActionLayoutBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, Button button, Button button2, Button button3, StockIndicatorBinding stockIndicatorBinding, Button button4, Button button5, FrameLayout frameLayout, Button button6, Button button7) {
        super(dataBindingComponent, view, 1);
        this.y = constraintLayout;
        this.z = button;
        this.A = button2;
        this.B = button3;
        this.C = stockIndicatorBinding;
        this.D = button4;
        this.E = button5;
        this.F = frameLayout;
        this.G = button6;
        this.H = button7;
    }

    public abstract void L(ProductDetailsClickHandler productDetailsClickHandler);

    public abstract void M(CollectionMode collectionMode);

    public abstract void N(ProductCard productCard);

    public abstract void O(ProductCardButtonType productCardButtonType);
}
