package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsClickHandler;

/* loaded from: classes3.dex */
public abstract class EpoxyItemEReceiptPaymentHeaderBinding extends ViewDataBinding {
    public Boolean A;
    public EReceiptDetailsClickHandler B;
    public final ImageView y;
    public Boolean z;

    public EpoxyItemEReceiptPaymentHeaderBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
    }
}
