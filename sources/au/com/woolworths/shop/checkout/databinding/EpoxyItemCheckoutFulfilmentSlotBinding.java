package au.com.woolworths.shop.checkout.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCheckoutFulfilmentSlotBinding extends ViewDataBinding {
    public final CheckedTextView A;
    public final CheckedTextView B;
    public final CheckedTextView C;
    public FulfilmentWindowsSlot D;
    public FulfilmentWindowsSlotListener E;
    public Boolean F;
    public final IncludeBrandLabelBinding y;
    public final IncludeBrandLabelBinding z;

    public EpoxyItemCheckoutFulfilmentSlotBinding(DataBindingComponent dataBindingComponent, View view, IncludeBrandLabelBinding includeBrandLabelBinding, IncludeBrandLabelBinding includeBrandLabelBinding2, CheckedTextView checkedTextView, CheckedTextView checkedTextView2, CheckedTextView checkedTextView3) {
        super(dataBindingComponent, view, 2);
        this.y = includeBrandLabelBinding;
        this.z = includeBrandLabelBinding2;
        this.A = checkedTextView;
        this.B = checkedTextView2;
        this.C = checkedTextView3;
    }
}
