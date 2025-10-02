package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class IncludeCheckoutExpiredErrorBinding extends ViewDataBinding {
    public final TextView y;
    public final LinearLayout z;

    public IncludeCheckoutExpiredErrorBinding(View view, LinearLayout linearLayout, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = linearLayout;
    }
}
