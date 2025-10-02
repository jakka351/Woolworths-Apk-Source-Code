package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeConfirmationLineItem;

/* loaded from: classes4.dex */
public abstract class EpoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBinding extends ViewDataBinding {
    public final TextView A;
    public DeliveryUnlimitedSubscribeConfirmationLineItem B;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemDeliveryUnlimitedSignUpConfirmationLineItemBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = textView2;
    }
}
