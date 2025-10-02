package au.com.woolworths.shop.digipay.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.models.PaymentInfo;
import au.com.woolworths.shop.digipay.models.SavedCreditCard;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes4.dex */
public abstract class EpoxyItemDigipaySavedCreditCardBinding extends ViewDataBinding {
    public final CheckableConstraintLayout A;
    public final FrameLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final Button F;
    public final ImageView G;
    public final View H;
    public SavedCreditCard I;
    public CreditCardEventHandler J;
    public PaymentInfo K;
    public final ImageView y;
    public final TextView z;

    public EpoxyItemDigipaySavedCreditCardBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, TextView textView, CheckableConstraintLayout checkableConstraintLayout, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4, Button button, ImageView imageView2, View view2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
        this.A = checkableConstraintLayout;
        this.B = frameLayout;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = button;
        this.G = imageView2;
        this.H = view2;
    }
}
