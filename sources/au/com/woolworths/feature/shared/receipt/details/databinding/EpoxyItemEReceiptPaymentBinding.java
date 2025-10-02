package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsPayment;

/* loaded from: classes3.dex */
public abstract class EpoxyItemEReceiptPaymentBinding extends ViewDataBinding {
    public EReceiptDetailsPayment A;
    public final TextView y;
    public final ImageView z;

    public EpoxyItemEReceiptPaymentBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
    }
}
