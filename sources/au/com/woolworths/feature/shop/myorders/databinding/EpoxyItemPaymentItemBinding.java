package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemPaymentItemBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public OrderPaymentDetailsItemData C;
    public int D;
    public int E;
    public final TextView y;
    public final ImageView z;

    public EpoxyItemPaymentItemBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = imageView2;
        this.B = textView2;
    }
}
