package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.feature.shop.myorders.orders.OrdersViewModel;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public abstract class ActivityOrdersBinding extends ViewDataBinding {
    public final Toolbar A;
    public OrdersViewModel B;
    public final ViewPager2 y;
    public final TabLayout z;

    public ActivityOrdersBinding(DataBindingComponent dataBindingComponent, View view, ViewPager2 viewPager2, TabLayout tabLayout, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = viewPager2;
        this.z = tabLayout;
        this.A = toolbar;
    }

    public abstract void L(OrdersViewModel ordersViewModel);
}
