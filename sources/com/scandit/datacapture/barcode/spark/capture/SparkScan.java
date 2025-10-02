package com.scandit.datacapture.barcode.spark.capture;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.AbstractC0851ta;
import com.scandit.datacapture.barcode.InterfaceC0874ua;
import com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanEnableDisableListener;
import com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanModeViewListener;
import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanFeedback;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanDeserializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyPushSource;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0019\b\u0001\u0012\u0006\u0010W\u001a\u00020B\u0012\u0006\u0010/\u001a\u00020\r¢\u0006\u0004\bX\u0010YB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bX\u0010.B\t\b\u0016¢\u0006\u0004\bX\u0010\u0011J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u0011J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020&J\u000e\u0010(\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020&R\"\u0010/\u001a\u00020\r8\u0001@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R.\u00108\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010A\u001a\u0002098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010\u0011\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010G\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR.\u0010O\u001a\u0004\u0018\u00010H2\b\u00101\u001a\u0004\u0018\u00010H8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0013\u0010S\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR$\u0010T\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u0006¨\u0006["}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "", "", "enabled", "", "setSingleScanModeEnabled$scandit_barcode_capture", "(Z)V", "setSingleScanModeEnabled", "Lcom/scandit/datacapture/core/internal/sdk/analytics/NativePropertyPushSource;", "propertyPushSource", "setPropertyPushSource$scandit_barcode_capture", "(Lcom/scandit/datacapture/core/internal/sdk/analytics/NativePropertyPushSource;)V", "setPropertyPushSource", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;", "settings", "applySettings", "_applySettings$scandit_barcode_capture", "()V", "_applySettings", "_startManualFilterForLastScannedBarcodes$scandit_barcode_capture", "_startManualFilterForLastScannedBarcodes", "Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanEnableDisableListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "_addEnableDisableListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanEnableDisableListener;)V", "_addEnableDisableListener", "_removeEnableDisableListener$scandit_barcode_capture", "_removeEnableDisableListener", "_disable$scandit_barcode_capture", "_disable", "_enable$scandit_barcode_capture", "_enable", "zoomedIn", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "scanningMode", "_applyNewSettingsForScanningModeAndZoomLevel$scandit_barcode_capture", "(ZLcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;)V", "_applyNewSettingsForScanningModeAndZoomLevel", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanListener;", "addListener", "removeListener", "a", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;", "getSparkScanSettings$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;", "setSparkScanSettings$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;)V", "sparkScanSettings", "Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanModeViewListener;", "value", "b", "Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanModeViewListener;", "get_sparkScanModeViewListener$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanModeViewListener;", "set_sparkScanModeViewListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanModeViewListener;)V", "_sparkScanModeViewListener", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedback;", "c", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedback;", "getFeedback", "()Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedback;", "setFeedback", "(Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedback;)V", "getFeedback$annotations", "feedback", "Lcom/scandit/datacapture/barcode/internal/module/spark/internal/SparkScanInternal;", "f", "Lcom/scandit/datacapture/barcode/internal/module/spark/internal/SparkScanInternal;", "get_sparkScanInternal$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/spark/internal/SparkScanInternal;", "_sparkScanInternal", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "g", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getDataCaptureContext$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "setDataCaptureContext$scandit_barcode_capture", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanLicenseInfo;", "getSparkScanLicenseInfo", "()Lcom/scandit/datacapture/barcode/spark/capture/SparkScanLicenseInfo;", "sparkScanLicenseInfo", "isEnabled", "()Z", "setEnabled", "sparkScanInternal", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/spark/internal/SparkScanInternal;Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SparkScan {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SparkScanSettings sparkScanSettings;

    /* renamed from: b, reason: from kotlin metadata */
    private /* synthetic */ SparkScanModeViewListener _sparkScanModeViewListener;

    /* renamed from: c, reason: from kotlin metadata */
    private SparkScanFeedback feedback;
    private final CopyOnWriteArrayList d;
    private final CopyOnWriteArrayList e;

    /* renamed from: f, reason: from kotlin metadata */
    private final SparkScanInternal _sparkScanInternal;

    /* renamed from: g, reason: from kotlin metadata */
    private DataCaptureContext dataCaptureContext;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScan$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SparkScan fromJson(@NotNull String jsonData) {
            Intrinsics.h(jsonData, "jsonData");
            return new SparkScanDeserializer().modeFromJson(jsonData);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.scandit.datacapture.barcode.spark.capture.SparkScan$sparkScanListenerInternal$1] */
    @VisibleForTesting
    public SparkScan(@NotNull SparkScanInternal sparkScanInternal, @NotNull SparkScanSettings sparkScanSettings) {
        Intrinsics.h(sparkScanInternal, "sparkScanInternal");
        Intrinsics.h(sparkScanSettings, "sparkScanSettings");
        this.sparkScanSettings = sparkScanSettings;
        ?? r3 = new InterfaceC0874ua() { // from class: com.scandit.datacapture.barcode.spark.capture.SparkScan$sparkScanListenerInternal$1
            @Override // com.scandit.datacapture.barcode.InterfaceC0874ua
            public void onBarcodeScanned(@NotNull SparkScanInternal sparkScan, @NotNull SparkScanSession session, @NotNull FrameData data) {
                Intrinsics.h(sparkScan, "sparkScan");
                Intrinsics.h(session, "session");
                Intrinsics.h(data, "data");
                Collection collection = this.f18084a.d;
                SparkScan sparkScan2 = this.f18084a;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((SparkScanListener) it.next()).onBarcodeScanned(sparkScan2, session, data);
                }
            }

            @Override // com.scandit.datacapture.barcode.InterfaceC0874ua
            @ProxyFunction
            public void onObservationStarted(@NotNull SparkScanInternal sparkScan) {
                Intrinsics.h(sparkScan, "sparkScan");
            }

            @Override // com.scandit.datacapture.barcode.InterfaceC0874ua
            @ProxyFunction
            public void onObservationStopped(@NotNull SparkScanInternal sparkScan) {
                Intrinsics.h(sparkScan, "sparkScan");
            }

            @Override // com.scandit.datacapture.barcode.InterfaceC0874ua
            public void onSessionUpdated(@NotNull SparkScanInternal sparkScan, @NotNull SparkScanSession session, @NotNull FrameData data) {
                Intrinsics.h(sparkScan, "sparkScan");
                Intrinsics.h(session, "session");
                Intrinsics.h(data, "data");
                Collection collection = this.f18084a.d;
                SparkScan sparkScan2 = this.f18084a;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((SparkScanListener) it.next()).onSessionUpdated(sparkScan2, session, data);
                }
            }
        };
        this.feedback = SparkScanFeedback.INSTANCE.defaultFeedback();
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        sparkScanInternal.setEnabled(false);
        sparkScanInternal.a((SparkScan$sparkScanListenerInternal$1) r3);
        this._sparkScanInternal = sparkScanInternal;
    }

    @JvmStatic
    @NotNull
    public static final SparkScan fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @Deprecated
    public static /* synthetic */ void getFeedback$annotations() {
    }

    public final void _addEnableDisableListener$scandit_barcode_capture(@NotNull SparkScanEnableDisableListener listener) {
        Intrinsics.h(listener, "listener");
        this.e.add(listener);
    }

    public final void _applyNewSettingsForScanningModeAndZoomLevel$scandit_barcode_capture(boolean zoomedIn, @NotNull SparkScanScanningMode scanningMode) {
        Intrinsics.h(scanningMode, "scanningMode");
        this.sparkScanSettings._applySettingsForScanningModeAndZoomLevel$scandit_barcode_capture(zoomedIn, scanningMode);
        _applySettings$scandit_barcode_capture();
    }

    public final void _applySettings$scandit_barcode_capture() {
        SparkScanInternal.a(this._sparkScanInternal, this.sparkScanSettings);
    }

    public final void _disable$scandit_barcode_capture() {
        if (this._sparkScanInternal.isEnabled()) {
            this._sparkScanInternal.setEnabled(false);
            DataCaptureContext dataCaptureContext = this.dataCaptureContext;
            if (dataCaptureContext != null) {
                dataCaptureContext.removeMode(this._sparkScanInternal);
            }
        }
    }

    public final void _enable$scandit_barcode_capture() {
        if (this._sparkScanInternal.isEnabled()) {
            return;
        }
        DataCaptureContext dataCaptureContext = this.dataCaptureContext;
        if (dataCaptureContext != null) {
            dataCaptureContext.addMode(this._sparkScanInternal);
        }
        this._sparkScanInternal.setEnabled(true);
    }

    public final void _removeEnableDisableListener$scandit_barcode_capture(@NotNull SparkScanEnableDisableListener listener) {
        Intrinsics.h(listener, "listener");
        this.e.remove(listener);
    }

    public final void _startManualFilterForLastScannedBarcodes$scandit_barcode_capture() {
        this._sparkScanInternal.a().getStateMachine().startManualFilterForLastScannedBarcodes();
    }

    public final void addListener(@NotNull SparkScanListener listener) {
        Intrinsics.h(listener, "listener");
        this.d.add(listener);
    }

    public final void applySettings(@NotNull SparkScanSettings settings) {
        Intrinsics.h(settings, "settings");
        this.sparkScanSettings = settings;
        SparkScanModeViewListener sparkScanModeViewListener = this._sparkScanModeViewListener;
        if (sparkScanModeViewListener == null) {
            _applySettings$scandit_barcode_capture();
        } else {
            sparkScanModeViewListener.onApplySettings(settings);
            _applyNewSettingsForScanningModeAndZoomLevel$scandit_barcode_capture(sparkScanModeViewListener.isZoomedIn(), sparkScanModeViewListener.getScanningMode());
        }
    }

    @Nullable
    /* renamed from: getDataCaptureContext$scandit_barcode_capture, reason: from getter */
    public final DataCaptureContext getDataCaptureContext() {
        return this.dataCaptureContext;
    }

    @NotNull
    public final SparkScanFeedback getFeedback() {
        return this.feedback;
    }

    @Nullable
    public final SparkScanLicenseInfo getSparkScanLicenseInfo() {
        return this._sparkScanInternal.c();
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: getSparkScanSettings$scandit_barcode_capture, reason: from getter */
    public final SparkScanSettings getSparkScanSettings() {
        return this.sparkScanSettings;
    }

    @NotNull
    /* renamed from: get_sparkScanInternal$scandit_barcode_capture, reason: from getter */
    public final SparkScanInternal get_sparkScanInternal() {
        return this._sparkScanInternal;
    }

    @Nullable
    /* renamed from: get_sparkScanModeViewListener$scandit_barcode_capture, reason: from getter */
    public final SparkScanModeViewListener get_sparkScanModeViewListener() {
        return this._sparkScanModeViewListener;
    }

    public final boolean isEnabled() {
        return this._sparkScanInternal.isEnabled();
    }

    public final void removeListener(@NotNull SparkScanListener listener) {
        Intrinsics.h(listener, "listener");
        this.d.remove(listener);
    }

    public final void setDataCaptureContext$scandit_barcode_capture(@Nullable DataCaptureContext dataCaptureContext) {
        if (Intrinsics.c(dataCaptureContext, this.dataCaptureContext)) {
            return;
        }
        DataCaptureContext dataCaptureContext2 = this.dataCaptureContext;
        if (dataCaptureContext2 != null) {
            dataCaptureContext2.removeMode(this._sparkScanInternal);
        }
        if (this._sparkScanInternal.isEnabled() && dataCaptureContext != null) {
            dataCaptureContext.addMode(this._sparkScanInternal);
        }
        this.dataCaptureContext = dataCaptureContext;
    }

    public final void setEnabled(boolean z) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((SparkScanEnableDisableListener) it.next()).onEnabledChange(z);
        }
    }

    public final void setFeedback(@NotNull SparkScanFeedback sparkScanFeedback) {
        Intrinsics.h(sparkScanFeedback, "<set-?>");
        this.feedback = sparkScanFeedback;
    }

    public final void setPropertyPushSource$scandit_barcode_capture(@Nullable NativePropertyPushSource propertyPushSource) {
        this._sparkScanInternal.a().setPropertyPushSource(propertyPushSource);
    }

    public final void setSingleScanModeEnabled$scandit_barcode_capture(boolean enabled) {
        this._sparkScanInternal.a(enabled);
    }

    public final void setSparkScanSettings$scandit_barcode_capture(@NotNull SparkScanSettings sparkScanSettings) {
        Intrinsics.h(sparkScanSettings, "<set-?>");
        this.sparkScanSettings = sparkScanSettings;
    }

    public final void set_sparkScanModeViewListener$scandit_barcode_capture(@Nullable SparkScanModeViewListener sparkScanModeViewListener) {
        this._sparkScanModeViewListener = sparkScanModeViewListener;
        if (sparkScanModeViewListener != null) {
            sparkScanModeViewListener.onApplySettings(this.sparkScanSettings);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparkScan(@NotNull SparkScanSettings settings) {
        this(AbstractC0851ta.a(settings), settings);
        Intrinsics.h(settings, "settings");
    }

    public SparkScan() {
        this(new SparkScanSettings());
    }
}
