package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationErrorState;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class ActivityOrderConfirmationBinding extends ViewDataBinding {
    public final EpoxyRecyclerView A;
    public final Toolbar B;
    public final ComposeView C;
    public Boolean D;
    public String E;
    public OrderConfirmationViewModel F;
    public OrderConfirmationErrorState G;
    public final FrameLayout y;
    public final IncludeGenericErrorStateBinding z;

    public ActivityOrderConfirmationBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, EpoxyRecyclerView epoxyRecyclerView, Toolbar toolbar, ComposeView composeView) {
        super(dataBindingComponent, view, 1);
        this.y = frameLayout;
        this.z = includeGenericErrorStateBinding;
        this.A = epoxyRecyclerView;
        this.B = toolbar;
        this.C = composeView;
    }

    public abstract void L(String str);

    public abstract void M(OrderConfirmationErrorState orderConfirmationErrorState);

    public abstract void N(Boolean bool);

    public abstract void O(OrderConfirmationViewModel orderConfirmationViewModel);
}
