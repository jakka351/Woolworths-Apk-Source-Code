package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.OrderStoreDetails;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderStoreDetailsBinding extends ViewDataBinding {
    public final TextView A;
    public OrderStoreDetails B;
    public OrderDetailsClickHandler C;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemOrderStoreDetailsBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = textView2;
    }
}
