package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.CheckoutSectionHeader;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutSectionHeaderBinding extends ViewDataBinding {
    public final ImageView y;
    public CheckoutSectionHeader z;

    public EpoxyItemCheckoutSectionHeaderBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
    }
}
