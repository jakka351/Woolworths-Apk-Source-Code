package com.scandit.datacapture.barcode.pick.capture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.C0517a5;
import com.scandit.datacapture.barcode.F3;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.extensions.FeedbackExtensionsKt;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.VideoResolution;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Z2\u00020\u0001:\u0002Z[B\u0011\b\u0000\u0012\u0006\u0010P\u001a\u00020H¢\u0006\u0004\bQ\u0010RB\u0011\b\u0010\u0012\u0006\u0010S\u001a\u00020D¢\u0006\u0004\bQ\u0010TB!\b\u0016\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bQ\u0010YJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000eJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020&H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020&H\u0000¢\u0006\u0004\b*\u0010(J\u0017\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b1\u0010/J\u0017\u00106\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u000203H\u0000¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u000203H\u0000¢\u0006\u0004\b7\u00105J)\u0010?\u001a\u00020\u00042\u0006\u0010:\u001a\u0002092\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010C\u001a\u00020@H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010G\u001a\u00020DH\u0000¢\u0006\u0004\bE\u0010FJ\u000f\u0010K\u001a\u00020HH\u0000¢\u0006\u0004\bI\u0010JR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u0002030L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006\\"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "", "", "data", "", "confirmActionForItemWithData", "cancelActionForItemWithData", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSelectItemActionCallback;", "callback", "selectItemWithData", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addScanningListener", "removeScanningListener", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickListener;", "addListener", "removeListener", "_start$scandit_barcode_capture", "()V", "_start", "_pause$scandit_barcode_capture", "_pause", "_stop$scandit_barcode_capture", "_stop", "_freeze$scandit_barcode_capture", "_freeze", "_reset$scandit_barcode_capture", "_reset", "", "statusShownWhilePaused", "_notifyStatusShownWhilePausedUpdated$scandit_barcode_capture", "(Z)V", "_notifyStatusShownWhilePausedUpdated", "Lcom/scandit/datacapture/barcode/internal/module/tracking/capture/TrackedObject;", "track", "_onTrackedObjectTap$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/tracking/capture/TrackedObject;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSelectItemActionCallback;)V", "_onTrackedObjectTap", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickListener;", "_addListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickListener;)V", "_addListener", "_removeListener$scandit_barcode_capture", "_removeListener", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionListener;", "actionListener", "_addActionListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionListener;)V", "_addActionListener", "_removeActionListener$scandit_barcode_capture", "_removeActionListener", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickStatusListenerInternal;", "_addStatusListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickStatusListenerInternal;)V", "_addStatusListener", "_removeStatusListener$scandit_barcode_capture", "_removeStatusListener", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "settings", "Lkotlin/Function0;", "whenDone", "_applySettings$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;Lkotlin/jvm/functions/Function0;)V", "_applySettings", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "_asDataCaptureMode$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "_asDataCaptureMode", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "_impl$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;", "_asBarcodePickInternal$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;", "_asBarcodePickInternal", "", "get_statusListeners$scandit_barcode_capture", "()Ljava/util/Collection;", "_statusListeners", "barcodePickInternal", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;)V", "impl", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;)V", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "productProvider", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;)V", "Companion", "com/scandit/datacapture/barcode/pick/capture/a", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodePick {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickInternal f17886a;
    private final CopyOnWriteArraySet b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick$Companion;", "", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "", "KEY_EXPOSURE_TARGET_BIAS", "Ljava/lang/String;", "KEY_FOCUS_STRATEGY", "KEY_SCAN_PHASE_NO_SRE_TIMEOUT", "VALUE_CONTINUOUS_UNTIL_NO_SCAN", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CameraSettings createRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setPreferredResolution(VideoResolution.UHD4K);
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.NONE);
            cameraSettings.setZoomGestureZoomFactor(2.0f);
            cameraSettings.setProperty("focusStrategy", "continuousUntilNoScan");
            cameraSettings.setProperty("scanPhaseNoSreTimeout", Float.valueOf(3.0f));
            cameraSettings.setProperty("exposureTargetBias", Float.valueOf(-1.0f));
            return cameraSettings;
        }

        private Companion() {
        }
    }

    public BarcodePick(@NotNull BarcodePickInternal barcodePickInternal) {
        Intrinsics.h(barcodePickInternal, "barcodePickInternal");
        this.f17886a = barcodePickInternal;
        this.b = new CopyOnWriteArraySet();
        barcodePickInternal.a(this);
        _impl$scandit_barcode_capture().addStatusListenerAsync(new C0517a5(new a(this), this));
    }

    public static /* synthetic */ void _applySettings$scandit_barcode_capture$default(BarcodePick barcodePick, BarcodePickSettings barcodePickSettings, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        barcodePick._applySettings$scandit_barcode_capture(barcodePickSettings, function0);
    }

    public static /* synthetic */ void _onTrackedObjectTap$scandit_barcode_capture$default(BarcodePick barcodePick, TrackedObject trackedObject, BarcodePickSelectItemActionCallback barcodePickSelectItemActionCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            barcodePickSelectItemActionCallback = null;
        }
        barcodePick._onTrackedObjectTap$scandit_barcode_capture(trackedObject, barcodePickSelectItemActionCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 function0) {
        function0.invoke();
    }

    @JvmStatic
    @NotNull
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    public final /* synthetic */ void _addActionListener$scandit_barcode_capture(BarcodePickActionListener actionListener) {
        Intrinsics.h(actionListener, "actionListener");
        this.f17886a.a(actionListener);
    }

    public final /* synthetic */ void _addListener$scandit_barcode_capture(com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener listener) {
        Intrinsics.h(listener, "listener");
        this.f17886a.a(listener);
    }

    public final /* synthetic */ void _addStatusListener$scandit_barcode_capture(BarcodePickStatusListenerInternal listener) {
        Intrinsics.h(listener, "listener");
        if (this.b.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final /* synthetic */ void _applySettings$scandit_barcode_capture(BarcodePickSettings settings, Function0 whenDone) {
        Intrinsics.h(settings, "settings");
        this.f17886a.a(settings, whenDone != null ? new androidx.compose.ui.viewinterop.a(6, whenDone) : null);
    }

    /* renamed from: _asBarcodePickInternal$scandit_barcode_capture, reason: from getter */
    public final /* synthetic */ BarcodePickInternal getF17886a() {
        return this.f17886a;
    }

    public final /* synthetic */ DataCaptureMode _asDataCaptureMode$scandit_barcode_capture() {
        return this.f17886a;
    }

    public final /* synthetic */ void _freeze$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().freezeAsync();
    }

    public final /* synthetic */ NativeBarcodePick _impl$scandit_barcode_capture() {
        return this.f17886a.a();
    }

    public final /* synthetic */ void _notifyStatusShownWhilePausedUpdated$scandit_barcode_capture(boolean statusShownWhilePaused) {
        _impl$scandit_barcode_capture().notifyStatusShownWhilePausedUpdatedAsync(statusShownWhilePaused);
    }

    public final /* synthetic */ void _onTrackedObjectTap$scandit_barcode_capture(TrackedObject track, BarcodePickSelectItemActionCallback callback) {
        Intrinsics.h(track, "track");
        this.f17886a.a(track, callback);
    }

    public final /* synthetic */ void _pause$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().pauseAsync();
    }

    public final /* synthetic */ void _removeActionListener$scandit_barcode_capture(BarcodePickActionListener actionListener) {
        Intrinsics.h(actionListener, "actionListener");
        this.f17886a.b(actionListener);
    }

    public final /* synthetic */ void _removeListener$scandit_barcode_capture(com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener listener) {
        Intrinsics.h(listener, "listener");
        this.f17886a.b(listener);
    }

    public final /* synthetic */ void _removeStatusListener$scandit_barcode_capture(BarcodePickStatusListenerInternal listener) {
        Intrinsics.h(listener, "listener");
        if (this.b.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final /* synthetic */ void _reset$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().reset();
    }

    public final /* synthetic */ void _start$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().startAsync();
    }

    public final /* synthetic */ void _stop$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().stopAsync();
    }

    public final void addListener(@NotNull BarcodePickListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.f17886a.a(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final void addScanningListener(@NotNull BarcodePickScanningListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.f17886a.a(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final void cancelActionForItemWithData(@NotNull String data) {
        Intrinsics.h(data, "data");
        this.f17886a.a(data, false);
    }

    public final void confirmActionForItemWithData(@NotNull String data) {
        Intrinsics.h(data, "data");
        this.f17886a.a(data, true);
    }

    public final /* synthetic */ Collection get_statusListeners$scandit_barcode_capture() {
        return this.b;
    }

    public final void removeListener(@NotNull BarcodePickListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.f17886a.b(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeScanningListener(@NotNull BarcodePickScanningListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.f17886a.b(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void selectItemWithData(@NotNull String data, @Nullable BarcodePickSelectItemActionCallback callback) {
        Object next;
        Intrinsics.h(data, "data");
        Iterator it = this.f17886a.d().h().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.c(((TrackedObject) next).b(), data)) {
                    break;
                }
            }
        }
        TrackedObject trackedObject = (TrackedObject) next;
        if (trackedObject == null) {
            return;
        }
        _onTrackedObjectTap$scandit_barcode_capture(trackedObject, callback);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarcodePick(@NotNull NativeBarcodePick impl) {
        this(new BarcodePickInternal(impl));
        Intrinsics.h(impl, "impl");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePick(@NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodePickSettings settings, @NotNull BarcodePickProductProvider productProvider) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(productProvider, "productProvider");
        NativeBarcodePick nativeBarcodePickCreate = NativeBarcodePick.create(dataCaptureContext._impl(), settings._impl(), productProvider._productProviderImpl());
        nativeBarcodePickCreate.setToPickCodeScannedFeedback(FeedbackExtensionsKt.toNativeFeedback(F3.b(settings.getSoundEnabled(), settings.getHapticsEnabled())));
        nativeBarcodePickCreate.setCodePickedFeedback(FeedbackExtensionsKt.toNativeFeedback(F3.a(settings.getSoundEnabled(), settings.getHapticsEnabled())));
        this(nativeBarcodePickCreate);
    }
}
