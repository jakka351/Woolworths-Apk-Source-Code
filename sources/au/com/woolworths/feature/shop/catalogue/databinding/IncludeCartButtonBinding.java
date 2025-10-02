package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.catalogue.productlist.PrimaryButtonClickListener;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalProductItemState;
import au.com.woolworths.product.databinding.StockIndicatorBinding;
import au.com.woolworths.product.models.ProductCard;

/* loaded from: classes3.dex */
public abstract class IncludeCartButtonBinding extends ViewDataBinding {
    public final Button A;
    public final Button B;
    public final StockIndicatorBinding C;
    public final Button D;
    public final Button E;
    public final Button F;
    public ProductCard G;
    public AdditionalProductItemState.CartButton H;
    public PrimaryButtonClickListener I;
    public final Button y;
    public final FrameLayout z;

    public IncludeCartButtonBinding(DataBindingComponent dataBindingComponent, View view, Button button, FrameLayout frameLayout, Button button2, Button button3, StockIndicatorBinding stockIndicatorBinding, Button button4, Button button5, Button button6) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = frameLayout;
        this.A = button2;
        this.B = button3;
        this.C = stockIndicatorBinding;
        this.D = button4;
        this.E = button5;
        this.F = button6;
    }

    public abstract void L(AdditionalProductItemState.CartButton cartButton);

    public abstract void M(PrimaryButtonClickListener primaryButtonClickListener);

    public abstract void N(ProductCard productCard);
}
