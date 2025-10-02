package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreviewDimension;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeSerializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanViewHandModeSerializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumSerializer;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.source.TorchStateSerializer;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u008b\u00012\u00020\u0001:\u0002\u008b\u0001B\b¢\u0006\u0005\b\u0087\u0001\u0010\u0018BË\u0001\b\u0017\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010!\u001a\u00020\u001a\u0012\b\b\u0002\u0010)\u001a\u00020\"\u0012\b\b\u0002\u00101\u001a\u00020*\u0012\b\b\u0002\u00108\u001a\u00020\b\u0012\b\b\u0002\u0010<\u001a\u00020\b\u0012\b\b\u0002\u0010@\u001a\u00020\b\u0012\b\b\u0002\u0010D\u001a\u00020\b\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010O\u001a\u00020\b\u0012\b\b\u0002\u0010W\u001a\u00020P\u0012\b\b\u0002\u0010\\\u001a\u00020\b\u0012\b\b\u0002\u0010e\u001a\u00020]\u0012\b\b\u0002\u0010j\u001a\u00020]\u0012\b\b\u0002\u0010n\u001a\u00020\f\u0012\b\b\u0002\u0010r\u001a\u00020]\u0012\b\b\u0002\u0010v\u001a\u00020]\u0012\b\b\u0002\u0010~\u001a\u00020w¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001B\u0085\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010!\u001a\u00020\u001a\u0012\u0006\u0010)\u001a\u00020\"\u0012\u0006\u00101\u001a\u00020*\u0012\u0006\u00108\u001a\u00020\b\u0012\u0006\u0010<\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010D\u001a\u00020\b\u0012\b\u0010K\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010O\u001a\u00020\b\u0012\u0006\u0010W\u001a\u00020P\u0012\u0006\u0010\\\u001a\u00020\b\u0012\u0006\u0010e\u001a\u00020]\u0012\u0006\u0010j\u001a\u00020]¢\u0006\u0006\b\u0087\u0001\u0010\u0089\u0001B\u009d\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010!\u001a\u00020\u001a\u0012\u0006\u0010)\u001a\u00020\"\u0012\u0006\u00101\u001a\u00020*\u0012\u0006\u00108\u001a\u00020\b\u0012\u0006\u0010<\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010D\u001a\u00020\b\u0012\b\u0010K\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010O\u001a\u00020\b\u0012\u0006\u0010W\u001a\u00020P\u0012\u0006\u0010\\\u001a\u00020\b\u0012\u0006\u0010e\u001a\u00020]\u0012\u0006\u0010j\u001a\u00020]\u0012\u0006\u0010n\u001a\u00020\f\u0012\u0006\u0010r\u001a\u00020]\u0012\u0006\u0010v\u001a\u00020]¢\u0006\u0006\b\u0087\u0001\u0010\u008a\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u000e\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\"\u0010@\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00103\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\"\u0010D\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00103\u001a\u0004\bB\u00105\"\u0004\bC\u00107R$\u0010K\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u00103\u001a\u0004\bM\u00105\"\u0004\bN\u00107R\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR(\u0010\\\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bX\u00103\u0012\u0004\b[\u0010\u0018\u001a\u0004\bY\u00105\"\u0004\bZ\u00107R(\u0010e\u001a\u00020]8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bd\u0010\u0018\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010j\u001a\u00020]8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bf\u0010_\u0012\u0004\bi\u0010\u0018\u001a\u0004\bg\u0010a\"\u0004\bh\u0010cR\"\u0010n\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010\u000e\u001a\u0004\bl\u0010\u0010\"\u0004\bm\u0010\u0012R\"\u0010r\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010_\u001a\u0004\bp\u0010a\"\u0004\bq\u0010cR\"\u0010v\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010_\u001a\u0004\bt\u0010a\"\u0004\bu\u0010cR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u0086\u0001\u001a\u00020\u007f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "", "", "toJson", "clone$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "clone", "other", "", "equals", "", "hashCode", "Lcom/scandit/datacapture/core/time/TimeInterval;", "a", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getTriggerButtonCollapseTimeout", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setTriggerButtonCollapseTimeout", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "triggerButtonCollapseTimeout", "b", "getContinuousCaptureTimeout", "setContinuousCaptureTimeout", "getContinuousCaptureTimeout$annotations", "()V", "continuousCaptureTimeout", "Lcom/scandit/datacapture/core/source/TorchState;", "c", "Lcom/scandit/datacapture/core/source/TorchState;", "getDefaultTorchState", "()Lcom/scandit/datacapture/core/source/TorchState;", "setDefaultTorchState", "(Lcom/scandit/datacapture/core/source/TorchState;)V", "defaultTorchState", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "d", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "getDefaultScanningMode", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "setDefaultScanningMode", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;)V", "defaultScanningMode", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "e", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "getDefaultHandMode", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "setDefaultHandMode", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;)V", "defaultHandMode", "f", "Z", "getHoldToScanEnabled", "()Z", "setHoldToScanEnabled", "(Z)V", "holdToScanEnabled", "g", "getSoundEnabled", "setSoundEnabled", "soundEnabled", "h", "getHapticEnabled", "setHapticEnabled", "hapticEnabled", "i", "getHardwareTriggerEnabled", "setHardwareTriggerEnabled", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, "j", "Ljava/lang/Integer;", "getHardwareTriggerKeyCode", "()Ljava/lang/Integer;", "setHardwareTriggerKeyCode", "(Ljava/lang/Integer;)V", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "k", "getVisualFeedbackEnabled", "setVisualFeedbackEnabled", "visualFeedbackEnabled", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "l", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "getToastSettings", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "setToastSettings", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;)V", "toastSettings", "m", "getIgnoreDragLimits", "setIgnoreDragLimits", "getIgnoreDragLimits$annotations", "ignoreDragLimits", "", "n", "F", "getTargetZoomFactorOut", "()F", "setTargetZoomFactorOut", "(F)V", "getTargetZoomFactorOut$annotations", "targetZoomFactorOut", "o", "getTargetZoomFactorIn", "setTargetZoomFactorIn", "getTargetZoomFactorIn$annotations", "targetZoomFactorIn", "p", "getInactiveStateTimeout", "setInactiveStateTimeout", "inactiveStateTimeout", "q", "getZoomFactorOut", "setZoomFactorOut", "zoomFactorOut", "r", "getZoomFactorIn", "setZoomFactorIn", "zoomFactorIn", "Lcom/scandit/datacapture/core/source/CameraPosition;", "s", "Lcom/scandit/datacapture/core/source/CameraPosition;", "getDefaultCameraPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "setDefaultCameraPosition", "(Lcom/scandit/datacapture/core/source/CameraPosition;)V", "defaultCameraPosition", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreviewDimension;", "t", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreviewDimension;", "getPreviewDimension$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreviewDimension;", "setPreviewDimension$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreviewDimension;)V", "previewDimension", "<init>", "(Lcom/scandit/datacapture/core/time/TimeInterval;Lcom/scandit/datacapture/core/time/TimeInterval;Lcom/scandit/datacapture/core/source/TorchState;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;ZZZZLjava/lang/Integer;ZLcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;ZFFLcom/scandit/datacapture/core/time/TimeInterval;FFLcom/scandit/datacapture/core/source/CameraPosition;)V", "(Lcom/scandit/datacapture/core/time/TimeInterval;Lcom/scandit/datacapture/core/time/TimeInterval;Lcom/scandit/datacapture/core/source/TorchState;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;ZZZZLjava/lang/Integer;ZLcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;ZFF)V", "(Lcom/scandit/datacapture/core/time/TimeInterval;Lcom/scandit/datacapture/core/time/TimeInterval;Lcom/scandit/datacapture/core/source/TorchState;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;ZZZZLjava/lang/Integer;ZLcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;ZFFLcom/scandit/datacapture/core/time/TimeInterval;FF)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SparkScanViewSettings {
    private static final SparkScanViewHandMode A;
    private static final SparkScanToastSettings B;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final SparkScanScanningMode.Default u = new SparkScanScanningMode.Default(SparkScanScanningBehavior.SINGLE, SparkScanPreviewBehavior.DEFAULT);
    private static final TimeInterval v;
    private static final CameraPosition w;
    private static final TimeInterval x;
    private static final TimeInterval y;
    private static final TorchState z;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TimeInterval triggerButtonCollapseTimeout;

    /* renamed from: b, reason: from kotlin metadata */
    private TimeInterval continuousCaptureTimeout;

    /* renamed from: c, reason: from kotlin metadata */
    private TorchState defaultTorchState;

    /* renamed from: d, reason: from kotlin metadata */
    private SparkScanScanningMode defaultScanningMode;

    /* renamed from: e, reason: from kotlin metadata */
    private SparkScanViewHandMode defaultHandMode;

    /* renamed from: f, reason: from kotlin metadata */
    private boolean holdToScanEnabled;

    /* renamed from: g, reason: from kotlin metadata */
    private boolean soundEnabled;

    /* renamed from: h, reason: from kotlin metadata */
    private boolean hapticEnabled;

    /* renamed from: i, reason: from kotlin metadata */
    private boolean hardwareTriggerEnabled;

    /* renamed from: j, reason: from kotlin metadata */
    private Integer hardwareTriggerKeyCode;

    /* renamed from: k, reason: from kotlin metadata */
    private boolean visualFeedbackEnabled;

    /* renamed from: l, reason: from kotlin metadata */
    private SparkScanToastSettings toastSettings;

    /* renamed from: m, reason: from kotlin metadata */
    private boolean ignoreDragLimits;

    /* renamed from: n, reason: from kotlin metadata */
    private float targetZoomFactorOut;

    /* renamed from: o, reason: from kotlin metadata */
    private float targetZoomFactorIn;

    /* renamed from: p, reason: from kotlin metadata */
    private TimeInterval inactiveStateTimeout;

    /* renamed from: q, reason: from kotlin metadata */
    private float zoomFactorOut;

    /* renamed from: r, reason: from kotlin metadata */
    private float zoomFactorIn;

    /* renamed from: s, reason: from kotlin metadata */
    private CameraPosition defaultCameraPosition;

    /* renamed from: t, reason: from kotlin metadata */
    private /* synthetic */ SparkScanViewMiniPreviewDimension previewDimension;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings$Companion;", "", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "DEFAULT_SCANNING_MODE", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "getDEFAULT_SCANNING_MODE", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "Lcom/scandit/datacapture/core/source/CameraPosition;", "CAMERA_POSITION_DEFAULT", "Lcom/scandit/datacapture/core/source/CameraPosition;", "Lcom/scandit/datacapture/core/time/TimeInterval;", "CONTINUOUS_CAPTURE_TIMEOUT_DEFAULT", "Lcom/scandit/datacapture/core/time/TimeInterval;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "HAND_MODE_DEFAULT", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "", "HAPTIC_ENABLED_DEFAULT", "Z", "HOLD_TO_SCAN_ENABLED_DEFAULT", "HW_TRIGGER_ENABLED_DEFAULT", "", "HW_TRIGGER_KEYCODE_DEFAULT", "Ljava/lang/Integer;", "IGNORE_DRAG_LIMITS_DEFAULT", "INACTIVE_STATE_TIMEOUT_DEFAULT", "SOUND_ENABLED_DEFAULT", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "TOAST_SETTINGS_DEFAULT", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "Lcom/scandit/datacapture/core/source/TorchState;", "TORCH_STATE_DEFAULT", "Lcom/scandit/datacapture/core/source/TorchState;", "TRIGGER_BUTTON_COLLAPSE_DEFAULT", "VISUAL_FEEDBACK_ENABLED_DEFAULT", "", "ZOOM_FACTOR_IN_DEFAULT", "F", "ZOOM_FACTOR_OUT_DEFAULT", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SparkScanScanningMode.Default getDEFAULT_SCANNING_MODE() {
            return SparkScanViewSettings.u;
        }

        private Companion() {
        }
    }

    static {
        TimeInterval.Companion companion = TimeInterval.INSTANCE;
        v = companion.seconds(10.0f);
        w = CameraPosition.WORLD_FACING;
        x = companion.seconds(-1.0f);
        y = companion.seconds(60.0f);
        z = TorchState.OFF;
        A = SparkScanViewHandMode.RIGHT;
        B = new SparkScanToastSettings(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public SparkScanViewSettings() {
        this.triggerButtonCollapseTimeout = x;
        this.continuousCaptureTimeout = y;
        this.defaultTorchState = z;
        this.defaultScanningMode = u;
        this.defaultHandMode = A;
        this.holdToScanEnabled = true;
        this.soundEnabled = true;
        this.hapticEnabled = true;
        this.hardwareTriggerKeyCode = null;
        this.visualFeedbackEnabled = true;
        this.toastSettings = B;
        this.ignoreDragLimits = true;
        this.targetZoomFactorOut = 1.0f;
        this.targetZoomFactorIn = 2.0f;
        this.inactiveStateTimeout = v;
        this.zoomFactorOut = 1.0f;
        this.zoomFactorIn = 2.0f;
        this.defaultCameraPosition = w;
        this.previewDimension = SparkScanViewMiniPreviewDimension.SMALL;
    }

    @Deprecated
    public static /* synthetic */ void getContinuousCaptureTimeout$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getIgnoreDragLimits$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getTargetZoomFactorIn$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getTargetZoomFactorOut$annotations() {
    }

    public final /* synthetic */ SparkScanViewSettings clone$scandit_barcode_capture() {
        SparkScanViewSettings sparkScanViewSettings = new SparkScanViewSettings();
        sparkScanViewSettings.triggerButtonCollapseTimeout = this.triggerButtonCollapseTimeout;
        sparkScanViewSettings.inactiveStateTimeout = this.inactiveStateTimeout;
        sparkScanViewSettings.defaultTorchState = this.defaultTorchState;
        sparkScanViewSettings.defaultScanningMode = this.defaultScanningMode;
        sparkScanViewSettings.defaultHandMode = this.defaultHandMode;
        sparkScanViewSettings.holdToScanEnabled = this.holdToScanEnabled;
        sparkScanViewSettings.soundEnabled = this.soundEnabled;
        sparkScanViewSettings.hapticEnabled = this.hapticEnabled;
        sparkScanViewSettings.hardwareTriggerEnabled = this.hardwareTriggerEnabled;
        sparkScanViewSettings.hardwareTriggerKeyCode = this.hardwareTriggerKeyCode;
        sparkScanViewSettings.visualFeedbackEnabled = this.visualFeedbackEnabled;
        sparkScanViewSettings.toastSettings = this.toastSettings;
        sparkScanViewSettings.zoomFactorIn = this.zoomFactorIn;
        sparkScanViewSettings.zoomFactorOut = this.zoomFactorOut;
        sparkScanViewSettings.defaultCameraPosition = this.defaultCameraPosition;
        return sparkScanViewSettings;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!SparkScanViewSettings.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings");
        SparkScanViewSettings sparkScanViewSettings = (SparkScanViewSettings) other;
        return Intrinsics.c(this.triggerButtonCollapseTimeout, sparkScanViewSettings.triggerButtonCollapseTimeout) && this.defaultTorchState == sparkScanViewSettings.defaultTorchState && Intrinsics.c(this.defaultScanningMode, sparkScanViewSettings.defaultScanningMode) && this.defaultHandMode == sparkScanViewSettings.defaultHandMode && this.holdToScanEnabled == sparkScanViewSettings.holdToScanEnabled && this.soundEnabled == sparkScanViewSettings.soundEnabled && this.hapticEnabled == sparkScanViewSettings.hapticEnabled && this.hardwareTriggerEnabled == sparkScanViewSettings.hardwareTriggerEnabled && Intrinsics.c(this.hardwareTriggerKeyCode, sparkScanViewSettings.hardwareTriggerKeyCode) && this.visualFeedbackEnabled == sparkScanViewSettings.visualFeedbackEnabled && Intrinsics.c(this.toastSettings, sparkScanViewSettings.toastSettings) && Intrinsics.c(this.inactiveStateTimeout, sparkScanViewSettings.inactiveStateTimeout) && this.zoomFactorOut == sparkScanViewSettings.zoomFactorOut && this.zoomFactorIn == sparkScanViewSettings.zoomFactorIn && this.defaultCameraPosition == sparkScanViewSettings.defaultCameraPosition;
    }

    @NotNull
    public final TimeInterval getContinuousCaptureTimeout() {
        return this.continuousCaptureTimeout;
    }

    @NotNull
    public final CameraPosition getDefaultCameraPosition() {
        return this.defaultCameraPosition;
    }

    @NotNull
    public final SparkScanViewHandMode getDefaultHandMode() {
        return this.defaultHandMode;
    }

    @NotNull
    public final SparkScanScanningMode getDefaultScanningMode() {
        return this.defaultScanningMode;
    }

    @NotNull
    public final TorchState getDefaultTorchState() {
        return this.defaultTorchState;
    }

    public final boolean getHapticEnabled() {
        return this.hapticEnabled;
    }

    public final boolean getHardwareTriggerEnabled() {
        return this.hardwareTriggerEnabled;
    }

    @Nullable
    public final Integer getHardwareTriggerKeyCode() {
        return this.hardwareTriggerKeyCode;
    }

    public final boolean getHoldToScanEnabled() {
        return this.holdToScanEnabled;
    }

    public final boolean getIgnoreDragLimits() {
        return this.ignoreDragLimits;
    }

    @NotNull
    public final TimeInterval getInactiveStateTimeout() {
        return this.inactiveStateTimeout;
    }

    @NotNull
    /* renamed from: getPreviewDimension$scandit_barcode_capture, reason: from getter */
    public final SparkScanViewMiniPreviewDimension getPreviewDimension() {
        return this.previewDimension;
    }

    public final boolean getSoundEnabled() {
        return this.soundEnabled;
    }

    public final float getTargetZoomFactorIn() {
        return this.targetZoomFactorIn;
    }

    public final float getTargetZoomFactorOut() {
        return this.targetZoomFactorOut;
    }

    @NotNull
    public final SparkScanToastSettings getToastSettings() {
        return this.toastSettings;
    }

    @NotNull
    public final TimeInterval getTriggerButtonCollapseTimeout() {
        return this.triggerButtonCollapseTimeout;
    }

    public final boolean getVisualFeedbackEnabled() {
        return this.visualFeedbackEnabled;
    }

    public final float getZoomFactorIn() {
        return this.zoomFactorIn;
    }

    public final float getZoomFactorOut() {
        return this.zoomFactorOut;
    }

    public int hashCode() {
        int iE = androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((this.defaultHandMode.hashCode() + ((this.defaultScanningMode.hashCode() + ((this.defaultTorchState.hashCode() + (this.triggerButtonCollapseTimeout.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.holdToScanEnabled), 31, this.soundEnabled), 31, this.hapticEnabled), 31, this.hardwareTriggerEnabled);
        Integer num = this.hardwareTriggerKeyCode;
        return this.defaultCameraPosition.hashCode() + android.support.v4.media.session.a.b(this.zoomFactorIn, android.support.v4.media.session.a.b(this.zoomFactorOut, (this.inactiveStateTimeout.hashCode() + ((this.toastSettings.hashCode() + androidx.camera.core.impl.b.e((iE + (num != null ? num.intValue() : 0)) * 31, 31, this.visualFeedbackEnabled)) * 31)) * 31, 31), 31);
    }

    public final void setContinuousCaptureTimeout(@NotNull TimeInterval timeInterval) {
        Intrinsics.h(timeInterval, "<set-?>");
        this.continuousCaptureTimeout = timeInterval;
    }

    public final void setDefaultCameraPosition(@NotNull CameraPosition cameraPosition) {
        Intrinsics.h(cameraPosition, "<set-?>");
        this.defaultCameraPosition = cameraPosition;
    }

    public final void setDefaultHandMode(@NotNull SparkScanViewHandMode sparkScanViewHandMode) {
        Intrinsics.h(sparkScanViewHandMode, "<set-?>");
        this.defaultHandMode = sparkScanViewHandMode;
    }

    public final void setDefaultScanningMode(@NotNull SparkScanScanningMode sparkScanScanningMode) {
        Intrinsics.h(sparkScanScanningMode, "<set-?>");
        this.defaultScanningMode = sparkScanScanningMode;
    }

    public final void setDefaultTorchState(@NotNull TorchState torchState) {
        Intrinsics.h(torchState, "<set-?>");
        this.defaultTorchState = torchState;
    }

    public final void setHapticEnabled(boolean z2) {
        this.hapticEnabled = z2;
    }

    public final void setHardwareTriggerEnabled(boolean z2) {
        this.hardwareTriggerEnabled = z2;
    }

    public final void setHardwareTriggerKeyCode(@Nullable Integer num) {
        this.hardwareTriggerKeyCode = num;
    }

    public final void setHoldToScanEnabled(boolean z2) {
        this.holdToScanEnabled = z2;
    }

    public final void setIgnoreDragLimits(boolean z2) {
        this.ignoreDragLimits = z2;
    }

    public final void setInactiveStateTimeout(@NotNull TimeInterval timeInterval) {
        Intrinsics.h(timeInterval, "<set-?>");
        this.inactiveStateTimeout = timeInterval;
    }

    public final void setPreviewDimension$scandit_barcode_capture(@NotNull SparkScanViewMiniPreviewDimension sparkScanViewMiniPreviewDimension) {
        Intrinsics.h(sparkScanViewMiniPreviewDimension, "<set-?>");
        this.previewDimension = sparkScanViewMiniPreviewDimension;
    }

    public final void setSoundEnabled(boolean z2) {
        this.soundEnabled = z2;
    }

    public final void setTargetZoomFactorIn(float f) {
        this.targetZoomFactorIn = f;
    }

    public final void setTargetZoomFactorOut(float f) {
        this.targetZoomFactorOut = f;
    }

    public final void setToastSettings(@NotNull SparkScanToastSettings sparkScanToastSettings) {
        Intrinsics.h(sparkScanToastSettings, "<set-?>");
        this.toastSettings = sparkScanToastSettings;
    }

    public final void setTriggerButtonCollapseTimeout(@NotNull TimeInterval timeInterval) {
        Intrinsics.h(timeInterval, "<set-?>");
        this.triggerButtonCollapseTimeout = timeInterval;
    }

    public final void setVisualFeedbackEnabled(boolean z2) {
        this.visualFeedbackEnabled = z2;
    }

    public final void setZoomFactorIn(float f) {
        this.zoomFactorIn = f;
    }

    public final void setZoomFactorOut(float f) {
        this.zoomFactorOut = f;
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("triggerButtonCollapseTimeout", Float.valueOf(this.triggerButtonCollapseTimeout.getF18874a()));
        jSONObject.put("inactiveStateTimeout", Float.valueOf(this.inactiveStateTimeout.getF18874a()));
        jSONObject.put("defaultTorchState", TorchStateSerializer.toJson(this.defaultTorchState));
        jSONObject.put("defaultScanningMode", SparkScanScanningModeSerializer.toJson(this.defaultScanningMode));
        jSONObject.put("defaultHandMode", SparkScanViewHandModeSerializer.toJson(this.defaultHandMode));
        jSONObject.put("holdToScanEnabled", this.holdToScanEnabled);
        jSONObject.put("soundEnabled", this.soundEnabled);
        jSONObject.put("hapticEnabled", this.hapticEnabled);
        jSONObject.put(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, this.hardwareTriggerEnabled);
        jSONObject.put(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, this.hardwareTriggerKeyCode);
        jSONObject.put("visualFeedbackEnabled", this.visualFeedbackEnabled);
        jSONObject.put("toastSettings", this.toastSettings.toJson());
        jSONObject.put("ignoreDragLimits", true);
        jSONObject.put("zoomFactorIn", Float.valueOf(this.zoomFactorIn));
        jSONObject.put("zoomFactorOut", Float.valueOf(this.zoomFactorOut));
        jSONObject.put("defaultCameraPosition", NativeEnumSerializer.cameraPositionToString(this.defaultCameraPosition));
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …       )\n    }.toString()");
        return string;
    }

    public /* synthetic */ SparkScanViewSettings(TimeInterval timeInterval, TimeInterval timeInterval2, TorchState torchState, SparkScanScanningMode sparkScanScanningMode, SparkScanViewHandMode sparkScanViewHandMode, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, boolean z6, SparkScanToastSettings sparkScanToastSettings, boolean z7, float f, float f2, TimeInterval timeInterval3, float f3, float f4, CameraPosition cameraPosition, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? x : timeInterval, (i & 2) != 0 ? y : timeInterval2, (i & 4) != 0 ? z : torchState, (i & 8) != 0 ? u : sparkScanScanningMode, (i & 16) != 0 ? A : sparkScanViewHandMode, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? true : z4, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? true : z6, (i & 2048) != 0 ? B : sparkScanToastSettings, (i & 4096) == 0 ? z7 : true, (i & 8192) != 0 ? 1.0f : f, (i & 16384) != 0 ? 2.0f : f2, (i & 32768) != 0 ? v : timeInterval3, (i & 65536) != 0 ? 1.0f : f3, (i & 131072) == 0 ? f4 : 2.0f, (i & 262144) != 0 ? w : cameraPosition);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public SparkScanViewSettings(@NotNull TimeInterval triggerButtonCollapseTimeout, @NotNull TimeInterval continuousCaptureTimeout, @NotNull TorchState defaultTorchState, @NotNull SparkScanScanningMode defaultScanningMode, @NotNull SparkScanViewHandMode defaultHandMode, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable Integer num, boolean z6, @NotNull SparkScanToastSettings toastSettings, boolean z7, float f, float f2, @NotNull TimeInterval inactiveStateTimeout, float f3, float f4, @NotNull CameraPosition defaultCameraPosition) {
        this();
        Intrinsics.h(triggerButtonCollapseTimeout, "triggerButtonCollapseTimeout");
        Intrinsics.h(continuousCaptureTimeout, "continuousCaptureTimeout");
        Intrinsics.h(defaultTorchState, "defaultTorchState");
        Intrinsics.h(defaultScanningMode, "defaultScanningMode");
        Intrinsics.h(defaultHandMode, "defaultHandMode");
        Intrinsics.h(toastSettings, "toastSettings");
        Intrinsics.h(inactiveStateTimeout, "inactiveStateTimeout");
        Intrinsics.h(defaultCameraPosition, "defaultCameraPosition");
        this.triggerButtonCollapseTimeout = triggerButtonCollapseTimeout;
        this.defaultTorchState = defaultTorchState;
        this.defaultScanningMode = defaultScanningMode;
        this.defaultHandMode = defaultHandMode;
        this.holdToScanEnabled = z2;
        this.soundEnabled = z3;
        this.hapticEnabled = z4;
        this.hardwareTriggerEnabled = z5;
        this.hardwareTriggerKeyCode = num;
        this.visualFeedbackEnabled = z6;
        this.toastSettings = toastSettings;
        this.inactiveStateTimeout = inactiveStateTimeout;
        this.zoomFactorOut = f3;
        this.zoomFactorIn = f4;
        this.defaultCameraPosition = defaultCameraPosition;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public SparkScanViewSettings(@NotNull TimeInterval triggerButtonCollapseTimeout, @NotNull TimeInterval continuousCaptureTimeout, @NotNull TorchState defaultTorchState, @NotNull SparkScanScanningMode defaultScanningMode, @NotNull SparkScanViewHandMode defaultHandMode, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable Integer num, boolean z6, @NotNull SparkScanToastSettings toastSettings, boolean z7, float f, float f2) {
        this(triggerButtonCollapseTimeout, continuousCaptureTimeout, defaultTorchState, defaultScanningMode, defaultHandMode, z2, z3, z4, z5, num, z6, toastSettings, z7, f, f2, v, 1.0f, 2.0f, w);
        Intrinsics.h(triggerButtonCollapseTimeout, "triggerButtonCollapseTimeout");
        Intrinsics.h(continuousCaptureTimeout, "continuousCaptureTimeout");
        Intrinsics.h(defaultTorchState, "defaultTorchState");
        Intrinsics.h(defaultScanningMode, "defaultScanningMode");
        Intrinsics.h(defaultHandMode, "defaultHandMode");
        Intrinsics.h(toastSettings, "toastSettings");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public SparkScanViewSettings(@NotNull TimeInterval triggerButtonCollapseTimeout, @NotNull TimeInterval continuousCaptureTimeout, @NotNull TorchState defaultTorchState, @NotNull SparkScanScanningMode defaultScanningMode, @NotNull SparkScanViewHandMode defaultHandMode, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable Integer num, boolean z6, @NotNull SparkScanToastSettings toastSettings, boolean z7, float f, float f2, @NotNull TimeInterval inactiveStateTimeout, float f3, float f4) {
        this(triggerButtonCollapseTimeout, continuousCaptureTimeout, defaultTorchState, defaultScanningMode, defaultHandMode, z2, z3, z4, z5, num, z6, toastSettings, z7, f, f2, inactiveStateTimeout, f3, f4, w);
        Intrinsics.h(triggerButtonCollapseTimeout, "triggerButtonCollapseTimeout");
        Intrinsics.h(continuousCaptureTimeout, "continuousCaptureTimeout");
        Intrinsics.h(defaultTorchState, "defaultTorchState");
        Intrinsics.h(defaultScanningMode, "defaultScanningMode");
        Intrinsics.h(defaultHandMode, "defaultHandMode");
        Intrinsics.h(toastSettings, "toastSettings");
        Intrinsics.h(inactiveStateTimeout, "inactiveStateTimeout");
    }
}
