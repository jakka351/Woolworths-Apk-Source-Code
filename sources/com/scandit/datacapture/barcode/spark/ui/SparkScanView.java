package com.scandit.datacapture.barcode.spark.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.Gc;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareButtonHelperKt;
import com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanEnableDisableListener;
import com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanModeViewListener;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonView;
import com.scandit.datacapture.barcode.internal.module.spark.ui.feedback.SparkScanFeedbackManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter;
import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanFeedbackDelegate;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanViewFeedback;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ¨\u00012\u00020\u0001:\u0002¨\u0001B©\u0001\b\u0000\u0012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u0012\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001\u0012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001\u0012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u0012\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001\u0012\n\b\u0002\u0010\u0095\u0001\u001a\u00030\u0094\u0001\u0012\n\b\u0002\u0010\u0097\u0001\u001a\u00030\u0096\u0001\u0012\n\b\u0002\u0010\u0099\u0001\u001a\u00030\u0098\u0001\u0012\n\b\u0002\u0010\u009b\u0001\u001a\u00030\u009a\u0001\u0012\n\b\u0002\u0010\u009d\u0001\u001a\u00030\u009c\u0001\u0012\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u0001\u0012\n\b\u0002\u0010¡\u0001\u001a\u00030 \u0001\u0012\n\b\u0002\u0010£\u0001\u001a\u00030¢\u0001\u0012\n\b\u0002\u0010¥\u0001\u001a\u00030¤\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0005H\u0014J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u0005H\u0014J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0019J\u000f\u0010\u001d\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001e\u0010\u001cR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b.\u0010\u001c\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00107\u001a\u0002002\u0006\u00101\u001a\u0002008F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b6\u0010\u001c\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u0010=\u001a\u0004\u0018\u00010\u00162\b\u00101\u001a\u0004\u0018\u00010\u00168F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b<\u0010\u001c\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010A\u001a\u00020(2\u0006\u00101\u001a\u00020(8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b@\u0010\u001c\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R$\u0010D\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010+\"\u0004\bC\u0010-R$\u0010G\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010+\"\u0004\bF\u0010-R$\u0010J\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010+\"\u0004\bI\u0010-R$\u0010M\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010+\"\u0004\bL\u0010-R$\u0010P\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010+\"\u0004\bO\u0010-R$\u0010S\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010+\"\u0004\bR\u0010-R*\u0010W\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bV\u0010\u001c\u001a\u0004\bT\u0010+\"\u0004\bU\u0010-R$\u0010Z\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010+\"\u0004\bY\u0010-R$\u0010]\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010+\"\u0004\b\\\u0010-R*\u0010a\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b`\u0010\u001c\u001a\u0004\b^\u0010+\"\u0004\b_\u0010-R*\u0010e\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bd\u0010\u001c\u001a\u0004\bb\u0010+\"\u0004\bc\u0010-R$\u0010h\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010+\"\u0004\bg\u0010-R(\u0010k\u001a\u0004\u0018\u00010\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u00109\"\u0004\bj\u0010;R(\u0010n\u001a\u0004\u0018\u00010\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u00109\"\u0004\bm\u0010;R(\u0010q\u001a\u0004\u0018\u00010\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u00109\"\u0004\bp\u0010;R(\u0010t\u001a\u0004\u0018\u00010\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u00109\"\u0004\bs\u0010;R(\u0010z\u001a\u0004\u0018\u00010u2\b\u0010)\u001a\u0004\u0018\u00010u8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR(\u0010}\u001a\u0004\u0018\u00010u2\b\u0010)\u001a\u0004\u0018\u00010u8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010w\"\u0004\b|\u0010yR)\u0010\u0080\u0001\u001a\u0004\u0018\u00010u2\b\u0010)\u001a\u0004\u0018\u00010u8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010w\"\u0004\b\u007f\u0010yR+\u0010\u0083\u0001\u001a\u0004\u0018\u00010u2\b\u0010)\u001a\u0004\u0018\u00010u8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010w\"\u0005\b\u0082\u0001\u0010yR+\u0010\u0086\u0001\u001a\u0004\u0018\u00010u2\b\u0010)\u001a\u0004\u0018\u00010u8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010w\"\u0005\b\u0085\u0001\u0010yR+\u0010\u0089\u0001\u001a\u0004\u0018\u00010u2\b\u0010)\u001a\u0004\u0018\u00010u8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010w\"\u0005\b\u0088\u0001\u0010y¨\u0006©\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "Landroid/widget/RelativeLayout;", "Landroid/os/Parcelable;", "onSaveInstanceState", "state", "", "onRestoreInstanceState", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onAttachedToWindow", "onPause", "onResume", "onDetachedFromWindow", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanViewFeedback;", "feedback", "emitFeedback", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanViewUiListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "startScanning", "pauseScanning", "", TextBundle.TEXT_ENTRY, "showToast", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "getScanningMode", "_onZoomedIn$scandit_barcode_capture", "()V", "_onZoomedIn", "_onZoomedOut$scandit_barcode_capture", "_onZoomedOut", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedbackDelegate;", "o", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedbackDelegate;", "getFeedbackDelegate", "()Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedbackDelegate;", "setFeedbackDelegate", "(Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedbackDelegate;)V", "feedbackDelegate", "", "value", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "getShouldShowScanAreaGuides$annotations", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/core/ui/style/Brush;", "<anonymous parameter 0>", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "getBrush$annotations", "brush", "getTargetModeHintText", "()Ljava/lang/String;", "setTargetModeHintText", "(Ljava/lang/String;)V", "getTargetModeHintText$annotations", "targetModeHintText", "getShouldShowTargetModeHint", "setShouldShowTargetModeHint", "getShouldShowTargetModeHint$annotations", "shouldShowTargetModeHint", "getZoomSwitchControlVisible", "setZoomSwitchControlVisible", "zoomSwitchControlVisible", "getPreviewSizeControlVisible", "setPreviewSizeControlVisible", "previewSizeControlVisible", "getTorchButtonVisible", "setTorchButtonVisible", "torchButtonVisible", "getScanningBehaviorButtonVisible", "setScanningBehaviorButtonVisible", "scanningBehaviorButtonVisible", "getHandModeButtonVisible", "setHandModeButtonVisible", "handModeButtonVisible", "getBarcodeCountButtonVisible", "setBarcodeCountButtonVisible", "barcodeCountButtonVisible", "getFastFindButtonVisible", "setFastFindButtonVisible", "getFastFindButtonVisible$annotations", "fastFindButtonVisible", "getBarcodeFindButtonVisible", "setBarcodeFindButtonVisible", "barcodeFindButtonVisible", "getTargetModeButtonVisible", "setTargetModeButtonVisible", "targetModeButtonVisible", "getSoundModeButtonVisible", "setSoundModeButtonVisible", "getSoundModeButtonVisible$annotations", "soundModeButtonVisible", "getHapticModeButtonVisible", "setHapticModeButtonVisible", "getHapticModeButtonVisible$annotations", "hapticModeButtonVisible", "getCameraSwitchButtonVisible", "setCameraSwitchButtonVisible", "cameraSwitchButtonVisible", "getStopCapturingText", "setStopCapturingText", "stopCapturingText", "getStartCapturingText", "setStartCapturingText", "startCapturingText", "getResumeCapturingText", "setResumeCapturingText", "resumeCapturingText", "getScanningCapturingText", "setScanningCapturingText", "scanningCapturingText", "", "getCaptureButtonActiveBackgroundColor", "()Ljava/lang/Integer;", "setCaptureButtonActiveBackgroundColor", "(Ljava/lang/Integer;)V", "captureButtonActiveBackgroundColor", "getCaptureButtonBackgroundColor", "setCaptureButtonBackgroundColor", "captureButtonBackgroundColor", "getCaptureButtonTintColor", "setCaptureButtonTintColor", "captureButtonTintColor", "getToolbarBackgroundColor", "setToolbarBackgroundColor", "toolbarBackgroundColor", "getToolbarIconActiveTintColor", "setToolbarIconActiveTintColor", "toolbarIconActiveTintColor", "getToolbarIconInactiveTintColor", "setToolbarIconInactiveTintColor", "toolbarIconInactiveTintColor", "Landroid/view/View;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "sparkScan", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "settings", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/SparkScanViewUISettings;", "uiSettings", "Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanStateManager;", "stateManager", "Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanViewCameraManager;", "cameraManager", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreview;", "miniPreview", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/button/SparkScanViewScanButtonTouchListener;", "scanButtonTouchListener", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/button/SparkScanViewScanButtonView;", "sparkCaptureViewScanButtonView", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/feedback/SparkScanFeedbackManager;", "feedbackManager", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/toast/SparkScanViewToastPresenter;", "toastPresenter", "Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanAnalyticsManager;", "analyticsManager", "Lcom/scandit/datacapture/barcode/spark/ui/PropertyPushSource;", "propertyPushSource", "<init>", "(Landroid/view/View;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/SparkScanViewUISettings;Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanStateManager;Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanViewCameraManager;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreview;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/button/SparkScanViewScanButtonTouchListener;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/button/SparkScanViewScanButtonView;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/feedback/SparkScanFeedbackManager;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/toast/SparkScanViewToastPresenter;Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanAnalyticsManager;Lcom/scandit/datacapture/barcode/spark/ui/PropertyPushSource;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SuppressLint
@Mockable
/* loaded from: classes6.dex */
public final class SparkScanView extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final DataCaptureContext b;
    private final SparkScan c;
    private final SparkScanViewSettings d;
    private final SparkScanViewUISettings e;
    private final SparkScanStateManager f;
    private final SparkScanViewCameraManager g;
    private final SparkScanViewMiniPreview h;
    private final SparkScanViewScanButtonTouchListener i;
    private final SparkScanViewScanButtonView j;
    private final SparkScanFeedbackManager k;
    private final SparkScanViewToastPresenter l;
    private final SparkScanAnalyticsManager m;
    private final PropertyPushSource n;

    /* renamed from: o, reason: from kotlin metadata */
    private SparkScanFeedbackDelegate feedbackDelegate;
    private final SparkScanViewPresenter p;
    private final SparkScanView$sparkScanCameraStartListener$1 q;
    private final SparkScanView$sparkScanEnableListener$1 r;
    private int s;
    private final SparkScanView$orientationEventListener$1 t;
    private final SparkScanView$modeViewListener$1 u;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007R\u001a\u0010\u0011\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView$Companion;", "", "Landroid/view/View;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "sparkScan", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "settings", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "newInstance", "", "getHardwareTriggerSupported", "()Z", "getHardwareTriggerSupported$annotations", "()V", "hardwareTriggerSupported", "", "SUPER_STATE_KEY", "Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getHardwareTriggerSupported$annotations() {
        }

        public static /* synthetic */ SparkScanView newInstance$default(Companion companion, View view, DataCaptureContext dataCaptureContext, SparkScan sparkScan, SparkScanViewSettings sparkScanViewSettings, int i, Object obj) {
            if ((i & 8) != 0) {
                sparkScanViewSettings = new SparkScanViewSettings();
            }
            return companion.newInstance(view, dataCaptureContext, sparkScan, sparkScanViewSettings);
        }

        public final boolean getHardwareTriggerSupported() {
            return HardwareButtonHelperKt.isHardwareTriggerSupported();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SparkScanView newInstance(@NotNull View parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull SparkScan sparkScan) {
            Intrinsics.h(parentView, "parentView");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(sparkScan, "sparkScan");
            return newInstance$default(this, parentView, dataCaptureContext, sparkScan, null, 8, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final SparkScanView newInstance(@NotNull View parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull SparkScan sparkScan, @NotNull SparkScanViewSettings settings) {
            Intrinsics.h(parentView, "parentView");
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(sparkScan, "sparkScan");
            Intrinsics.h(settings, "settings");
            return new SparkScanView(parentView, dataCaptureContext, sparkScan, settings.clone$scandit_barcode_capture(), new SparkScanViewUISettings(), null, null, null, null, null, null, null, null, null, 16352, null);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ SparkScanView(android.view.View r16, com.scandit.datacapture.core.capture.DataCaptureContext r17, com.scandit.datacapture.barcode.spark.capture.SparkScan r18, com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings r19, com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings r20, com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager r21, com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager r22, com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview r23, com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener r24, com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonView r25, com.scandit.datacapture.barcode.internal.module.spark.ui.feedback.SparkScanFeedbackManager r26, com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter r27, com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager r28, com.scandit.datacapture.barcode.spark.ui.PropertyPushSource r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.spark.ui.SparkScanView.<init>(android.view.View, com.scandit.datacapture.core.capture.DataCaptureContext, com.scandit.datacapture.barcode.spark.capture.SparkScan, com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings, com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings, com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager, com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager, com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview, com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener, com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonView, com.scandit.datacapture.barcode.internal.module.spark.ui.feedback.SparkScanFeedbackManager, com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter, com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager, com.scandit.datacapture.barcode.spark.ui.PropertyPushSource, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SparkScanView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.p.Q();
    }

    public static final boolean access$didRotate180Degrees(SparkScanView sparkScanView, int i) {
        return Math.abs(i - sparkScanView.s) == 2;
    }

    @Deprecated
    public static /* synthetic */ void getBrush$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getFastFindButtonVisible$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getHapticModeButtonVisible$annotations() {
    }

    public static final boolean getHardwareTriggerSupported() {
        return INSTANCE.getHardwareTriggerSupported();
    }

    @Deprecated
    public static /* synthetic */ void getShouldShowScanAreaGuides$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getShouldShowTargetModeHint$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getSoundModeButtonVisible$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getTargetModeHintText$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$onAttachedToWindow$--V, reason: not valid java name */
    public static /* synthetic */ void m302instrumented$0$onAttachedToWindow$V(SparkScanView sparkScanView, View view) {
        Callback.g(view);
        try {
            a(sparkScanView, view);
        } finally {
            Callback.h();
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SparkScanView newInstance(@NotNull View view, @NotNull DataCaptureContext dataCaptureContext, @NotNull SparkScan sparkScan) {
        return INSTANCE.newInstance(view, dataCaptureContext, sparkScan);
    }

    public final void _onZoomedIn$scandit_barcode_capture() {
        this.c._applyNewSettingsForScanningModeAndZoomLevel$scandit_barcode_capture(true, this.f.m());
    }

    public final void _onZoomedOut$scandit_barcode_capture() {
        this.c._applyNewSettingsForScanningModeAndZoomLevel$scandit_barcode_capture(false, this.f.m());
    }

    @Deprecated
    public final void emitFeedback(@NotNull SparkScanViewFeedback feedback) {
        Intrinsics.h(feedback, "feedback");
    }

    public final boolean getBarcodeCountButtonVisible() {
        return this.e.a();
    }

    public final boolean getBarcodeFindButtonVisible() {
        return this.e.b();
    }

    @NotNull
    public final Brush getBrush() {
        return SparkScanViewDefaults.getDefaultBrush();
    }

    public final boolean getCameraSwitchButtonVisible() {
        return this.e.c();
    }

    @Nullable
    public final Integer getCaptureButtonActiveBackgroundColor() {
        return this.e.d();
    }

    @Nullable
    public final Integer getCaptureButtonBackgroundColor() {
        return this.e.e();
    }

    @Nullable
    public final Integer getCaptureButtonTintColor() {
        return this.e.f();
    }

    public final boolean getFastFindButtonVisible() {
        return this.e.b();
    }

    @Nullable
    public final SparkScanFeedbackDelegate getFeedbackDelegate() {
        return this.feedbackDelegate;
    }

    public final boolean getHandModeButtonVisible() {
        return this.e.g();
    }

    public final boolean getHapticModeButtonVisible() {
        return this.e.h();
    }

    public final boolean getPreviewSizeControlVisible() {
        return this.h.b();
    }

    @Nullable
    public final String getResumeCapturingText() {
        return this.e.i();
    }

    public final boolean getScanningBehaviorButtonVisible() {
        return this.e.j();
    }

    @Nullable
    public final String getScanningCapturingText() {
        return this.e.k();
    }

    @NotNull
    public final SparkScanScanningMode getScanningMode() {
        return this.f.m();
    }

    public final boolean getShouldShowScanAreaGuides() {
        return this.h.c();
    }

    public final boolean getShouldShowTargetModeHint() {
        return SparkScanViewDefaults.getDefaultShouldShowTargetModeHint();
    }

    public final boolean getSoundModeButtonVisible() {
        return this.e.m();
    }

    @Nullable
    public final String getStartCapturingText() {
        return this.e.n();
    }

    @Nullable
    public final String getStopCapturingText() {
        return this.e.o();
    }

    public final boolean getTargetModeButtonVisible() {
        return this.e.p();
    }

    @Nullable
    public final String getTargetModeHintText() {
        return SparkScanViewDefaults.getDefaultTargetModeHintText();
    }

    @Nullable
    public final Integer getToolbarBackgroundColor() {
        return this.e.q();
    }

    @Nullable
    public final Integer getToolbarIconActiveTintColor() {
        return this.e.r();
    }

    @Nullable
    public final Integer getToolbarIconInactiveTintColor() {
        return this.e.s();
    }

    public final boolean getTorchButtonVisible() {
        return this.e.t();
    }

    public final boolean getZoomSwitchControlVisible() {
        return this.h.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        enable();
        this.c.setDataCaptureContext$scandit_barcode_capture(this.b);
        this.g.a(this.q);
        SparkScan sparkScan = this.c;
        sparkScan._addEnableDisableListener$scandit_barcode_capture(this.r);
        sparkScan.set_sparkScanModeViewListener$scandit_barcode_capture(this.u);
        sparkScan._applyNewSettingsForScanningModeAndZoomLevel$scandit_barcode_capture(this.f.u(), this.f.m());
        sparkScan.setPropertyPushSource$scandit_barcode_capture(this.n);
        setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 15));
        this.k.a(this);
        this.j.a((ViewGroup) this);
        this.j.a(this.p);
        this.h.a(this, this.d);
        this.p.b(this.c.isEnabled() ? NativeSparkScanViewState.ACTIVE_EXPANDED : NativeSparkScanViewState.IDLE);
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        getHandler().post(new b(this, 0));
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        disable();
        this.p.E();
        this.c._removeEnableDisableListener$scandit_barcode_capture(this.r);
        this.c.set_sparkScanModeViewListener$scandit_barcode_capture(null);
        this.c.setDataCaptureContext$scandit_barcode_capture(null);
        this.c.setPropertyPushSource$scandit_barcode_capture(null);
        this.g.a((SparkScanView$sparkScanCameraStartListener$1) null);
        setOnClickListener(null);
        removeAllViews();
        super.onDetachedFromWindow();
    }

    public final void onPause() {
        this.p.J();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        Intrinsics.f(state, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) state;
        this.p.a(bundle);
        super.onRestoreInstanceState(bundle.getParcelable("super_state_key"));
    }

    public final void onResume() {
        this.p.K();
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super_state_key", parcelableOnSaveInstanceState);
        bundle.putAll(this.p.L());
        return bundle;
    }

    public final void pauseScanning() {
        this.p.V();
    }

    public final void setBarcodeCountButtonVisible(boolean z) {
        this.e.a(z);
    }

    public final void setBarcodeFindButtonVisible(boolean z) {
        this.e.b(z);
    }

    public final void setBrush(@NotNull Brush brush) {
        Intrinsics.h(brush, "<anonymous parameter 0>");
    }

    public final void setCameraSwitchButtonVisible(boolean z) {
        this.e.c(z);
    }

    public final void setCaptureButtonActiveBackgroundColor(@Nullable Integer num) {
        this.e.a(num);
    }

    public final void setCaptureButtonBackgroundColor(@Nullable Integer num) {
        this.e.b(num);
    }

    public final void setCaptureButtonTintColor(@Nullable Integer num) {
        this.e.c(num);
    }

    public final void setFastFindButtonVisible(boolean z) {
        this.e.b(z);
    }

    public final void setFeedbackDelegate(@Nullable SparkScanFeedbackDelegate sparkScanFeedbackDelegate) {
        this.feedbackDelegate = sparkScanFeedbackDelegate;
    }

    public final void setHandModeButtonVisible(boolean z) {
        this.e.d(z);
    }

    public final void setHapticModeButtonVisible(boolean z) {
        this.e.e(z);
    }

    public final void setListener(@Nullable SparkScanViewUiListener listener) {
        this.p.a(listener);
    }

    public final void setPreviewSizeControlVisible(boolean z) {
        this.h.a(z);
        this.p.g(z);
    }

    public final void setResumeCapturingText(@Nullable String str) {
        this.e.a(str);
    }

    public final void setScanningBehaviorButtonVisible(boolean z) {
        this.e.f(z);
    }

    public final void setScanningCapturingText(@Nullable String str) {
        this.e.b(str);
    }

    public final void setShouldShowScanAreaGuides(boolean z) {
        this.h.b(z);
    }

    public final void setShouldShowTargetModeHint(boolean z) {
    }

    public final void setSoundModeButtonVisible(boolean z) {
        this.e.g(z);
    }

    public final void setStartCapturingText(@Nullable String str) {
        this.e.c(str);
    }

    public final void setStopCapturingText(@Nullable String str) {
        this.e.d(str);
    }

    public final void setTargetModeButtonVisible(boolean z) {
        this.e.h(z);
    }

    public final void setTargetModeHintText(@Nullable String str) {
    }

    public final void setToolbarBackgroundColor(@Nullable Integer num) {
        this.e.d(num);
    }

    public final void setToolbarIconActiveTintColor(@Nullable Integer num) {
        this.e.e(num);
    }

    public final void setToolbarIconInactiveTintColor(@Nullable Integer num) {
        this.e.f(num);
    }

    public final void setTorchButtonVisible(boolean z) {
        this.e.i(z);
    }

    public final void setZoomSwitchControlVisible(boolean z) {
        this.h.d(z);
        this.p.j(z);
    }

    public final void showToast(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.p.b(text);
    }

    public final void startScanning() {
        this.p.U();
    }

    private static final void a(SparkScanView this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.p.P();
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SparkScanView newInstance(@NotNull View view, @NotNull DataCaptureContext dataCaptureContext, @NotNull SparkScan sparkScan, @NotNull SparkScanViewSettings sparkScanViewSettings) {
        return INSTANCE.newInstance(view, dataCaptureContext, sparkScan, sparkScanViewSettings);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.scandit.datacapture.barcode.spark.ui.SparkScanView$sparkScanEnableListener$1] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.scandit.datacapture.barcode.spark.ui.SparkScanView$modeViewListener$1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.scandit.datacapture.barcode.spark.ui.SparkScanView$orientationEventListener$1] */
    public SparkScanView(@NotNull View parentView, @NotNull DataCaptureContext dataCaptureContext, @NotNull SparkScan sparkScan, @NotNull SparkScanViewSettings settings, @NotNull SparkScanViewUISettings uiSettings, @NotNull SparkScanStateManager stateManager, @NotNull SparkScanViewCameraManager cameraManager, @NotNull SparkScanViewMiniPreview miniPreview, @NotNull SparkScanViewScanButtonTouchListener scanButtonTouchListener, @NotNull SparkScanViewScanButtonView sparkCaptureViewScanButtonView, @NotNull SparkScanFeedbackManager feedbackManager, @NotNull SparkScanViewToastPresenter toastPresenter, @NotNull SparkScanAnalyticsManager analyticsManager, @NotNull PropertyPushSource propertyPushSource) {
        super(parentView.getContext());
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(sparkScan, "sparkScan");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(uiSettings, "uiSettings");
        Intrinsics.h(stateManager, "stateManager");
        Intrinsics.h(cameraManager, "cameraManager");
        Intrinsics.h(miniPreview, "miniPreview");
        Intrinsics.h(scanButtonTouchListener, "scanButtonTouchListener");
        Intrinsics.h(sparkCaptureViewScanButtonView, "sparkCaptureViewScanButtonView");
        Intrinsics.h(feedbackManager, "feedbackManager");
        Intrinsics.h(toastPresenter, "toastPresenter");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(propertyPushSource, "propertyPushSource");
        this.b = dataCaptureContext;
        this.c = sparkScan;
        this.d = settings;
        this.e = uiSettings;
        this.f = stateManager;
        this.g = cameraManager;
        this.h = miniPreview;
        this.i = scanButtonTouchListener;
        this.j = sparkCaptureViewScanButtonView;
        this.k = feedbackManager;
        this.l = toastPresenter;
        this.m = analyticsManager;
        this.n = propertyPushSource;
        this.feedbackDelegate = new SparkScanFeedbackDelegate() { // from class: com.scandit.datacapture.barcode.spark.ui.SparkScanView$feedbackDelegate$1
            @Override // com.scandit.datacapture.barcode.spark.feedback.SparkScanFeedbackDelegate
            @NotNull
            public SparkScanBarcodeFeedback getFeedbackForBarcode(@NotNull Barcode barcode) {
                Intrinsics.h(barcode, "barcode");
                return new SparkScanBarcodeFeedback.Success(0, null, null, 7, null);
            }
        };
        NativeSparkScanStateMachine stateMachine = sparkScan.get_sparkScanInternal().a().getStateMachine();
        Intrinsics.g(stateMachine, "sparkScan._sparkScanInternal._impl().stateMachine");
        SparkScanViewPresenter sparkScanViewPresenter = new SparkScanViewPresenter(this, stateManager, sparkScan, settings, cameraManager, miniPreview, sparkCaptureViewScanButtonView, feedbackManager, toastPresenter, scanButtonTouchListener, analyticsManager, stateMachine);
        this.p = sparkScanViewPresenter;
        this.q = new SparkScanView$sparkScanCameraStartListener$1(this);
        this.r = new SparkScanEnableDisableListener() { // from class: com.scandit.datacapture.barcode.spark.ui.SparkScanView$sparkScanEnableListener$1
            @Override // com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanEnableDisableListener
            public void onEnabledChange(boolean isEnabled) {
                if (isEnabled) {
                    this.f18130a.startScanning();
                } else {
                    this.f18130a.pauseScanning();
                }
            }
        };
        final Context context = getContext();
        this.t = new OrientationEventListener(context) { // from class: com.scandit.datacapture.barcode.spark.ui.SparkScanView$orientationEventListener$1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                Context context2 = this.f18128a.getContext();
                Intrinsics.g(context2, "context");
                int rotation = ContextExtensionsKt.getRotation(context2);
                if (SparkScanView.access$didRotate180Degrees(this.f18128a, rotation)) {
                    this.f18128a.p.Q();
                }
                this.f18128a.s = rotation;
            }
        };
        this.u = new SparkScanModeViewListener() { // from class: com.scandit.datacapture.barcode.spark.ui.SparkScanView$modeViewListener$1
            @Override // com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanModeViewListener
            @NotNull
            public SparkScanScanningMode getScanningMode() {
                return this.f18127a.f.m();
            }

            @Override // com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanModeViewListener
            public boolean isZoomedIn() {
                return this.f18127a.f.u();
            }

            @Override // com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanModeViewListener
            public void onApplySettings(@NotNull SparkScanSettings settings2) {
                Intrinsics.h(settings2, "settings");
                this.f18127a.g.setBatterySavingMode(settings2.getBatterySaving());
            }
        };
        ((ViewGroup) parentView).addView(this, new ViewGroup.LayoutParams(-1, -1));
        setElevation(Gc.d());
        setOutlineProvider(null);
        bringToFront();
        if (settings.getCom.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED java.lang.String()) {
            HardwareButtonHelperKt.setupHardwareTrigger(this, settings.getCom.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE java.lang.String(), new a(sparkScanViewPresenter));
        }
        setId(Gc.y());
    }
}
