package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchResultClickListener;
import au.com.woolworths.base.shopapp.models.address.AddressResult;

/* loaded from: classes3.dex */
public abstract class EpoxyItemDeliveryAddressSearchResultBinding extends ViewDataBinding {
    public DeliveryAddressSearchResultClickListener A;
    public final TextView y;
    public AddressResult.Address z;

    public EpoxyItemDeliveryAddressSearchResultBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
