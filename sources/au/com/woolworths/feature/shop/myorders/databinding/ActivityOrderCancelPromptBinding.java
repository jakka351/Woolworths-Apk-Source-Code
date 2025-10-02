package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptViewModel;
import au.com.woolworths.views.unlockslider.UnlockSlider;

/* loaded from: classes3.dex */
public abstract class ActivityOrderCancelPromptBinding extends ViewDataBinding {
    public final TextView A;
    public final IncludeGenericErrorStateBinding B;
    public final FrameLayout C;
    public final TextView D;
    public final TextView E;
    public final Toolbar F;
    public Integer G;
    public OrderCancellationPromptViewModel H;
    public final UnlockSlider y;
    public final ConstraintLayout z;

    public ActivityOrderCancelPromptBinding(DataBindingComponent dataBindingComponent, View view, UnlockSlider unlockSlider, ConstraintLayout constraintLayout, TextView textView, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, FrameLayout frameLayout, TextView textView2, TextView textView3, Toolbar toolbar) {
        super(dataBindingComponent, view, 2);
        this.y = unlockSlider;
        this.z = constraintLayout;
        this.A = textView;
        this.B = includeGenericErrorStateBinding;
        this.C = frameLayout;
        this.D = textView2;
        this.E = textView3;
        this.F = toolbar;
    }

    public abstract void L(Integer num);

    public abstract void M(OrderCancellationPromptViewModel orderCancellationPromptViewModel);
}
