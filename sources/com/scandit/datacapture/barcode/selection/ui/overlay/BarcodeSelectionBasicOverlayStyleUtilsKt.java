package com.scandit.datacapture.barcode.selection.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toJson", "", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeSelectionBasicOverlayStyleUtilsKt {
    public static final /* synthetic */ String toJson(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        Intrinsics.h(barcodeSelectionBasicOverlayStyle, "<this>");
        String strBarcodeSelectionBasicOverlayStyleToString = NativeBarcodeEnumSerializer.barcodeSelectionBasicOverlayStyleToString(barcodeSelectionBasicOverlayStyle);
        Intrinsics.g(strBarcodeSelectionBasicOverlayStyleToString, "barcodeSelectionBasicOverlayStyleToString(this)");
        return strBarcodeSelectionBasicOverlayStyleToString;
    }
}
