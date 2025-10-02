package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\bP\bÆ\u0002\u0018\u00002\u00020\u0001R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001b\u0010\u0006R \u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u0012\u0004\b$\u0010\b\u001a\u0004\b#\u0010\u0006R \u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0004\u0012\u0004\b(\u0010\b\u001a\u0004\b'\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u0004\u0012\u0004\b,\u0010\b\u001a\u0004\b+\u0010\u0006R \u00101\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\b.\u0010\u0004\u0012\u0004\b0\u0010\b\u001a\u0004\b/\u0010\u0006R \u00108\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010\b\u001a\u0004\b5\u00106R \u0010<\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u00104\u0012\u0004\b;\u0010\b\u001a\u0004\b:\u00106R \u0010@\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010\u0004\u0012\u0004\b?\u0010\b\u001a\u0004\b>\u0010\u0006R \u0010D\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010\u0004\u0012\u0004\bC\u0010\b\u001a\u0004\bB\u0010\u0006R \u0010H\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010\u0004\u0012\u0004\bG\u0010\b\u001a\u0004\bF\u0010\u0006R \u0010O\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010\b\u001a\u0004\bL\u0010MR \u0010S\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bP\u0010K\u0012\u0004\bR\u0010\b\u001a\u0004\bQ\u0010MR\"\u0010U\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010\b\u001a\u0004\bW\u0010XR\"\u0010Z\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u0010V\u0012\u0004\b\\\u0010\b\u001a\u0004\b[\u0010XR\"\u0010]\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b]\u0010V\u0012\u0004\b_\u0010\b\u001a\u0004\b^\u0010XR\"\u0010`\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010V\u0012\u0004\bb\u0010\b\u001a\u0004\ba\u0010XR\"\u0010c\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bc\u0010d\u0012\u0004\bg\u0010\b\u001a\u0004\be\u0010fR\"\u0010h\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bh\u0010d\u0012\u0004\bj\u0010\b\u001a\u0004\bi\u0010fR\"\u0010k\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bk\u0010d\u0012\u0004\bm\u0010\b\u001a\u0004\bl\u0010fR\"\u0010n\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bn\u0010d\u0012\u0004\bp\u0010\b\u001a\u0004\bo\u0010fR\"\u0010q\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bq\u0010d\u0012\u0004\bs\u0010\b\u001a\u0004\br\u0010fR\"\u0010t\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bt\u0010d\u0012\u0004\bv\u0010\b\u001a\u0004\bu\u0010fR\"\u0010w\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bw\u0010V\u0012\u0004\by\u0010\b\u001a\u0004\bx\u0010XR\"\u0010z\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bz\u0010d\u0012\u0004\b|\u0010\b\u001a\u0004\b{\u0010fR\"\u0010}\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b}\u0010d\u0012\u0004\b\u007f\u0010\b\u001a\u0004\b~\u0010fR&\u0010\u0080\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010V\u0012\u0005\b\u0082\u0001\u0010\b\u001a\u0005\b\u0081\u0001\u0010XR&\u0010\u0083\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010V\u0012\u0005\b\u0085\u0001\u0010\b\u001a\u0005\b\u0084\u0001\u0010XR&\u0010\u0086\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010V\u0012\u0005\b\u0088\u0001\u0010\b\u001a\u0005\b\u0087\u0001\u0010XR&\u0010\u0089\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010V\u0012\u0005\b\u008b\u0001\u0010\b\u001a\u0005\b\u008a\u0001\u0010XR&\u0010\u008c\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010V\u0012\u0005\b\u008e\u0001\u0010\b\u001a\u0005\b\u008d\u0001\u0010XR&\u0010\u008f\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010V\u0012\u0005\b\u0091\u0001\u0010\b\u001a\u0005\b\u0090\u0001\u0010XR&\u0010\u0092\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010V\u0012\u0005\b\u0094\u0001\u0010\b\u001a\u0005\b\u0093\u0001\u0010XR&\u0010\u0095\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010V\u0012\u0005\b\u0097\u0001\u0010\b\u001a\u0005\b\u0096\u0001\u0010XR&\u0010\u0098\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010V\u0012\u0005\b\u009a\u0001\u0010\b\u001a\u0005\b\u0099\u0001\u0010XR&\u0010\u009b\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010V\u0012\u0005\b\u009d\u0001\u0010\b\u001a\u0005\b\u009c\u0001\u0010XR&\u0010\u009e\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010V\u0012\u0005\b \u0001\u0010\b\u001a\u0005\b\u009f\u0001\u0010XR&\u0010¡\u0001\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b¡\u0001\u0010V\u0012\u0005\b£\u0001\u0010\b\u001a\u0005\b¢\u0001\u0010X¨\u0006¤\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanViewDefaults;", "", "", "a", "Z", "getDefaultScanningBehaviorButtonVisible", "()Z", "getDefaultScanningBehaviorButtonVisible$annotations", "()V", "defaultScanningBehaviorButtonVisible", "b", "getDefaultHandModeButtonVisible", "getDefaultHandModeButtonVisible$annotations", "defaultHandModeButtonVisible", "c", "getDefaultTorchButtonVisible", "getDefaultTorchButtonVisible$annotations", "defaultTorchButtonVisible", "d", "getDefaultBarcodeCountButtonVisible", "getDefaultBarcodeCountButtonVisible$annotations", "defaultBarcodeCountButtonVisible", "e", "getDefaultFastFindButtonVisible", "getDefaultFastFindButtonVisible$annotations", "defaultFastFindButtonVisible", "f", "getDefaultBarcodeFindButtonVisible", "getDefaultBarcodeFindButtonVisible$annotations", "defaultBarcodeFindButtonVisible", "g", "getDefaultTargetModeButtonVisible", "getDefaultTargetModeButtonVisible$annotations", "defaultTargetModeButtonVisible", "h", "getDefaultSoundModeButtonVisible", "getDefaultSoundModeButtonVisible$annotations", "defaultSoundModeButtonVisible", "i", "getDefaultHapticModeButtonVisible", "getDefaultHapticModeButtonVisible$annotations", "defaultHapticModeButtonVisible", "j", "getDefaultCameraSwitchButtonVisible", "getDefaultCameraSwitchButtonVisible$annotations", "defaultCameraSwitchButtonVisible", "k", "getDefaultShouldShowTargetModeHint", "getDefaultShouldShowTargetModeHint$annotations", "defaultShouldShowTargetModeHint", "Lcom/scandit/datacapture/core/ui/style/Brush;", "l", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getDefaultBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "getDefaultBrush$annotations", "defaultBrush", "m", "getDefaultErrorBrush", "getDefaultErrorBrush$annotations", "defaultErrorBrush", "n", "getDefaultToastEnabled", "getDefaultToastEnabled$annotations", "defaultToastEnabled", "o", "getDefaultZoomSwitchControlVisible", "getDefaultZoomSwitchControlVisible$annotations", "defaultZoomSwitchControlVisible", "p", "getDefaultPreviewSizeControlVisible", "getDefaultPreviewSizeControlVisible$annotations", "defaultPreviewSizeControlVisible", "", "q", "I", "getDefaultVisualFeedbackSuccessColor", "()I", "getDefaultVisualFeedbackSuccessColor$annotations", "defaultVisualFeedbackSuccessColor", "r", "getDefaultVisualFeedbackErrorColor", "getDefaultVisualFeedbackErrorColor$annotations", "defaultVisualFeedbackErrorColor", "", "defaultStopCapturingText", "Ljava/lang/String;", "getDefaultStopCapturingText", "()Ljava/lang/String;", "getDefaultStopCapturingText$annotations", "defaultStartCapturingText", "getDefaultStartCapturingText", "getDefaultStartCapturingText$annotations", "defaultResumeCapturingText", "getDefaultResumeCapturingText", "getDefaultResumeCapturingText$annotations", "defaultScanningCapturingText", "getDefaultScanningCapturingText", "getDefaultScanningCapturingText$annotations", "defaultCaptureButtonActiveBackgroundColor", "Ljava/lang/Integer;", "getDefaultCaptureButtonActiveBackgroundColor", "()Ljava/lang/Integer;", "getDefaultCaptureButtonActiveBackgroundColor$annotations", "defaultCaptureButtonBackgroundColor", "getDefaultCaptureButtonBackgroundColor", "getDefaultCaptureButtonBackgroundColor$annotations", "defaultCaptureButtonTintColor", "getDefaultCaptureButtonTintColor", "getDefaultCaptureButtonTintColor$annotations", "defaultToolbarBackgroundColor", "getDefaultToolbarBackgroundColor", "getDefaultToolbarBackgroundColor$annotations", "defaultToolbarIconActiveTintColor", "getDefaultToolbarIconActiveTintColor", "getDefaultToolbarIconActiveTintColor$annotations", "defaultToolbarIconInactiveTintColor", "getDefaultToolbarIconInactiveTintColor", "getDefaultToolbarIconInactiveTintColor$annotations", "defaultTargetModeHintText", "getDefaultTargetModeHintText", "getDefaultTargetModeHintText$annotations", "defaultToastBackgroundColor", "getDefaultToastBackgroundColor", "getDefaultToastBackgroundColor$annotations", "defaultToastTextColor", "getDefaultToastTextColor", "getDefaultToastTextColor$annotations", "defaultTargetModeEnabledMessage", "getDefaultTargetModeEnabledMessage", "getDefaultTargetModeEnabledMessage$annotations", "defaultTargetModeDisabledMessage", "getDefaultTargetModeDisabledMessage", "getDefaultTargetModeDisabledMessage$annotations", "defaultContinuousModeEnabledMessage", "getDefaultContinuousModeEnabledMessage", "getDefaultContinuousModeEnabledMessage$annotations", "defaultContinuousModeDisabledMessage", "getDefaultContinuousModeDisabledMessage", "getDefaultContinuousModeDisabledMessage$annotations", "defaultCameraTimeOutMessage", "getDefaultCameraTimeOutMessage", "getDefaultCameraTimeOutMessage$annotations", "defaultZoomedInMessage", "getDefaultZoomedInMessage", "getDefaultZoomedInMessage$annotations", "defaultZoomedOutMessage", "getDefaultZoomedOutMessage", "getDefaultZoomedOutMessage$annotations", "defaultTorchEnabledMessage", "getDefaultTorchEnabledMessage", "getDefaultTorchEnabledMessage$annotations", "defaultTorchDisabledMessage", "getDefaultTorchDisabledMessage", "getDefaultTorchDisabledMessage$annotations", "defaultWorldFacingCameraEnabledMessage", "getDefaultWorldFacingCameraEnabledMessage", "getDefaultWorldFacingCameraEnabledMessage$annotations", "defaultUserFacingCameraEnabledMessage", "getDefaultUserFacingCameraEnabledMessage", "getDefaultUserFacingCameraEnabledMessage$annotations", "defaultScanPausedMessage", "getDefaultScanPausedMessage", "getDefaultScanPausedMessage$annotations", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanViewDefaults {

    @NotNull
    public static final SparkScanViewDefaults INSTANCE = new SparkScanViewDefaults();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultScanningBehaviorButtonVisible = NativeSparkScanViewDefaults.defaultScanningBehaviorButtonVisible();

    /* renamed from: b, reason: from kotlin metadata */
    private static final boolean defaultHandModeButtonVisible = NativeSparkScanViewDefaults.defaultHandModeButtonVisible();

    /* renamed from: c, reason: from kotlin metadata */
    private static final boolean defaultTorchButtonVisible = NativeSparkScanViewDefaults.defaultTorchButtonVisible();

    /* renamed from: d, reason: from kotlin metadata */
    private static final boolean defaultBarcodeCountButtonVisible = NativeSparkScanViewDefaults.defaultBarcodeCountButtonVisible();

    /* renamed from: e, reason: from kotlin metadata */
    private static final boolean defaultFastFindButtonVisible = NativeSparkScanViewDefaults.defaultBarcodeFindButtonVisible();

    /* renamed from: f, reason: from kotlin metadata */
    private static final boolean defaultBarcodeFindButtonVisible = NativeSparkScanViewDefaults.defaultBarcodeFindButtonVisible();

    /* renamed from: g, reason: from kotlin metadata */
    private static final boolean defaultTargetModeButtonVisible = NativeSparkScanViewDefaults.defaultTargetModeButtonVisible();

    /* renamed from: h, reason: from kotlin metadata */
    private static final boolean defaultSoundModeButtonVisible = NativeSparkScanViewDefaults.defaultSoundModeButtonVisible();

    /* renamed from: i, reason: from kotlin metadata */
    private static final boolean defaultHapticModeButtonVisible = NativeSparkScanViewDefaults.defaultHapticModeButtonVisible();

    /* renamed from: j, reason: from kotlin metadata */
    private static final boolean defaultCameraSwitchButtonVisible = NativeSparkScanViewDefaults.defaultCameraSwitchButtonVisible();

    /* renamed from: k, reason: from kotlin metadata */
    private static final boolean defaultShouldShowTargetModeHint = true;

    /* renamed from: l, reason: from kotlin metadata */
    private static final Brush defaultBrush;

    /* renamed from: m, reason: from kotlin metadata */
    private static final Brush defaultErrorBrush;

    /* renamed from: n, reason: from kotlin metadata */
    private static final boolean defaultToastEnabled;

    /* renamed from: o, reason: from kotlin metadata */
    private static final boolean defaultZoomSwitchControlVisible;

    /* renamed from: p, reason: from kotlin metadata */
    private static final boolean defaultPreviewSizeControlVisible;

    /* renamed from: q, reason: from kotlin metadata */
    private static final int defaultVisualFeedbackSuccessColor;

    /* renamed from: r, reason: from kotlin metadata */
    private static final int defaultVisualFeedbackErrorColor;

    static {
        Brush.Companion companion = Brush.INSTANCE;
        NativeBrush nativeBrushDefaultFeedbackSuccessBrush = NativeSparkScanViewDefaults.defaultFeedbackSuccessBrush();
        Intrinsics.g(nativeBrushDefaultFeedbackSuccessBrush, "defaultFeedbackSuccessBrush()");
        defaultBrush = BrushExtensionsKt.of(companion, nativeBrushDefaultFeedbackSuccessBrush);
        NativeBrush nativeBrushDefaultFeedbackErrorBrush = NativeSparkScanViewDefaults.defaultFeedbackErrorBrush();
        Intrinsics.g(nativeBrushDefaultFeedbackErrorBrush, "defaultFeedbackErrorBrush()");
        defaultErrorBrush = BrushExtensionsKt.of(companion, nativeBrushDefaultFeedbackErrorBrush);
        defaultToastEnabled = NativeSparkScanViewDefaults.defaultToastEnabled();
        defaultZoomSwitchControlVisible = NativeSparkScanViewDefaults.defaultZoomSwitchControlVisible();
        defaultPreviewSizeControlVisible = NativeSparkScanViewDefaults.defaultPreviewSizeControlVisible();
        NativeColor nativeColorDefaultVisualFeedbackSuccessColor = NativeSparkScanViewDefaults.defaultVisualFeedbackSuccessColor();
        Intrinsics.g(nativeColorDefaultVisualFeedbackSuccessColor, "defaultVisualFeedbackSuccessColor()");
        defaultVisualFeedbackSuccessColor = NativeColorExtensionsKt.toInt(nativeColorDefaultVisualFeedbackSuccessColor);
        NativeColor nativeColorDefaultVisualFeedbackErrorColor = NativeSparkScanViewDefaults.defaultVisualFeedbackErrorColor();
        Intrinsics.g(nativeColorDefaultVisualFeedbackErrorColor, "defaultVisualFeedbackErrorColor()");
        defaultVisualFeedbackErrorColor = NativeColorExtensionsKt.toInt(nativeColorDefaultVisualFeedbackErrorColor);
    }

    private SparkScanViewDefaults() {
    }

    public static final boolean getDefaultBarcodeCountButtonVisible() {
        return defaultBarcodeCountButtonVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultBarcodeCountButtonVisible$annotations() {
    }

    public static final boolean getDefaultBarcodeFindButtonVisible() {
        return defaultBarcodeFindButtonVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultBarcodeFindButtonVisible$annotations() {
    }

    @NotNull
    public static final Brush getDefaultBrush() {
        return defaultBrush;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultBrush$annotations() {
    }

    public static final boolean getDefaultCameraSwitchButtonVisible() {
        return defaultCameraSwitchButtonVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultCameraSwitchButtonVisible$annotations() {
    }

    @Nullable
    public static final String getDefaultCameraTimeOutMessage() {
        return null;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultCameraTimeOutMessage$annotations() {
    }

    @Nullable
    public static final Integer getDefaultCaptureButtonActiveBackgroundColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultCaptureButtonActiveBackgroundColor$annotations() {
    }

    @Nullable
    public static final Integer getDefaultCaptureButtonBackgroundColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultCaptureButtonBackgroundColor$annotations() {
    }

    @Nullable
    public static final Integer getDefaultCaptureButtonTintColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultCaptureButtonTintColor$annotations() {
    }

    @Nullable
    public static final String getDefaultContinuousModeDisabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultContinuousModeDisabledMessage$annotations() {
    }

    @Nullable
    public static final String getDefaultContinuousModeEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultContinuousModeEnabledMessage$annotations() {
    }

    @NotNull
    public static final Brush getDefaultErrorBrush() {
        return defaultErrorBrush;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultErrorBrush$annotations() {
    }

    public static final boolean getDefaultFastFindButtonVisible() {
        return defaultFastFindButtonVisible;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultFastFindButtonVisible$annotations() {
    }

    public static final boolean getDefaultHandModeButtonVisible() {
        return defaultHandModeButtonVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultHandModeButtonVisible$annotations() {
    }

    public static final boolean getDefaultHapticModeButtonVisible() {
        return defaultHapticModeButtonVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultHapticModeButtonVisible$annotations() {
    }

    public static final boolean getDefaultPreviewSizeControlVisible() {
        return defaultPreviewSizeControlVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultPreviewSizeControlVisible$annotations() {
    }

    @Nullable
    public static final String getDefaultResumeCapturingText() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultResumeCapturingText$annotations() {
    }

    @Nullable
    public static final String getDefaultScanPausedMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultScanPausedMessage$annotations() {
    }

    public static final boolean getDefaultScanningBehaviorButtonVisible() {
        return defaultScanningBehaviorButtonVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultScanningBehaviorButtonVisible$annotations() {
    }

    @Nullable
    public static final String getDefaultScanningCapturingText() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultScanningCapturingText$annotations() {
    }

    public static final boolean getDefaultShouldShowTargetModeHint() {
        return defaultShouldShowTargetModeHint;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultShouldShowTargetModeHint$annotations() {
    }

    public static final boolean getDefaultSoundModeButtonVisible() {
        return defaultSoundModeButtonVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultSoundModeButtonVisible$annotations() {
    }

    @Nullable
    public static final String getDefaultStartCapturingText() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultStartCapturingText$annotations() {
    }

    @Nullable
    public static final String getDefaultStopCapturingText() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultStopCapturingText$annotations() {
    }

    public static final boolean getDefaultTargetModeButtonVisible() {
        return defaultTargetModeButtonVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTargetModeButtonVisible$annotations() {
    }

    @Nullable
    public static final String getDefaultTargetModeDisabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTargetModeDisabledMessage$annotations() {
    }

    @Nullable
    public static final String getDefaultTargetModeEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTargetModeEnabledMessage$annotations() {
    }

    @Nullable
    public static final String getDefaultTargetModeHintText() {
        return null;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultTargetModeHintText$annotations() {
    }

    @Nullable
    public static final Integer getDefaultToastBackgroundColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToastBackgroundColor$annotations() {
    }

    public static final boolean getDefaultToastEnabled() {
        return defaultToastEnabled;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToastEnabled$annotations() {
    }

    @Nullable
    public static final Integer getDefaultToastTextColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToastTextColor$annotations() {
    }

    @Nullable
    public static final Integer getDefaultToolbarBackgroundColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToolbarBackgroundColor$annotations() {
    }

    @Nullable
    public static final Integer getDefaultToolbarIconActiveTintColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToolbarIconActiveTintColor$annotations() {
    }

    @Nullable
    public static final Integer getDefaultToolbarIconInactiveTintColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToolbarIconInactiveTintColor$annotations() {
    }

    public static final boolean getDefaultTorchButtonVisible() {
        return defaultTorchButtonVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTorchButtonVisible$annotations() {
    }

    @Nullable
    public static final String getDefaultTorchDisabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTorchDisabledMessage$annotations() {
    }

    @Nullable
    public static final String getDefaultTorchEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTorchEnabledMessage$annotations() {
    }

    @Nullable
    public static final String getDefaultUserFacingCameraEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultUserFacingCameraEnabledMessage$annotations() {
    }

    public static final int getDefaultVisualFeedbackErrorColor() {
        return defaultVisualFeedbackErrorColor;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultVisualFeedbackErrorColor$annotations() {
    }

    public static final int getDefaultVisualFeedbackSuccessColor() {
        return defaultVisualFeedbackSuccessColor;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultVisualFeedbackSuccessColor$annotations() {
    }

    @Nullable
    public static final String getDefaultWorldFacingCameraEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultWorldFacingCameraEnabledMessage$annotations() {
    }

    public static final boolean getDefaultZoomSwitchControlVisible() {
        return defaultZoomSwitchControlVisible;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultZoomSwitchControlVisible$annotations() {
    }

    @Nullable
    public static final String getDefaultZoomedInMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultZoomedInMessage$annotations() {
    }

    @Nullable
    public static final String getDefaultZoomedOutMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultZoomedOutMessage$annotations() {
    }
}
