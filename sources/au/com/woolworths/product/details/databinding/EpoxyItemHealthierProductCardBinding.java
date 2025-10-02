package au.com.woolworths.product.details.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.models.HealthierOption;

/* loaded from: classes4.dex */
public abstract class EpoxyItemHealthierProductCardBinding extends ViewDataBinding {
    public ProductDetailsClickHandler A;
    public final IncludeHealthierProductCardBinding y;
    public HealthierOption z;

    public EpoxyItemHealthierProductCardBinding(DataBindingComponent dataBindingComponent, View view, IncludeHealthierProductCardBinding includeHealthierProductCardBinding) {
        super(dataBindingComponent, view, 1);
        this.y = includeHealthierProductCardBinding;
    }
}
