package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptBarcode;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;

/* loaded from: classes3.dex */
public abstract class EpoxyItemEReceiptCouponBarcodeItemBinding extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public EReceiptBarcode C;
    public final BarcodeView y;
    public final FrameLayout z;

    public EpoxyItemEReceiptCouponBarcodeItemBinding(DataBindingComponent dataBindingComponent, View view, BarcodeView barcodeView, FrameLayout frameLayout, TextView textView, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = barcodeView;
        this.z = frameLayout;
        this.A = textView;
        this.B = imageView;
    }
}
