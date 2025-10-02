package com.scandit.datacapture.barcode.count.capture;

import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.L7;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureList;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListenerReversedAdapter;
import com.scandit.datacapture.barcode.count.feedback.BarcodeCountFeedback;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProvider;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.FeedbackExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0003pqrB\u0019\b\u0000\u0012\u0006\u0010l\u001a\u00020\u0005\u0012\u0006\u0010m\u001a\u00020%¢\u0006\u0004\bn\u0010oJ\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\f\u001a\u00020\u000bH\u0097\u0001J\t\u0010\r\u001a\u00020\tH\u0097\u0001J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u000f\u0010\u0018\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0019\u001a\u00020\tJ\u0006\u0010\u001a\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001fH\u0000¢\u0006\u0004\b#\u0010!J\u0006\u0010&\u001a\u00020%J\u0006\u0010'\u001a\u00020\tJ\u0006\u0010(\u001a\u00020\tJ\u0006\u0010)\u001a\u00020\tJ\u000e\u0010*\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000f\u0010-\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010,J\u000f\u00101\u001a\u00020.H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00106\u001a\u00020\t2\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\b4\u00105J\u0014\u0010:\u001a\u00020\t2\f\u00109\u001a\b\u0012\u0004\u0012\u00020807J\u0017\u0010?\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b=\u0010>R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u001f0@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR \u0010L\u001a\b\u0012\u0004\u0012\u00020I0@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010B\u001a\u0004\bK\u0010DR\u0018\u0010M\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010NR*\u0010W\u001a\u00020O2\u0006\u0010P\u001a\u00020O8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010_\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010a\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\ba\u0010,\"\u0004\bb\u0010cR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010,R\u0014\u0010k\u001a\u00020h8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006s"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountProxy;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "_impl", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "list", "", "_setBarcodeCountCaptureList", "", "_shouldDisableModeWhenCaptureListCompleted", "clearAdditionalBarcodes", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_setDataCaptureContext", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "settings", "Ljava/lang/Runnable;", "whenDone", "applySettings", "_getSettings$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "_getSettings", "startScanningPhase", "reset", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountListener;", "addInternalListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountListener;)V", "addInternalListener", "removeInternalListener$scandit_barcode_capture", "removeInternalListener", "Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountSession;", "_session", "endScanningPhase", "_stopImuDataStream", "_enableImuDataIfNeeded", "setBarcodeCountCaptureList", "isCaptureListSet$scandit_barcode_capture", "()Z", "isCaptureListSet", "", "getCaptureListTargetQuantity$scandit_barcode_capture", "()I", "getCaptureListTargetQuantity", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusListener;", "viewHandler", "_setStatusListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusListener;)V", "_setStatusListener", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "additionalBarcodes", "setAdditionalBarcodes", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProvider;", "statusProvider", "setInternalStatusProvider$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProvider;)V", "setInternalStatusProvider", "Ljava/util/concurrent/CopyOnWriteArrayList;", "e", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$scandit_barcode_capture", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "f", "getInternalListeners$scandit_barcode_capture", "internalListeners", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListListener;", "g", "getListListeners$scandit_barcode_capture", "listListeners", "captureList", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "value", "h", "Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "getFeedback", "()Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "setFeedback", "(Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;)V", "feedback", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountFeedbackChangeListener;", "i", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountFeedbackChangeListener;", "getFeedbackChangeListener$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountFeedbackChangeListener;", "setFeedbackChangeListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountFeedbackChangeListener;)V", "feedbackChangeListener", "<set-?>", "isEnabled", "setEnabled", "(Z)V", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getTriggerAutoFocusOnShutter$scandit_barcode_capture", "triggerAutoFocusOnShutter", "", "getTriggerAutoFocusDelay$scandit_barcode_capture", "()J", "triggerAutoFocusDelay", "impl", "session", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountSession;)V", "Companion", "com/scandit/datacapture/barcode/count/capture/f", "com/scandit/datacapture/barcode/count/capture/g", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeCount implements DataCaptureMode, BarcodeCountProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final InternalBarcodeCountSession f17468a;
    private final /* synthetic */ BarcodeCountProxyAdapter b;
    private DataCaptureContext c;

    @Keep
    @Nullable
    private BarcodeCountCaptureList captureList;
    private BarcodeCountSettings d;

    /* renamed from: e, reason: from kotlin metadata */
    private final CopyOnWriteArrayList listeners;

    /* renamed from: f, reason: from kotlin metadata */
    private final CopyOnWriteArrayList internalListeners;

    /* renamed from: g, reason: from kotlin metadata */
    private final CopyOnWriteArrayList listListeners;

    /* renamed from: h, reason: from kotlin metadata */
    private BarcodeCountFeedback feedback;

    /* renamed from: i, reason: from kotlin metadata */
    private BarcodeCountFeedbackChangeListener feedbackChangeListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount$Companion;", "", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "settings", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "forDataCaptureContext", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CameraSettings createRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.NONE);
            cameraSettings.setPreferredResolution(VideoResolution.UHD4K);
            cameraSettings.setZoomGestureZoomFactor(1.0f);
            cameraSettings.setProperty("closestResolutionTo12MPForFourToThreeAspectRatio", Boolean.TRUE);
            cameraSettings.setProperty("exposureTargetBias", -1);
            cameraSettings.setProperty("api", 2);
            cameraSettings.setProperty("focusStrategy", "forceContinuous");
            return cameraSettings;
        }

        @JvmStatic
        @NotNull
        public final BarcodeCount forDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeCountSettings settings) {
            Intrinsics.h(settings, "settings");
            BarcodeCount barcodeCount = new BarcodeCount(dataCaptureContext, settings, null);
            ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(BarcodeCount.class), null, barcodeCount, new b(barcodeCount));
            if (dataCaptureContext != null) {
                dataCaptureContext.addMode(barcodeCount);
            }
            return barcodeCount;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodeCount(DataCaptureContext dataCaptureContext, BarcodeCountSettings barcodeCountSettings, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContext, barcodeCountSettings);
    }

    private final void a(final BarcodeCountFeedback barcodeCountFeedback) {
        getF17472a().setSuccessFeedback(new NativeFeedback() { // from class: com.scandit.datacapture.barcode.count.capture.BarcodeCount$setNativeFeedback$1
            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void emit() {
                barcodeCountFeedback.emitSuccess$scandit_barcode_capture();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onFreeResources() {
                barcodeCountFeedback.getSuccess().release();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onLoadResources() {
                FeedbackExtensionsKt.loadSoundResource(barcodeCountFeedback.getSuccess());
            }
        });
        getF17472a().setUnrecognizedFeedback(new NativeFeedback() { // from class: com.scandit.datacapture.barcode.count.capture.BarcodeCount$setNativeFeedback$2
            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void emit() {
                barcodeCountFeedback.emitUnrecognized$scandit_barcode_capture();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onFreeResources() {
                barcodeCountFeedback.getUnrecognized().release();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onLoadResources() {
                FeedbackExtensionsKt.loadSoundResource(barcodeCountFeedback.getUnrecognized());
            }
        });
        getF17472a().setFailureFeedback(new NativeFeedback() { // from class: com.scandit.datacapture.barcode.count.capture.BarcodeCount$setNativeFeedback$3
            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void emit() {
                barcodeCountFeedback.emitFailure$scandit_barcode_capture();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onFreeResources() {
                barcodeCountFeedback.getFailure().release();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onLoadResources() {
                FeedbackExtensionsKt.loadSoundResource(barcodeCountFeedback.getFailure());
            }
        });
    }

    public static /* synthetic */ void applySettings$default(BarcodeCount barcodeCount, BarcodeCountSettings barcodeCountSettings, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        barcodeCount.applySettings(barcodeCountSettings, runnable);
    }

    @JvmStatic
    @NotNull
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCount forDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeCountSettings barcodeCountSettings) {
        return INSTANCE.forDataCaptureContext(dataCaptureContext, barcodeCountSettings);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureModeImpl */
    public NativeDataCaptureMode getC() {
        return this.b.getC();
    }

    public final void _enableImuDataIfNeeded() {
        DataCaptureContext dataCaptureContext;
        DataCaptureContext dataCaptureContext2 = this.c;
        if ((dataCaptureContext2 == null || dataCaptureContext2._isCameraTimestampsRealtime()) && (dataCaptureContext = this.c) != null) {
            Object property = this.d.getProperty(BarcodeCountSettings.PROPERTY_USE_IMU_DATA);
            Intrinsics.f(property, "null cannot be cast to non-null type kotlin.Boolean");
            dataCaptureContext._setShouldUseImuData(((Boolean) property).booleanValue());
        }
    }

    @NotNull
    /* renamed from: _getSettings$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountSettings getD() {
        return this.d;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCount getF17472a() {
        return this.b.getF17472a();
    }

    @NotNull
    /* renamed from: _session, reason: from getter */
    public final InternalBarcodeCountSession getF17468a() {
        return this.f17468a;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @ProxyFunction(nativeName = "setBarcodeCountCaptureList")
    public void _setBarcodeCountCaptureList(@NotNull BarcodeCountCaptureList list) {
        Intrinsics.h(list, "list");
        this.b._setBarcodeCountCaptureList(list);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public void _setDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext) {
        this.c = dataCaptureContext;
        _enableImuDataIfNeeded();
    }

    public final void _setStatusListener$scandit_barcode_capture(@NotNull NativeBarcodeCountStatusListener viewHandler) {
        Intrinsics.h(viewHandler, "viewHandler");
        getF17472a().setStatusListener(viewHandler);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @ProxyFunction(nativeName = "shouldDisableModeWhenCaptureListCompleted")
    public boolean _shouldDisableModeWhenCaptureListCompleted() {
        return this.b._shouldDisableModeWhenCaptureListCompleted();
    }

    public final void _stopImuDataStream() {
        DataCaptureContext c = getC();
        if (c != null) {
            c._setShouldUseImuData(false);
        }
    }

    public final void addInternalListener$scandit_barcode_capture(@NotNull InternalBarcodeCountListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.internalListeners.contains(listener)) {
            return;
        }
        this.internalListeners.add(listener);
        listener.onObservationStarted(this);
    }

    public final void addListener(@NotNull BarcodeCountListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
        listener.onObservationStarted(this);
    }

    @JvmOverloads
    public final void applySettings(@NotNull BarcodeCountSettings settings) {
        Intrinsics.h(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @ProxyFunction(nativeName = "clearAdditionalBarcodes")
    public void clearAdditionalBarcodes() {
        this.b.clearAdditionalBarcodes();
    }

    public final void endScanningPhase() {
        FrameSource frameSource;
        setEnabled(false);
        DataCaptureContext c = getC();
        if (c != null && (frameSource = c.get_frameSource()) != null) {
            FrameSource.DefaultImpls.switchToDesiredState$default(frameSource, FrameSourceState.OFF, null, 2, null);
        }
        _stopImuDataStream();
    }

    public final int getCaptureListTargetQuantity$scandit_barcode_capture() {
        BarcodeCountCaptureList barcodeCountCaptureList = this.captureList;
        if (barcodeCountCaptureList != null) {
            return barcodeCountCaptureList.getTargetBarcodesQuantity$scandit_barcode_capture();
        }
        return 0;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    @Nullable
    /* renamed from: getDataCaptureContext, reason: from getter */
    public DataCaptureContext getC() {
        return this.c;
    }

    @NotNull
    public final BarcodeCountFeedback getFeedback() {
        return this.feedback;
    }

    @Nullable
    /* renamed from: getFeedbackChangeListener$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountFeedbackChangeListener getFeedbackChangeListener() {
        return this.feedbackChangeListener;
    }

    @NotNull
    public final CopyOnWriteArrayList<InternalBarcodeCountListener> getInternalListeners$scandit_barcode_capture() {
        return this.internalListeners;
    }

    @NotNull
    public final CopyOnWriteArrayList<BarcodeCountCaptureListListener> getListListeners$scandit_barcode_capture() {
        return this.listListeners;
    }

    @NotNull
    public final CopyOnWriteArrayList<BarcodeCountListener> getListeners$scandit_barcode_capture() {
        return this.listeners;
    }

    public final long getTriggerAutoFocusDelay$scandit_barcode_capture() {
        BarcodeCountSettings barcodeCountSettings = this.d;
        Object property = barcodeCountSettings != null ? barcodeCountSettings.getProperty(BarcodeCountSettings.PROPERTY_TRIGGER_AUTO_FOCUS_DELAY) : null;
        Long l = property instanceof Long ? (Long) property : null;
        if (l != null) {
            return l.longValue();
        }
        return 100L;
    }

    public final boolean getTriggerAutoFocusOnShutter$scandit_barcode_capture() {
        BarcodeCountSettings barcodeCountSettings = this.d;
        Object property = barcodeCountSettings != null ? barcodeCountSettings.getProperty(BarcodeCountSettings.PROPERTY_TRIGGER_AUTO_FOCUS_ON_SHUTTER) : null;
        Boolean bool = property instanceof Boolean ? (Boolean) property : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean isCaptureListSet$scandit_barcode_capture() {
        return this.captureList != null;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.b.isEnabled();
    }

    public final void removeInternalListener$scandit_barcode_capture(@NotNull InternalBarcodeCountListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.internalListeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeListener(@NotNull BarcodeCountListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.listeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void reset() {
        getF17472a().reset();
    }

    public final void setAdditionalBarcodes(@NotNull List<Barcode> additionalBarcodes) {
        Intrinsics.h(additionalBarcodes, "additionalBarcodes");
        NativeBarcodeCount nativeBarcodeCount_impl = getF17472a();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(additionalBarcodes, 10));
        Iterator<T> it = additionalBarcodes.iterator();
        while (it.hasNext()) {
            arrayList.add(((Barcode) it.next()).getF17604a());
        }
        nativeBarcodeCount_impl.setAdditionalBarcodes(CollectionsExtensionsKt.toArrayList(arrayList));
    }

    public final void setBarcodeCountCaptureList(@NotNull BarcodeCountCaptureList list) {
        Intrinsics.h(list, "list");
        this.captureList = list;
        _setBarcodeCountCaptureList(list);
        list.getF17492a().addListenerAsync(new BarcodeCountCaptureListListenerReversedAdapter(new g(this), list, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    public final void setFeedback(@NotNull BarcodeCountFeedback value) {
        Intrinsics.h(value, "value");
        this.feedback = value;
        a(value);
        BarcodeCountFeedbackChangeListener barcodeCountFeedbackChangeListener = this.feedbackChangeListener;
        if (barcodeCountFeedbackChangeListener != null) {
            barcodeCountFeedbackChangeListener.feedbackChanged(value);
        }
    }

    public final void setFeedbackChangeListener$scandit_barcode_capture(@Nullable BarcodeCountFeedbackChangeListener barcodeCountFeedbackChangeListener) {
        this.feedbackChangeListener = barcodeCountFeedbackChangeListener;
    }

    public final void setInternalStatusProvider$scandit_barcode_capture(@NotNull NativeBarcodeCountStatusProvider statusProvider) {
        Intrinsics.h(statusProvider, "statusProvider");
        getF17472a().setStatusProvider(statusProvider);
    }

    public final void startScanningPhase() {
        getF17472a().activateState(BarcodeCountState.SCANNING);
    }

    public BarcodeCount(@NotNull NativeBarcodeCount impl, @NotNull InternalBarcodeCountSession session) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(session, "session");
        this.f17468a = session;
        this.b = new BarcodeCountProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.d = new BarcodeCountSettings();
        this.listeners = new CopyOnWriteArrayList();
        this.internalListeners = new CopyOnWriteArrayList();
        this.listListeners = new CopyOnWriteArrayList();
        impl.addListenerAsync(new L7(new f(this), this), 1);
        BarcodeCountFeedback barcodeCountFeedbackDefaultFeedback = BarcodeCountFeedback.INSTANCE.defaultFeedback();
        a(barcodeCountFeedbackDefaultFeedback);
        this.feedback = barcodeCountFeedbackDefaultFeedback;
    }

    @JvmOverloads
    public final void applySettings(@NotNull BarcodeCountSettings settings, @Nullable Runnable whenDone) {
        Intrinsics.h(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = getF17472a().applySettingsWrapped(settings._impl());
        Intrinsics.g(nativeWrappedFutureApplySettingsWrapped, "_impl().applySettingsWrapped(settings._impl())");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, whenDone);
        this.d = settings;
        _enableImuDataIfNeeded();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeCount(DataCaptureContext dataCaptureContext, BarcodeCountSettings barcodeCountSettings) {
        NativeBarcodeCount nativeBarcodeCountCreate = NativeBarcodeCount.create(dataCaptureContext != null ? dataCaptureContext.getF18429a() : null, barcodeCountSettings._impl());
        Intrinsics.g(nativeBarcodeCountCreate, "create(dataCaptureContex…impl(), settings._impl())");
        this(nativeBarcodeCountCreate);
        this.d = barcodeCountSettings;
        _enableImuDataIfNeeded();
    }

    private BarcodeCount(NativeBarcodeCount nativeBarcodeCount) {
        this(nativeBarcodeCount, new InternalBarcodeCountSession(new a(nativeBarcodeCount)));
        _enableImuDataIfNeeded();
    }
}
