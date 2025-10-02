package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListTryAgain;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrdersPaginationTryAgainBinding extends ViewDataBinding {
    public OrdersListViewModel A;
    public final Button y;
    public OrderListTryAgain z;

    public EpoxyItemOrdersPaginationTryAgainBinding(DataBindingComponent dataBindingComponent, View view, Button button) {
        super(dataBindingComponent, view, 0);
        this.y = button;
    }
}
