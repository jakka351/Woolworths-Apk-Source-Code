package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsItemData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderDetailsItemBinding extends ViewDataBinding {
    public OrderDetailsItemData A;
    public final TextView y;
    public final TextView z;

    public EpoxyItemOrderDetailsItemBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
    }
}
