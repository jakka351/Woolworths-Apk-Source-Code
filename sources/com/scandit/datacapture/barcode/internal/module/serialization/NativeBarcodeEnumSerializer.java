package com.scandit.datacapture.barcode.internal.module.serialization;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterHighlightType;
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
public abstract class NativeBarcodeEnumSerializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeEnumSerializer {
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

    public static native String barcodeCaptureOverlayStyleToString(NativeBarcodeCaptureOverlayStyle nativeBarcodeCaptureOverlayStyle);

    public static native String barcodeCountBasicOverlayStyleToString(NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle);

    public static native String barcodeFilterHighlightTypeToString(NativeBarcodeFilterHighlightType nativeBarcodeFilterHighlightType);

    public static native String barcodePickIconStyleToString(NativeBarcodePickIconStyle nativeBarcodePickIconStyle);

    public static native String barcodePickStateToString(NativeBarcodePickState nativeBarcodePickState);

    public static native String barcodeSelectionAimerBehaviorToString(BarcodeSelectionAimerBehavior barcodeSelectionAimerBehavior);

    public static native String barcodeSelectionBasicOverlayStyleToString(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle);

    public static native String barcodeTrackingBasicOverlayStyleToString(NativeBarcodeTrackingBasicOverlayStyle nativeBarcodeTrackingBasicOverlayStyle);

    public static native String compositeTypeToString(EnumSet<CompositeType> enumSet);

    public static native String freezeBehaviorToString(BarcodeSelectionFreezeBehavior barcodeSelectionFreezeBehavior);

    public static native String tapBehaviorToString(BarcodeSelectionTapBehavior barcodeSelectionTapBehavior);
}
