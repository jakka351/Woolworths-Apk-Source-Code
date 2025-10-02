package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes4.dex */
public abstract class IncludeCheckoutDirectToBootNowBinding extends ViewDataBinding {
    public final CheckableConstraintLayout A;
    public final View B;
    public final ImageView C;
    public final CheckedTextView D;
    public final CheckedTextView E;
    public final CheckedTextView F;
    public final CheckedTextView G;
    public final IncludeBrandLabelBinding H;
    public DirectToBootNowWindow I;
    public FulfilmentWindowsSlotListener J;
    public final IncludeBrandLabelBinding y;
    public final LinearLayout z;

    public IncludeCheckoutDirectToBootNowBinding(DataBindingComponent dataBindingComponent, View view, IncludeBrandLabelBinding includeBrandLabelBinding, LinearLayout linearLayout, CheckableConstraintLayout checkableConstraintLayout, View view2, ImageView imageView, CheckedTextView checkedTextView, CheckedTextView checkedTextView2, CheckedTextView checkedTextView3, CheckedTextView checkedTextView4, IncludeBrandLabelBinding includeBrandLabelBinding2) {
        super(dataBindingComponent, view, 2);
        this.y = includeBrandLabelBinding;
        this.z = linearLayout;
        this.A = checkableConstraintLayout;
        this.B = view2;
        this.C = imageView;
        this.D = checkedTextView;
        this.E = checkedTextView2;
        this.F = checkedTextView3;
        this.G = checkedTextView4;
        this.H = includeBrandLabelBinding2;
    }

    public abstract void L(DirectToBootNowWindow directToBootNowWindow);

    public abstract void M(FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener);
}
