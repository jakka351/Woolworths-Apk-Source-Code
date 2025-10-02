package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class ItemAddedGiftCardBinding extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final View C;
    public final LinearLayout D;
    public final IncludeCheckoutErrorNoRoundedBinding E;
    public final EditText F;
    public final TextView G;
    public final AppCompatCheckBox H;
    public final TextView y;
    public final TextView z;

    public ItemAddedGiftCardBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, View view2, LinearLayout linearLayout, IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding, EditText editText, TextView textView4, AppCompatCheckBox appCompatCheckBox) {
        super(dataBindingComponent, view, 1);
        this.y = textView;
        this.z = textView2;
        this.A = constraintLayout;
        this.B = textView3;
        this.C = view2;
        this.D = linearLayout;
        this.E = includeCheckoutErrorNoRoundedBinding;
        this.F = editText;
        this.G = textView4;
        this.H = appCompatCheckBox;
    }
}
