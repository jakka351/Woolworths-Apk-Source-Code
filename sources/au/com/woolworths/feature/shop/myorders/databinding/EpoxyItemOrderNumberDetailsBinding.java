package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.OrderNumberDetails;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderNumberDetailsBinding extends ViewDataBinding {
    public final TextView A;
    public OrderNumberDetails B;
    public OrderDetailsClickHandler C;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemOrderNumberDetailsBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = textView2;
    }
}
