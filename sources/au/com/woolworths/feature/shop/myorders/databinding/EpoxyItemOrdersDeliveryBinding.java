package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.orders.OrdersClickListener;
import au.com.woolworths.feature.shop.myorders.orders.data.DeliveryOrder;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrdersDeliveryBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final ImageView G;
    public final TextView H;
    public DeliveryOrder I;
    public OrdersClickListener J;
    public final TextView y;
    public final TextView z;

    public EpoxyItemOrdersDeliveryBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ImageView imageView, TextView textView9) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = textView3;
        this.B = textView4;
        this.C = textView5;
        this.D = textView6;
        this.E = textView7;
        this.F = textView8;
        this.G = imageView;
        this.H = textView9;
    }
}
