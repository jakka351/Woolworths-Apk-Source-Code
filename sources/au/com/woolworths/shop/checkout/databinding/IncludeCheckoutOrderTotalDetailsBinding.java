package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInlineMessageBinding;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.ui.listener.OrderTotalDetailsListener;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class IncludeCheckoutOrderTotalDetailsBinding extends ViewDataBinding {
    public final IncludeInlineMessageBinding A;
    public final LinearLayout B;
    public final ConstraintLayout C;
    public final View D;
    public final TextView E;
    public final EpoxyRecyclerView F;
    public final TextView G;
    public CheckoutOrderTotalDetails H;
    public InlineMessage I;
    public Boolean J;
    public OrderTotalDetailsListener K;
    public final IncludeHorizontalDividerBinding y;
    public final ImageButton z;

    public IncludeCheckoutOrderTotalDetailsBinding(DataBindingComponent dataBindingComponent, View view, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, ImageButton imageButton, IncludeInlineMessageBinding includeInlineMessageBinding, LinearLayout linearLayout, ConstraintLayout constraintLayout, View view2, TextView textView, EpoxyRecyclerView epoxyRecyclerView, TextView textView2) {
        super(dataBindingComponent, view, 2);
        this.y = includeHorizontalDividerBinding;
        this.z = imageButton;
        this.A = includeInlineMessageBinding;
        this.B = linearLayout;
        this.C = constraintLayout;
        this.D = view2;
        this.E = textView;
        this.F = epoxyRecyclerView;
        this.G = textView2;
    }

    public abstract void L(InlineMessage inlineMessage);

    public abstract void M(Boolean bool);

    public abstract void N(OrderTotalDetailsListener orderTotalDetailsListener);

    public abstract void O(CheckoutOrderTotalDetails checkoutOrderTotalDetails);
}
