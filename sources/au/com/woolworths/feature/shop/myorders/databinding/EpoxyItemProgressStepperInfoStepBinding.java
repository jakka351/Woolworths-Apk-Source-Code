package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.models.ToolTipStepInfo;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProgressStepperInfoStepBinding extends ViewDataBinding {
    public final TextView A;
    public ToolTipStepInfo B;
    public final TextView y;
    public final TextView z;

    public EpoxyItemProgressStepperInfoStepBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = textView2;
        this.A = textView3;
    }
}
