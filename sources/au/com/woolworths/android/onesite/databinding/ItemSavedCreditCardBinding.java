package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class ItemSavedCreditCardBinding extends ViewDataBinding {
    public final IncludePaymentDeductionBinding A;
    public final LinearLayout B;
    public final View C;
    public final ImageView D;
    public final TextView E;
    public final LinearLayout F;
    public final TextView G;
    public final ImageView H;
    public final LinearLayout I;
    public final TextView J;
    public final View K;
    public final IncludeCheckoutErrorNoRoundedBinding y;
    public final TextView z;

    public ItemSavedCreditCardBinding(DataBindingComponent dataBindingComponent, View view, IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding, TextView textView, IncludePaymentDeductionBinding includePaymentDeductionBinding, LinearLayout linearLayout, View view2, ImageView imageView, TextView textView2, LinearLayout linearLayout2, TextView textView3, ImageView imageView2, LinearLayout linearLayout3, TextView textView4, View view3) {
        super(dataBindingComponent, view, 2);
        this.y = includeCheckoutErrorNoRoundedBinding;
        this.z = textView;
        this.A = includePaymentDeductionBinding;
        this.B = linearLayout;
        this.C = view2;
        this.D = imageView;
        this.E = textView2;
        this.F = linearLayout2;
        this.G = textView3;
        this.H = imageView2;
        this.I = linearLayout3;
        this.J = textView4;
        this.K = view3;
    }
}
