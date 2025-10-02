package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSparkScanViewDefaults {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanViewDefaults {
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

    public static native boolean defaultBarcodeCountButtonVisible();

    public static native boolean defaultBarcodeFindButtonVisible();

    public static native boolean defaultCameraSwitchButtonVisible();

    public static native NativeColor defaultCaptureButtonActiveBackgroundColor();

    public static native NativeColor defaultCaptureButtonBackgroundColor();

    public static native NativeColor defaultCaptureButtonTintColor();

    public static native String defaultContinuousModeDisabledMessage();

    public static native String defaultContinuousModeEnabledMessage();

    public static native NativeColor defaultErrorToastBackgroundColor();

    public static native NativeColor defaultErrorToastTextColor();

    public static native NativeBrush defaultFeedbackErrorBrush();

    public static native NativeBrush defaultFeedbackSuccessBrush();

    public static native boolean defaultHandModeButtonVisible();

    public static native boolean defaultHapticModeButtonVisible();

    public static native boolean defaultPreviewSizeControlVisible();

    public static native String defaultResumeCapturingText();

    public static native String defaultScanPausedMessage();

    public static native boolean defaultScanningBehaviorButtonVisible();

    public static native String defaultScanningCapturingText();

    public static native String defaultScanningCapturingTextHoldToScanEnabled();

    public static native boolean defaultSoundModeButtonVisible();

    public static native String defaultStartCapturingByHoldingText();

    public static native String defaultStartCapturingText();

    public static native String defaultStopCapturingText();

    public static native String defaultStopCapturingTextWhenHoldingToScan();

    public static native boolean defaultTargetModeButtonVisible();

    public static native String defaultTargetModeDisabledMessage();

    public static native String defaultTargetModeEnabledMessage();

    public static native NativeColor defaultToastBackgroundColor();

    public static native boolean defaultToastEnabled();

    public static native NativeColor defaultToastEnabledBackgroundColor();

    public static native NativeColor defaultToastTextColor();

    public static native NativeColor defaultToolbarBackgroundColor();

    public static native NativeColor defaultToolbarIconActiveTintColor();

    public static native NativeColor defaultToolbarIconInactiveTintColor();

    public static native boolean defaultTorchButtonVisible();

    public static native String defaultTorchDisabledMessage();

    public static native String defaultTorchEnabledMessage();

    public static native String defaultUserFacingCameraEnabledMessage();

    public static native NativeColor defaultVisualFeedbackErrorColor();

    public static native NativeColor defaultVisualFeedbackSuccessColor();

    public static native String defaultWorldFacingCameraEnabledMessage();

    public static native boolean defaultZoomSwitchControlVisible();

    public static native String defaultZoomedInMessage();

    public static native String defaultZoomedOutMessage();
}
