package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes4.dex */
public abstract class IncludeCheckoutDeliveryNowBinding extends ViewDataBinding {
    public final ImageView A;
    public final CheckedTextView B;
    public final CheckedTextView C;
    public final CheckedTextView D;
    public final CheckedTextView E;
    public DeliveryNowWindow F;
    public FulfilmentWindowsSlotListener G;
    public final IncludeBrandLabelBinding y;
    public final CheckableConstraintLayout z;

    public IncludeCheckoutDeliveryNowBinding(DataBindingComponent dataBindingComponent, View view, IncludeBrandLabelBinding includeBrandLabelBinding, CheckableConstraintLayout checkableConstraintLayout, ImageView imageView, CheckedTextView checkedTextView, CheckedTextView checkedTextView2, CheckedTextView checkedTextView3, CheckedTextView checkedTextView4) {
        super(dataBindingComponent, view, 1);
        this.y = includeBrandLabelBinding;
        this.z = checkableConstraintLayout;
        this.A = imageView;
        this.B = checkedTextView;
        this.C = checkedTextView2;
        this.D = checkedTextView3;
        this.E = checkedTextView4;
    }

    public abstract void L(DeliveryNowWindow deliveryNowWindow);

    public abstract void M(FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener);
}
