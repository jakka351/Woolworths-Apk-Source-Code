package com.scandit.datacapture.barcode.internal.module.serialization;

import com.scandit.datacapture.barcode.data.Checksum;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickIconStyle;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerBehavior;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionFreezeBehavior;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapBehavior;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayStyle;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.barcode.ui.overlay.NativeBarcodeCaptureOverlayStyle;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeEnumDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeEnumDeserializer {
        private final long nativeRef;

        private CppProxy(long j) {
            new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);
    }

    public static native NativeBarcodeCaptureOverlayStyle barcodeCaptureOverlayStyleFromJsonString(String str);

    public static native NativeBarcodePickIconStyle barcodePickIconStyleFromJsonString(String str);

    public static native NativeBarcodePickState barcodePickStateFromJsonString(String str);

    public static native BarcodeSelectionAimerBehavior barcodeSelectionAimerBehaviorFromJsonString(String str);

    public static native BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyleFromJsonString(String str);

    public static native NativeBarcodeTrackingBasicOverlayStyle barcodeTrackingBasicOverlayStyleFromJsonString(String str);

    public static native EnumSet<Checksum> checksumFromJsonString(String str);

    public static native EnumSet<CompositeType> compositeTypeFromJsonString(String str);

    public static native BarcodeSelectionFreezeBehavior freezeBehaviorFromJsonString(String str);

    public static native BarcodeSelectionTapBehavior tapBehaviorFromJsonString(String str);
}
