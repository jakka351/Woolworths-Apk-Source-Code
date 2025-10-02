package com.scandit.datacapture.barcode.selection.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumDeserializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyleDeserializer;", "", "", "json", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionBasicOverlayStyleDeserializer {

    @NotNull
    public static final BarcodeSelectionBasicOverlayStyleDeserializer INSTANCE = new BarcodeSelectionBasicOverlayStyleDeserializer();

    private BarcodeSelectionBasicOverlayStyleDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final BarcodeSelectionBasicOverlayStyle fromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyleBarcodeSelectionBasicOverlayStyleFromJsonString = NativeBarcodeEnumDeserializer.barcodeSelectionBasicOverlayStyleFromJsonString(json);
        Intrinsics.g(barcodeSelectionBasicOverlayStyleBarcodeSelectionBasicOverlayStyleFromJsonString, "barcodeSelectionBasicOve…StyleFromJsonString(json)");
        return barcodeSelectionBasicOverlayStyleBarcodeSelectionBasicOverlayStyleFromJsonString;
    }
}
