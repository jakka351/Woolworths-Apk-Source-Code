package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel;
import au.com.woolworths.feature.shop.myorders.orders.models.OrderCompactUiModel;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrdersCompactBinding extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public OrderCompactUiModel F;
    public OrdersListViewModel G;
    public final IncludeHorizontalDividerBinding y;
    public final TextView z;

    public EpoxyItemOrdersCompactBinding(DataBindingComponent dataBindingComponent, View view, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, TextView textView4) {
        super(dataBindingComponent, view, 1);
        this.y = includeHorizontalDividerBinding;
        this.z = textView;
        this.A = imageView;
        this.B = imageView2;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
    }
}
