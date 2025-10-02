package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentListener;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class FragmentCheckoutContentBinding extends ViewDataBinding {
    public static final /* synthetic */ int M = 0;
    public final CoordinatorLayout A;
    public final IncludeGenericErrorStateBinding B;
    public final IncludeCheckoutOrderTotalDetailsBinding C;
    public final EpoxyRecyclerView D;
    public final View E;
    public Boolean F;
    public CheckoutOrderTotalDetails G;
    public InlineMessage H;
    public Boolean I;
    public Boolean J;
    public CheckoutContentListener K;
    public FullPageErrorCause L;
    public final ComposeView y;
    public final ComposeView z;

    public FragmentCheckoutContentBinding(DataBindingComponent dataBindingComponent, View view, ComposeView composeView, ComposeView composeView2, CoordinatorLayout coordinatorLayout, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, IncludeCheckoutOrderTotalDetailsBinding includeCheckoutOrderTotalDetailsBinding, EpoxyRecyclerView epoxyRecyclerView, View view2) {
        super(dataBindingComponent, view, 2);
        this.y = composeView;
        this.z = composeView2;
        this.A = coordinatorLayout;
        this.B = includeGenericErrorStateBinding;
        this.C = includeCheckoutOrderTotalDetailsBinding;
        this.D = epoxyRecyclerView;
        this.E = view2;
    }

    public abstract void L(FullPageErrorCause fullPageErrorCause);

    public abstract void M(InlineMessage inlineMessage);

    public abstract void N(Boolean bool);

    public abstract void O(Boolean bool);

    public abstract void P(Boolean bool);

    public abstract void Q(CheckoutContentListener checkoutContentListener);

    public abstract void R(CheckoutOrderTotalDetails checkoutOrderTotalDetails);
}
