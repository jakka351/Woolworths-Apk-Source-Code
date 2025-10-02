package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailFooter;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;

/* loaded from: classes3.dex */
public abstract class EpoxyItemEReceiptFooterBinding extends ViewDataBinding {
    public final FrameLayout A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public EReceiptDetailFooter E;
    public final TextView y;
    public final BarcodeView z;

    public EpoxyItemEReceiptFooterBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, BarcodeView barcodeView, FrameLayout frameLayout, TextView textView2, ImageView imageView, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = barcodeView;
        this.A = frameLayout;
        this.B = textView2;
        this.C = imageView;
        this.D = textView3;
    }
}
