package au.com.woolworths.product.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductMultiBuyLabelStyle;

/* loaded from: classes4.dex */
public abstract class IncludeProductMultibuyLabelBinding extends ViewDataBinding {
    public ProductCard A;
    public ProductMultiBuyLabelStyle B;
    public Boolean C;
    public final TextView y;
    public final TextView z;

    public IncludeProductMultibuyLabelBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
    }

    public abstract void L(ProductMultiBuyLabelStyle productMultiBuyLabelStyle);

    public abstract void M(ProductCard productCard);

    public abstract void N(Boolean bool);
}
