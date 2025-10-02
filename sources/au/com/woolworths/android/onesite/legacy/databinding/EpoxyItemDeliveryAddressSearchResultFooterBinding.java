package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchResultClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemDeliveryAddressSearchResultFooterBinding extends ViewDataBinding {
    public final Button y;
    public DeliveryAddressSearchResultClickListener z;

    public EpoxyItemDeliveryAddressSearchResultFooterBinding(DataBindingComponent dataBindingComponent, View view, Button button) {
        super(dataBindingComponent, view, 0);
        this.y = button;
    }
}
