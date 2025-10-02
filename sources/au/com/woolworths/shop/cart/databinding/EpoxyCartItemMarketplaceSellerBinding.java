package au.com.woolworths.shop.cart.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.shop.cart.data.model.MarketplaceSeller;

/* loaded from: classes4.dex */
public abstract class EpoxyCartItemMarketplaceSellerBinding extends ViewDataBinding {
    public final TextView A;
    public MarketplaceSeller B;
    public final ConstraintLayout y;
    public final TextView z;

    public EpoxyCartItemMarketplaceSellerBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = textView;
        this.A = textView2;
    }
}
