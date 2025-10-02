package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepper;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.progressstepper.ProgressStepperContainer;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class LayoutOrderProgressBinding extends ViewDataBinding {
    public final ProgressStepperContainer A;
    public ProgressStepper B;
    public Function1 C;
    public StepsToolTip D;
    public final TextView y;
    public final ImageView z;

    public LayoutOrderProgressBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, ImageView imageView, ProgressStepperContainer progressStepperContainer) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = progressStepperContainer;
    }

    public abstract void L(Function1 function1);

    public abstract void M(ProgressStepper progressStepper);

    public abstract void N(StepsToolTip stepsToolTip);
}
