package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentCheckoutPayServicesErrorBinding extends ViewDataBinding {
    public PayServicesErrorViewModel A;
    public final IncludeGenericErrorStateBinding y;
    public final View z;

    public FragmentCheckoutPayServicesErrorBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, View view2) {
        super(dataBindingComponent, view, 2);
        this.y = includeGenericErrorStateBinding;
        this.z = view2;
    }

    public abstract void L(PayServicesErrorViewModel payServicesErrorViewModel);
}
