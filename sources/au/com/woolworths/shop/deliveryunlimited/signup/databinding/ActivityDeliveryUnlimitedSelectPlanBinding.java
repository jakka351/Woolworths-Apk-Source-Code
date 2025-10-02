package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlans;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class ActivityDeliveryUnlimitedSelectPlanBinding extends ViewDataBinding {
    public final ConstraintLayout A;
    public final View B;
    public final Toolbar C;
    public final EpoxyItemButtonBinding D;
    public SelectPlanViewModel E;
    public DeliveryUnlimitedSignUpPlans F;
    public ButtonApiData G;
    public final EpoxyRecyclerView y;
    public final TextView z;

    public ActivityDeliveryUnlimitedSelectPlanBinding(DataBindingComponent dataBindingComponent, View view, EpoxyRecyclerView epoxyRecyclerView, TextView textView, ConstraintLayout constraintLayout, View view2, Toolbar toolbar, EpoxyItemButtonBinding epoxyItemButtonBinding) {
        super(dataBindingComponent, view, 1);
        this.y = epoxyRecyclerView;
        this.z = textView;
        this.A = constraintLayout;
        this.B = view2;
        this.C = toolbar;
        this.D = epoxyItemButtonBinding;
    }

    public abstract void L(ButtonApiData buttonApiData);

    public abstract void M(DeliveryUnlimitedSignUpPlans deliveryUnlimitedSignUpPlans);

    public abstract void N(SelectPlanViewModel selectPlanViewModel);
}
