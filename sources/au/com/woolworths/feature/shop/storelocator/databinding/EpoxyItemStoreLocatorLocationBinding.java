package au.com.woolworths.feature.shop.storelocator.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;

/* loaded from: classes3.dex */
public abstract class EpoxyItemStoreLocatorLocationBinding extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public Store D;
    public final TextView y;
    public final TextView z;

    public EpoxyItemStoreLocatorLocationBinding(View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = imageView;
        this.B = textView3;
        this.C = textView4;
    }
}
