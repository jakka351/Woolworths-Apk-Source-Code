package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b[\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bj\u0010kJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003JÂ\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0002HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\u0013\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\b\"\u0004\b4\u00105R$\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u0010\b\"\u0004\b8\u00105R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010:\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<\"\u0004\bG\u0010>R*\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bH\u0010:\u0012\u0004\bK\u0010L\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010:\u001a\u0004\bN\u0010<\"\u0004\bO\u0010>R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010<\"\u0004\bR\u0010>R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<\"\u0004\bU\u0010>R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010:\u001a\u0004\bW\u0010<\"\u0004\bX\u0010>R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010:\u001a\u0004\bZ\u0010<\"\u0004\b[\u0010>R$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010:\u001a\u0004\b]\u0010<\"\u0004\b^\u0010>R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010:\u001a\u0004\b`\u0010<\"\u0004\ba\u0010>R\"\u0010i\u001a\u00020b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "", "", "toJson", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "toastEnabled", "toastBackgroundColor", "toastTextColor", "targetModeEnabledMessage", "targetModeDisabledMessage", "continuousModeEnabledMessage", "continuousModeDisabledMessage", "cameraTimeoutMessage", "scanPausedMessage", "zoomedInMessage", "zoomedOutMessage", "torchEnabledMessage", "torchDisabledMessage", "userFacingCameraEnabledMessage", "worldFacingCameraEnabledMessage", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "toString", "hashCode", "other", "equals", "a", "Z", "getToastEnabled", "()Z", "setToastEnabled", "(Z)V", "b", "Ljava/lang/Integer;", "getToastBackgroundColor", "setToastBackgroundColor", "(Ljava/lang/Integer;)V", "c", "getToastTextColor", "setToastTextColor", "d", "Ljava/lang/String;", "getTargetModeEnabledMessage", "()Ljava/lang/String;", "setTargetModeEnabledMessage", "(Ljava/lang/String;)V", "e", "getTargetModeDisabledMessage", "setTargetModeDisabledMessage", "f", "getContinuousModeEnabledMessage", "setContinuousModeEnabledMessage", "g", "getContinuousModeDisabledMessage", "setContinuousModeDisabledMessage", "h", "getCameraTimeoutMessage", "setCameraTimeoutMessage", "getCameraTimeoutMessage$annotations", "()V", "i", "getScanPausedMessage", "setScanPausedMessage", "j", "getZoomedInMessage", "setZoomedInMessage", "k", "getZoomedOutMessage", "setZoomedOutMessage", "l", "getTorchEnabledMessage", "setTorchEnabledMessage", "m", "getTorchDisabledMessage", "setTorchDisabledMessage", "n", "getUserFacingCameraEnabledMessage", "setUserFacingCameraEnabledMessage", "o", "getWorldFacingCameraEnabledMessage", "setWorldFacingCameraEnabledMessage", "Lcom/scandit/datacapture/core/time/TimeInterval;", "p", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getToastDuration$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setToastDuration$scandit_barcode_capture", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "toastDuration", "<init>", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class SparkScanToastSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean toastEnabled;

    /* renamed from: b, reason: from kotlin metadata */
    private Integer toastBackgroundColor;

    /* renamed from: c, reason: from kotlin metadata */
    private Integer toastTextColor;

    /* renamed from: d, reason: from kotlin metadata */
    private String targetModeEnabledMessage;

    /* renamed from: e, reason: from kotlin metadata */
    private String targetModeDisabledMessage;

    /* renamed from: f, reason: from kotlin metadata */
    private String continuousModeEnabledMessage;

    /* renamed from: g, reason: from kotlin metadata */
    private String continuousModeDisabledMessage;

    /* renamed from: h, reason: from kotlin metadata */
    private String cameraTimeoutMessage;

    /* renamed from: i, reason: from kotlin metadata */
    private String scanPausedMessage;

    /* renamed from: j, reason: from kotlin metadata */
    private String zoomedInMessage;

    /* renamed from: k, reason: from kotlin metadata */
    private String zoomedOutMessage;

    /* renamed from: l, reason: from kotlin metadata */
    private String torchEnabledMessage;

    /* renamed from: m, reason: from kotlin metadata */
    private String torchDisabledMessage;

    /* renamed from: n, reason: from kotlin metadata */
    private String userFacingCameraEnabledMessage;

    /* renamed from: o, reason: from kotlin metadata */
    private String worldFacingCameraEnabledMessage;

    /* renamed from: p, reason: from kotlin metadata */
    private TimeInterval toastDuration;

    public SparkScanToastSettings() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Deprecated
    public static /* synthetic */ void getCameraTimeoutMessage$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getToastEnabled() {
        return this.toastEnabled;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getZoomedInMessage() {
        return this.zoomedInMessage;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getZoomedOutMessage() {
        return this.zoomedOutMessage;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getTorchEnabledMessage() {
        return this.torchEnabledMessage;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getTorchDisabledMessage() {
        return this.torchDisabledMessage;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getUserFacingCameraEnabledMessage() {
        return this.userFacingCameraEnabledMessage;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getWorldFacingCameraEnabledMessage() {
        return this.worldFacingCameraEnabledMessage;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getToastBackgroundColor() {
        return this.toastBackgroundColor;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getToastTextColor() {
        return this.toastTextColor;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getTargetModeEnabledMessage() {
        return this.targetModeEnabledMessage;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getTargetModeDisabledMessage() {
        return this.targetModeDisabledMessage;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getContinuousModeEnabledMessage() {
        return this.continuousModeEnabledMessage;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getContinuousModeDisabledMessage() {
        return this.continuousModeDisabledMessage;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getCameraTimeoutMessage() {
        return this.cameraTimeoutMessage;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getScanPausedMessage() {
        return this.scanPausedMessage;
    }

    @NotNull
    public final SparkScanToastSettings copy(boolean toastEnabled, @Nullable Integer toastBackgroundColor, @Nullable Integer toastTextColor, @Nullable String targetModeEnabledMessage, @Nullable String targetModeDisabledMessage, @Nullable String continuousModeEnabledMessage, @Nullable String continuousModeDisabledMessage, @Nullable String cameraTimeoutMessage, @Nullable String scanPausedMessage, @Nullable String zoomedInMessage, @Nullable String zoomedOutMessage, @Nullable String torchEnabledMessage, @Nullable String torchDisabledMessage, @Nullable String userFacingCameraEnabledMessage, @Nullable String worldFacingCameraEnabledMessage) {
        return new SparkScanToastSettings(toastEnabled, toastBackgroundColor, toastTextColor, targetModeEnabledMessage, targetModeDisabledMessage, continuousModeEnabledMessage, continuousModeDisabledMessage, cameraTimeoutMessage, scanPausedMessage, zoomedInMessage, zoomedOutMessage, torchEnabledMessage, torchDisabledMessage, userFacingCameraEnabledMessage, worldFacingCameraEnabledMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SparkScanToastSettings)) {
            return false;
        }
        SparkScanToastSettings sparkScanToastSettings = (SparkScanToastSettings) other;
        return this.toastEnabled == sparkScanToastSettings.toastEnabled && Intrinsics.c(this.toastBackgroundColor, sparkScanToastSettings.toastBackgroundColor) && Intrinsics.c(this.toastTextColor, sparkScanToastSettings.toastTextColor) && Intrinsics.c(this.targetModeEnabledMessage, sparkScanToastSettings.targetModeEnabledMessage) && Intrinsics.c(this.targetModeDisabledMessage, sparkScanToastSettings.targetModeDisabledMessage) && Intrinsics.c(this.continuousModeEnabledMessage, sparkScanToastSettings.continuousModeEnabledMessage) && Intrinsics.c(this.continuousModeDisabledMessage, sparkScanToastSettings.continuousModeDisabledMessage) && Intrinsics.c(this.cameraTimeoutMessage, sparkScanToastSettings.cameraTimeoutMessage) && Intrinsics.c(this.scanPausedMessage, sparkScanToastSettings.scanPausedMessage) && Intrinsics.c(this.zoomedInMessage, sparkScanToastSettings.zoomedInMessage) && Intrinsics.c(this.zoomedOutMessage, sparkScanToastSettings.zoomedOutMessage) && Intrinsics.c(this.torchEnabledMessage, sparkScanToastSettings.torchEnabledMessage) && Intrinsics.c(this.torchDisabledMessage, sparkScanToastSettings.torchDisabledMessage) && Intrinsics.c(this.userFacingCameraEnabledMessage, sparkScanToastSettings.userFacingCameraEnabledMessage) && Intrinsics.c(this.worldFacingCameraEnabledMessage, sparkScanToastSettings.worldFacingCameraEnabledMessage);
    }

    @Nullable
    public final String getCameraTimeoutMessage() {
        return this.cameraTimeoutMessage;
    }

    @Nullable
    public final String getContinuousModeDisabledMessage() {
        return this.continuousModeDisabledMessage;
    }

    @Nullable
    public final String getContinuousModeEnabledMessage() {
        return this.continuousModeEnabledMessage;
    }

    @Nullable
    public final String getScanPausedMessage() {
        return this.scanPausedMessage;
    }

    @Nullable
    public final String getTargetModeDisabledMessage() {
        return this.targetModeDisabledMessage;
    }

    @Nullable
    public final String getTargetModeEnabledMessage() {
        return this.targetModeEnabledMessage;
    }

    @Nullable
    public final Integer getToastBackgroundColor() {
        return this.toastBackgroundColor;
    }

    @NotNull
    /* renamed from: getToastDuration$scandit_barcode_capture, reason: from getter */
    public final TimeInterval getToastDuration() {
        return this.toastDuration;
    }

    public final boolean getToastEnabled() {
        return this.toastEnabled;
    }

    @Nullable
    public final Integer getToastTextColor() {
        return this.toastTextColor;
    }

    @Nullable
    public final String getTorchDisabledMessage() {
        return this.torchDisabledMessage;
    }

    @Nullable
    public final String getTorchEnabledMessage() {
        return this.torchEnabledMessage;
    }

    @Nullable
    public final String getUserFacingCameraEnabledMessage() {
        return this.userFacingCameraEnabledMessage;
    }

    @Nullable
    public final String getWorldFacingCameraEnabledMessage() {
        return this.worldFacingCameraEnabledMessage;
    }

    @Nullable
    public final String getZoomedInMessage() {
        return this.zoomedInMessage;
    }

    @Nullable
    public final String getZoomedOutMessage() {
        return this.zoomedOutMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    public int hashCode() {
        boolean z = this.toastEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.toastBackgroundColor;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.toastTextColor;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.targetModeEnabledMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetModeDisabledMessage;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.continuousModeEnabledMessage;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.continuousModeDisabledMessage;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cameraTimeoutMessage;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.scanPausedMessage;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zoomedInMessage;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.zoomedOutMessage;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.torchEnabledMessage;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.torchDisabledMessage;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.userFacingCameraEnabledMessage;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.worldFacingCameraEnabledMessage;
        return iHashCode13 + (str12 != null ? str12.hashCode() : 0);
    }

    public final void setCameraTimeoutMessage(@Nullable String str) {
        this.cameraTimeoutMessage = str;
    }

    public final void setContinuousModeDisabledMessage(@Nullable String str) {
        this.continuousModeDisabledMessage = str;
    }

    public final void setContinuousModeEnabledMessage(@Nullable String str) {
        this.continuousModeEnabledMessage = str;
    }

    public final void setScanPausedMessage(@Nullable String str) {
        this.scanPausedMessage = str;
    }

    public final void setTargetModeDisabledMessage(@Nullable String str) {
        this.targetModeDisabledMessage = str;
    }

    public final void setTargetModeEnabledMessage(@Nullable String str) {
        this.targetModeEnabledMessage = str;
    }

    public final void setToastBackgroundColor(@Nullable Integer num) {
        this.toastBackgroundColor = num;
    }

    public final void setToastDuration$scandit_barcode_capture(@NotNull TimeInterval timeInterval) {
        Intrinsics.h(timeInterval, "<set-?>");
        this.toastDuration = timeInterval;
    }

    public final void setToastEnabled(boolean z) {
        this.toastEnabled = z;
    }

    public final void setToastTextColor(@Nullable Integer num) {
        this.toastTextColor = num;
    }

    public final void setTorchDisabledMessage(@Nullable String str) {
        this.torchDisabledMessage = str;
    }

    public final void setTorchEnabledMessage(@Nullable String str) {
        this.torchEnabledMessage = str;
    }

    public final void setUserFacingCameraEnabledMessage(@Nullable String str) {
        this.userFacingCameraEnabledMessage = str;
    }

    public final void setWorldFacingCameraEnabledMessage(@Nullable String str) {
        this.worldFacingCameraEnabledMessage = str;
    }

    public final void setZoomedInMessage(@Nullable String str) {
        this.zoomedInMessage = str;
    }

    public final void setZoomedOutMessage(@Nullable String str) {
        this.zoomedOutMessage = str;
    }

    @NotNull
    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("toastEnabled", this.toastEnabled);
        Integer num = this.toastBackgroundColor;
        if (num != null) {
            jSONObject.put("toastBackgroundColor", "#" + Integer.toHexString(num.intValue()));
        }
        Integer num2 = this.toastTextColor;
        if (num2 != null) {
            jSONObject.put("toastTextColor", "#" + Integer.toHexString(num2.intValue()));
        }
        jSONObject.put("targetModeEnabledMessage", this.targetModeEnabledMessage);
        jSONObject.put("targetModeDisabledMessage", this.targetModeDisabledMessage);
        jSONObject.put("continuousModeEnabledMessage", this.continuousModeEnabledMessage);
        jSONObject.put("continuousModeDisabledMessage", this.continuousModeDisabledMessage);
        jSONObject.put("scanPausedMessage", this.scanPausedMessage);
        jSONObject.put("zoomedInMessage", this.zoomedInMessage);
        jSONObject.put("zoomedOutMessage", this.zoomedOutMessage);
        jSONObject.put("torchEnabledMessage", this.torchEnabledMessage);
        jSONObject.put("torchDisabledMessage", this.torchDisabledMessage);
        jSONObject.put("userFacingCameraEnabledMessage", this.userFacingCameraEnabledMessage);
        jSONObject.put("worldFacingCameraEnabledMessage", this.worldFacingCameraEnabledMessage);
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …Message)\n    }.toString()");
        return string;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SparkScanToastSettings(toastEnabled=");
        sb.append(this.toastEnabled);
        sb.append(", toastBackgroundColor=");
        sb.append(this.toastBackgroundColor);
        sb.append(", toastTextColor=");
        sb.append(this.toastTextColor);
        sb.append(", targetModeEnabledMessage=");
        sb.append(this.targetModeEnabledMessage);
        sb.append(", targetModeDisabledMessage=");
        sb.append(this.targetModeDisabledMessage);
        sb.append(", continuousModeEnabledMessage=");
        sb.append(this.continuousModeEnabledMessage);
        sb.append(", continuousModeDisabledMessage=");
        sb.append(this.continuousModeDisabledMessage);
        sb.append(", cameraTimeoutMessage=");
        sb.append(this.cameraTimeoutMessage);
        sb.append(", scanPausedMessage=");
        sb.append(this.scanPausedMessage);
        sb.append(", zoomedInMessage=");
        sb.append(this.zoomedInMessage);
        sb.append(", zoomedOutMessage=");
        sb.append(this.zoomedOutMessage);
        sb.append(", torchEnabledMessage=");
        sb.append(this.torchEnabledMessage);
        sb.append(", torchDisabledMessage=");
        sb.append(this.torchDisabledMessage);
        sb.append(", userFacingCameraEnabledMessage=");
        sb.append(this.userFacingCameraEnabledMessage);
        sb.append(", worldFacingCameraEnabledMessage=");
        return androidx.camera.core.impl.b.r(sb, this.worldFacingCameraEnabledMessage, ')');
    }

    public SparkScanToastSettings(boolean z, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.toastEnabled = z;
        this.toastBackgroundColor = num;
        this.toastTextColor = num2;
        this.targetModeEnabledMessage = str;
        this.targetModeDisabledMessage = str2;
        this.continuousModeEnabledMessage = str3;
        this.continuousModeDisabledMessage = str4;
        this.cameraTimeoutMessage = str5;
        this.scanPausedMessage = str6;
        this.zoomedInMessage = str7;
        this.zoomedOutMessage = str8;
        this.torchEnabledMessage = str9;
        this.torchDisabledMessage = str10;
        this.userFacingCameraEnabledMessage = str11;
        this.worldFacingCameraEnabledMessage = str12;
        this.toastDuration = TimeInterval.INSTANCE.millis(1500L);
    }

    public /* synthetic */ SparkScanToastSettings(boolean z, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SparkScanViewDefaults.getDefaultToastEnabled() : z, (i & 2) != 0 ? SparkScanViewDefaults.getDefaultToastBackgroundColor() : num, (i & 4) != 0 ? SparkScanViewDefaults.getDefaultToastTextColor() : num2, (i & 8) != 0 ? SparkScanViewDefaults.getDefaultTargetModeEnabledMessage() : str, (i & 16) != 0 ? SparkScanViewDefaults.getDefaultTargetModeDisabledMessage() : str2, (i & 32) != 0 ? SparkScanViewDefaults.getDefaultContinuousModeEnabledMessage() : str3, (i & 64) != 0 ? SparkScanViewDefaults.getDefaultContinuousModeDisabledMessage() : str4, (i & 128) != 0 ? SparkScanViewDefaults.getDefaultCameraTimeOutMessage() : str5, (i & 256) != 0 ? SparkScanViewDefaults.getDefaultScanPausedMessage() : str6, (i & 512) != 0 ? SparkScanViewDefaults.getDefaultZoomedInMessage() : str7, (i & 1024) != 0 ? SparkScanViewDefaults.getDefaultZoomedOutMessage() : str8, (i & 2048) != 0 ? SparkScanViewDefaults.getDefaultTorchEnabledMessage() : str9, (i & 4096) != 0 ? SparkScanViewDefaults.getDefaultTorchDisabledMessage() : str10, (i & 8192) != 0 ? SparkScanViewDefaults.getDefaultUserFacingCameraEnabledMessage() : str11, (i & 16384) != 0 ? SparkScanViewDefaults.getDefaultWorldFacingCameraEnabledMessage() : str12);
    }
}
