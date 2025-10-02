package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionDetails;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderCollectionDetailsBinding extends ViewDataBinding {
    public final TextView A;
    public OrderCollectionDetails B;
    public OrderDetailsClickHandler C;
    public final TextView y;
    public final TextView z;

    public EpoxyItemOrderCollectionDetailsBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = textView3;
    }
}
