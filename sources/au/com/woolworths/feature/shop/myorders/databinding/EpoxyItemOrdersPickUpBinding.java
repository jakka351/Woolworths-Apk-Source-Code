package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.orders.OrdersClickListener;
import au.com.woolworths.feature.shop.myorders.orders.data.PickUpOrder;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrdersPickUpBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;
    public PickUpOrder G;
    public OrdersClickListener H;
    public final TextView y;
    public final TextView z;

    public EpoxyItemOrdersPickUpBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, TextView textView6, TextView textView7) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = textView3;
        this.B = textView4;
        this.C = textView5;
        this.D = imageView;
        this.E = textView6;
        this.F = textView7;
    }
}
