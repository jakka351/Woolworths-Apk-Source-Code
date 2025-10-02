package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class IncludePaymentDeductionBinding extends ViewDataBinding {
    public final LinearLayout y;
    public final TextView z;

    public IncludePaymentDeductionBinding(View view, LinearLayout linearLayout, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = linearLayout;
        this.z = textView;
    }
}
