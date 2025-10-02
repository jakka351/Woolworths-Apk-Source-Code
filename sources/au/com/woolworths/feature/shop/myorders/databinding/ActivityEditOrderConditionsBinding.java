package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class ActivityEditOrderConditionsBinding extends ViewDataBinding {
    public final EpoxyRecyclerView A;
    public final FrameLayout B;
    public final View C;
    public final Toolbar D;
    public EditOrderConditionsViewModel E;
    public final Button y;
    public final StatefulButton z;

    public ActivityEditOrderConditionsBinding(DataBindingComponent dataBindingComponent, View view, Button button, StatefulButton statefulButton, EpoxyRecyclerView epoxyRecyclerView, FrameLayout frameLayout, View view2, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = statefulButton;
        this.A = epoxyRecyclerView;
        this.B = frameLayout;
        this.C = view2;
        this.D = toolbar;
    }

    public abstract void L(EditOrderConditionsViewModel editOrderConditionsViewModel);
}
