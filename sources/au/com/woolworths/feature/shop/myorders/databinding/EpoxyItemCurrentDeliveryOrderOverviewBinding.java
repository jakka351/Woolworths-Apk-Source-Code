package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentDeliveryOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.progressstepper.ProgressStepperContainer;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class EpoxyItemCurrentDeliveryOrderOverviewBinding extends ViewDataBinding {
    public final EpoxyItemButtonBinding A;
    public final ImageView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final ProgressStepperContainer F;
    public CurrentDeliveryOrderOverview G;
    public ButtonClickHandler H;
    public Function1 I;
    public final EpoxyItemButtonBinding y;
    public final TextView z;

    public EpoxyItemCurrentDeliveryOrderOverviewBinding(DataBindingComponent dataBindingComponent, View view, EpoxyItemButtonBinding epoxyItemButtonBinding, TextView textView, EpoxyItemButtonBinding epoxyItemButtonBinding2, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, ProgressStepperContainer progressStepperContainer) {
        super(dataBindingComponent, view, 2);
        this.y = epoxyItemButtonBinding;
        this.z = textView;
        this.A = epoxyItemButtonBinding2;
        this.B = imageView;
        this.C = imageView2;
        this.D = textView2;
        this.E = textView3;
        this.F = progressStepperContainer;
    }
}
