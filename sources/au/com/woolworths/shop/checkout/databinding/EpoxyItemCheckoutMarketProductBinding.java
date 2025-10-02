package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.MarketProductRow;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutMarketProductBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public MarketProductRow E;
    public String F;
    public String G;
    public CheckoutProductListener H;
    public final ImageButton y;
    public final ImageView z;

    public EpoxyItemCheckoutMarketProductBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(dataBindingComponent, view, 0);
        this.y = imageButton;
        this.z = imageView;
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
    }
}
