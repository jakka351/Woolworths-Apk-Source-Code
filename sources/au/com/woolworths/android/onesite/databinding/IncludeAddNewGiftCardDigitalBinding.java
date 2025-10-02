package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class IncludeAddNewGiftCardDigitalBinding extends ViewDataBinding {
    public final IncludeCheckoutWarningBinding A;
    public final LinearLayout B;
    public final LinearLayout C;
    public final RecyclerView D;
    public final EditText E;
    public final EditText F;
    public final TextView G;
    public final TextView H;
    public final LinearLayout I;
    public final TextView J;
    public final EditText K;
    public final AppCompatCheckBox L;
    public final IncludeCheckoutErrorNoRoundedBinding y;
    public final ImageView z;

    public IncludeAddNewGiftCardDigitalBinding(DataBindingComponent dataBindingComponent, View view, IncludeCheckoutErrorNoRoundedBinding includeCheckoutErrorNoRoundedBinding, ImageView imageView, IncludeCheckoutWarningBinding includeCheckoutWarningBinding, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, EditText editText, EditText editText2, TextView textView, TextView textView2, LinearLayout linearLayout3, TextView textView3, EditText editText3, AppCompatCheckBox appCompatCheckBox) {
        super(dataBindingComponent, view, 2);
        this.y = includeCheckoutErrorNoRoundedBinding;
        this.z = imageView;
        this.A = includeCheckoutWarningBinding;
        this.B = linearLayout;
        this.C = linearLayout2;
        this.D = recyclerView;
        this.E = editText;
        this.F = editText2;
        this.G = textView;
        this.H = textView2;
        this.I = linearLayout3;
        this.J = textView3;
        this.K = editText3;
        this.L = appCompatCheckBox;
    }
}
