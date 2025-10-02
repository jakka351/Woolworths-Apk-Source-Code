package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding extends ViewDataBinding {
    public final View A;
    public final Button B;
    public final Toolbar C;
    public ConfirmationViewModel D;
    public final EpoxyRecyclerView y;
    public final FrameLayout z;

    public ActivityDeliveryUnlimitedSignUpSubscriptionConfirmationBinding(DataBindingComponent dataBindingComponent, View view, EpoxyRecyclerView epoxyRecyclerView, FrameLayout frameLayout, View view2, Button button, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = epoxyRecyclerView;
        this.z = frameLayout;
        this.A = view2;
        this.B = button;
        this.C = toolbar;
    }

    public abstract void L(ConfirmationViewModel confirmationViewModel);
}
