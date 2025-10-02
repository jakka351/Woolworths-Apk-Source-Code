package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpLandingFeature;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSummaryClickListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public DeliveryUnlimitedSignUpLandingFeature C;
    public DeliveryUnlimitedSummaryClickListener D;
    public final TextView y;
    public final ImageView z;

    public EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBinding(View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = textView2;
        this.B = textView3;
    }
}
