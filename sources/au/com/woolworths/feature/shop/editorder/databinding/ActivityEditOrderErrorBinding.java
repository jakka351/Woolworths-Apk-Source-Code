package au.com.woolworths.feature.shop.editorder.databinding;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityEditOrderErrorBinding extends ViewDataBinding {
    public final Toolbar A;
    public Activities.EditOrderErrorActivity.Extras B;
    public EditOrderErrorViewModel C;
    public final IncludeGenericErrorStateBinding y;
    public final Button z;

    public ActivityEditOrderErrorBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, Button button, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = includeGenericErrorStateBinding;
        this.z = button;
        this.A = toolbar;
    }

    public abstract void L(Activities.EditOrderErrorActivity.Extras extras);

    public abstract void M(EditOrderErrorViewModel editOrderErrorViewModel);
}
