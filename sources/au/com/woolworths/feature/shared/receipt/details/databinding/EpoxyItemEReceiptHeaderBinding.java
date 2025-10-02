package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsClickHandler;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsHeader;

/* loaded from: classes3.dex */
public abstract class EpoxyItemEReceiptHeaderBinding extends ViewDataBinding {
    public final TextView A;
    public EReceiptDetailsHeader B;
    public EReceiptDetailsClickHandler C;
    public Boolean D;
    public final TextView y;
    public final ImageView z;

    public EpoxyItemEReceiptHeaderBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = textView2;
    }
}
