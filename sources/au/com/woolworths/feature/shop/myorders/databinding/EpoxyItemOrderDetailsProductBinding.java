package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsProductCardData;
import au.com.woolworths.feature.shop.myorders.details.models.ui.OrderDetailsProductClickHandler;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderDetailsProductBinding extends ViewDataBinding {
    public OrderDetailsProductClickHandler A;
    public final ImageView y;
    public OrderDetailsProductCardData z;

    public EpoxyItemOrderDetailsProductBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
    }
}
