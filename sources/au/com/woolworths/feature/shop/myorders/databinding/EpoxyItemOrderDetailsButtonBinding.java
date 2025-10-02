package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderDetailsButtonBinding extends ViewDataBinding {
    public ButtonClickHandler A;
    public final EpoxyItemButtonBinding y;
    public ButtonApiData z;

    public EpoxyItemOrderDetailsButtonBinding(DataBindingComponent dataBindingComponent, View view, EpoxyItemButtonBinding epoxyItemButtonBinding) {
        super(dataBindingComponent, view, 1);
        this.y = epoxyItemButtonBinding;
    }
}
