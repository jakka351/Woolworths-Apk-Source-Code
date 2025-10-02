package au.com.woolworths.shop.buyagain.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy;

/* loaded from: classes4.dex */
public abstract class LayoutBuyAgainHeaderBinding extends ViewDataBinding {
    public final TextView y;
    public BuyAgainViewModelLegacy z;

    public LayoutBuyAgainHeaderBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 1);
        this.y = textView;
    }

    public abstract void L(BuyAgainViewModelLegacy buyAgainViewModelLegacy);
}
