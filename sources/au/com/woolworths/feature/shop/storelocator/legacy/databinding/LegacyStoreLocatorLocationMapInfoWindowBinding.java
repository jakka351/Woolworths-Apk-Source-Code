package au.com.woolworths.feature.shop.storelocator.legacy.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;

/* loaded from: classes3.dex */
public abstract class LegacyStoreLocatorLocationMapInfoWindowBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final TextView A;
    public Store B;
    public final TextView y;
    public final ImageView z;

    public LegacyStoreLocatorLocationMapInfoWindowBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = textView2;
    }

    public abstract void L(Store store);
}
