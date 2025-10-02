package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerGroup;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutMarketSellerGroupBinding extends ViewDataBinding {
    public final TextView A;
    public MarketSellerGroup B;
    public final ConstraintLayout y;
    public final TextView z;

    public EpoxyItemCheckoutMarketSellerGroupBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = textView;
        this.A = textView2;
    }
}
