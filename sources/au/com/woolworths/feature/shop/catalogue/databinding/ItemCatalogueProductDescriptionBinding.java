package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.catalogue.productlist.OnMaxLinesToggleListener;
import au.com.woolworths.feature.shop.catalogue.productlist.description.ProductDescriptionItemState;

/* loaded from: classes3.dex */
public abstract class ItemCatalogueProductDescriptionBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public ProductDescriptionItemState A;
    public OnMaxLinesToggleListener B;
    public final TextView y;
    public final Button z;

    public ItemCatalogueProductDescriptionBinding(View view, Button button, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = button;
    }

    public abstract void L(ProductDescriptionItemState productDescriptionItemState);

    public abstract void M(OnMaxLinesToggleListener onMaxLinesToggleListener);
}
