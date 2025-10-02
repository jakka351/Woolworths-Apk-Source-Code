package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityProductListOptionsBinding extends ViewDataBinding {
    public final FrameLayout y;
    public ProductListOptionsViewModel z;

    public ActivityProductListOptionsBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout) {
        super(dataBindingComponent, view, 1);
        this.y = frameLayout;
    }
}
