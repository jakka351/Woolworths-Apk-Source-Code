package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutProductBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public CheckoutProduct H;
    public CheckoutProductListener I;
    public final ImageButton y;
    public final ImageView z;

    public EpoxyItemCheckoutProductBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton, ImageView imageView, ImageView imageView2, TextView textView, ImageView imageView3, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(dataBindingComponent, view, 0);
        this.y = imageButton;
        this.z = imageView;
        this.A = imageView2;
        this.B = textView;
        this.C = imageView3;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
    }
}
