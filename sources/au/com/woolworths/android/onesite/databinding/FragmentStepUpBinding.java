package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class FragmentStepUpBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final TextView A;
    public final LinearLayout B;
    public final View C;
    public final Button D;
    public final Button y;
    public final IncludeCheckoutErrorAllRoundedBinding z;

    public FragmentStepUpBinding(DataBindingComponent dataBindingComponent, View view, Button button, IncludeCheckoutErrorAllRoundedBinding includeCheckoutErrorAllRoundedBinding, TextView textView, LinearLayout linearLayout, View view2, Button button2) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = includeCheckoutErrorAllRoundedBinding;
        this.A = textView;
        this.B = linearLayout;
        this.C = view2;
        this.D = button2;
    }
}
