package au.com.woolworths.feature.shop.storelocator.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;

/* loaded from: classes3.dex */
public abstract class EpoxyItemStoreLocatorSuburbBinding extends ViewDataBinding {
    public PickUpSuburb A;
    public String B;
    public final TextView y;
    public final TextView z;

    public EpoxyItemStoreLocatorSuburbBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
    }
}
