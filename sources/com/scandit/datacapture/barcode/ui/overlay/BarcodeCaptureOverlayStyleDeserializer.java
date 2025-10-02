package com.scandit.datacapture.barcode.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumDeserializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyleDeserializer;", "", "", "json", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureOverlayStyleDeserializer {

    @NotNull
    public static final BarcodeCaptureOverlayStyleDeserializer INSTANCE = new BarcodeCaptureOverlayStyleDeserializer();

    private BarcodeCaptureOverlayStyleDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCaptureOverlayStyle fromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        NativeBarcodeCaptureOverlayStyle nativeBarcodeCaptureOverlayStyleBarcodeCaptureOverlayStyleFromJsonString = NativeBarcodeEnumDeserializer.barcodeCaptureOverlayStyleFromJsonString(json);
        Intrinsics.g(nativeBarcodeCaptureOverlayStyleBarcodeCaptureOverlayStyleFromJsonString, "barcodeCaptureOverlayStyleFromJsonString(json)");
        return BarcodeCaptureOverlayStyleKt.fromNative(nativeBarcodeCaptureOverlayStyleBarcodeCaptureOverlayStyleFromJsonString);
    }
}
