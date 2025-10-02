package au.com.woolworths.foundation.barcode.ui;

import android.view.View;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import au.com.woolworths.foundation.barcode.ui.view.databinding.BarcodeHolderBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"barcode-ui-view_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeViewKt {
    public static final void a(BarcodeView barcodeView, String str, BarcodeType barcodeType, View view) {
        Intrinsics.h(barcodeView, "barcodeView");
        if (str != null && str.length() != 0 && barcodeType != null) {
            barcodeView.a(str, barcodeType);
            if (view != null) {
                view.setVisibility(8);
                barcodeView.setVisibility(0);
                return;
            }
            return;
        }
        barcodeView.e = null;
        BarcodeHolderBinding barcodeHolderBinding = barcodeView.d;
        barcodeHolderBinding.y.setImageDrawable(null);
        barcodeHolderBinding.L(true);
        barcodeHolderBinding.l();
        if (view != null) {
            view.setVisibility(0);
            barcodeView.setVisibility(8);
        }
    }
}
