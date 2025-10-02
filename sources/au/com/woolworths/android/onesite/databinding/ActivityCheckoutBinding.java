package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.databinding.IncludeCheckoutAppBarBinding;

/* loaded from: classes3.dex */
public abstract class ActivityCheckoutBinding extends ViewDataBinding {
    public final View A;
    public Boolean B;
    public final IncludeCheckoutAppBarBinding y;
    public final CoordinatorLayout z;

    public ActivityCheckoutBinding(DataBindingComponent dataBindingComponent, View view, IncludeCheckoutAppBarBinding includeCheckoutAppBarBinding, CoordinatorLayout coordinatorLayout, View view2) {
        super(dataBindingComponent, view, 1);
        this.y = includeCheckoutAppBarBinding;
        this.z = coordinatorLayout;
        this.A = view2;
    }

    public abstract void L(Boolean bool);
}
