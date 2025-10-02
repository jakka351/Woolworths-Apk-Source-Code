package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsItem;

/* loaded from: classes3.dex */
public abstract class EpoxyItemEReceiptDetailsItemBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public EReceiptDetailsItem C;
    public final ConstraintLayout y;
    public final TextView z;

    public EpoxyItemEReceiptDetailsItemBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = textView;
        this.A = textView2;
        this.B = textView3;
    }
}
