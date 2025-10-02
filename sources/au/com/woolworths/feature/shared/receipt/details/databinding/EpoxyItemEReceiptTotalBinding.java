package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsTotal;

/* loaded from: classes3.dex */
public abstract class EpoxyItemEReceiptTotalBinding extends ViewDataBinding {
    public final TextView y;
    public EReceiptDetailsTotal z;

    public EpoxyItemEReceiptTotalBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
