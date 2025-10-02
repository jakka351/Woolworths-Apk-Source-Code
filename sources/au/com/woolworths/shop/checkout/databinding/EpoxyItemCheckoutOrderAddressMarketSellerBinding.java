package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerInfo;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutOrderAddressMarketSellerBinding extends ViewDataBinding {
    public MarketSellerInfo A;
    public final TextView y;
    public final TextView z;

    public EpoxyItemCheckoutOrderAddressMarketSellerBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
    }
}
