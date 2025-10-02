package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutProductsHeaderBinding extends ViewDataBinding {
    public final TextView A;
    public String B;
    public String C;
    public final TextView y;
    public final LinearLayout z;

    public EpoxyItemCheckoutProductsHeaderBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, LinearLayout linearLayout, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = linearLayout;
        this.A = textView2;
    }
}
