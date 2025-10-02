package com.scandit.datacapture.barcode.tracking.ui.overlay;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.barcode.tracking.capture.BarcodeTracking;
import com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializer;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.OverlayPreconditionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u000289B\u0011\b\u0000\u0012\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\b6\u00107J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u000b\u001a\u00020\tH\u0097\u0001J\u001b\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0097\u0001J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0011R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u000e8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010+\u001a\u00020&2\u0006\u0010!\u001a\u00020&8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R.\u00104\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b2\u00103\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%¨\u0006:"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "", "_setProfilingOverlay", "clearTrackedBarcodeBrushes", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "trackedBarcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "setBrushForTrackedBarcode", "", "jsonData", "updateFromJson", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "setProperty", "getProperty", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayListener;", "d", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayListener;", "getListener", "()Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayListener;", "setListener", "(Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<set-?>", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayStyle;", "style", "getDefaultBrush", "setDefaultBrush", "getDefaultBrush$annotations", "()V", "defaultBrush", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;)V", "Companion", "com/scandit/datacapture/barcode/tracking/ui/overlay/c", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeTrackingBasicOverlay implements DataCaptureOverlay, BarcodeTrackingBasicOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Brush DEFAULT_BRUSH;
    private final /* synthetic */ BarcodeTrackingBasicOverlayProxyAdapter b;
    private final HashMap c;

    /* renamed from: d, reason: from kotlin metadata */
    private BarcodeTrackingBasicOverlayListener listener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay$Companion;", "", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultBrush", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;", "newInstance", "", "jsonData", "fromJson", "DEFAULT_BRUSH", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getDEFAULT_BRUSH$annotations", "()V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        public static /* synthetic */ void getDEFAULT_BRUSH$annotations() {
        }

        @JvmStatic
        @NotNull
        public final Brush defaultBrush(@NotNull BarcodeTrackingBasicOverlayStyle style) {
            Intrinsics.h(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultBrushForStyle = NativeBarcodeTrackingBasicOverlay.getDefaultBrushForStyle(BarcodeTrackingBasicOverlayStyleKt.toNative(style));
            Intrinsics.g(defaultBrushForStyle, "getDefaultBrushForStyle(style.toNative())");
            return BrushExtensionsKt.of(companion, defaultBrushForStyle);
        }

        @JvmStatic
        @NotNull
        public final BarcodeTrackingBasicOverlay fromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeTrackingDeserializer().basicOverlayFromJson(mode, jsonData);
        }

        @JvmStatic
        @NotNull
        public final BarcodeTrackingBasicOverlay newInstance(@NotNull BarcodeTracking mode, @Nullable DataCaptureView view) {
            Intrinsics.h(mode, "mode");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, a.f18207a);
            BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay = new BarcodeTrackingBasicOverlay(mode, (DefaultConstructorMarker) null);
            if (view != null) {
                view.addOverlay(barcodeTrackingBasicOverlay);
            }
            return barcodeTrackingBasicOverlay;
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final BarcodeTrackingBasicOverlay newInstance(@NotNull BarcodeTracking mode, @Nullable DataCaptureView view, @NotNull BarcodeTrackingBasicOverlayStyle style) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(style, "style");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, b.f18208a);
            BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay = new BarcodeTrackingBasicOverlay(mode, style, null);
            if (view != null) {
                view.addOverlay(barcodeTrackingBasicOverlay);
            }
            return barcodeTrackingBasicOverlay;
        }
    }

    static {
        Brush.Companion companion = Brush.INSTANCE;
        NativeBrush nativeBrushDefaultBrush = NativeBarcodeTrackingBasicOverlay.defaultBrush();
        Intrinsics.g(nativeBrushDefaultBrush, "defaultBrush()");
        DEFAULT_BRUSH = BrushExtensionsKt.of(companion, nativeBrushDefaultBrush);
    }

    public /* synthetic */ BarcodeTrackingBasicOverlay(BarcodeTracking barcodeTracking, BarcodeTrackingBasicOverlayStyle barcodeTrackingBasicOverlayStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeTracking, barcodeTrackingBasicOverlayStyle);
    }

    @JvmStatic
    @NotNull
    public static final Brush defaultBrush(@NotNull BarcodeTrackingBasicOverlayStyle barcodeTrackingBasicOverlayStyle) {
        return INSTANCE.defaultBrush(barcodeTrackingBasicOverlayStyle);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeTrackingBasicOverlay fromJson(@NotNull BarcodeTracking barcodeTracking, @NotNull String str) {
        return INSTANCE.fromJson(barcodeTracking, str);
    }

    @Deprecated
    public static /* synthetic */ void getDefaultBrush$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final BarcodeTrackingBasicOverlay newInstance(@NotNull BarcodeTracking barcodeTracking, @Nullable DataCaptureView dataCaptureView) {
        return INSTANCE.newInstance(barcodeTracking, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getD() {
        return this.b.getD();
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeTrackingBasicOverlay getB() {
        return this.b.getB();
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @ProxyFunction(nativeName = "setProfilingOverlay")
    public void _setProfilingOverlay(@NotNull ProfilingOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        this.b._setProfilingOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @ProxyFunction
    public void clearTrackedBarcodeBrushes() {
        this.b.clearTrackedBarcodeBrushes();
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @ProxyFunction(nativeName = "getDefaultBrush", property = "brush")
    @Nullable
    public Brush getBrush() {
        return this.b.getBrush();
    }

    @Nullable
    public final Brush getDefaultBrush() {
        return getBrush();
    }

    @Nullable
    public final BarcodeTrackingBasicOverlayListener getListener() {
        return this.listener;
    }

    @Nullable
    public final Object getProperty(@NotNull String name) {
        Intrinsics.h(name, "name");
        Object obj = this.c.get(name);
        if (obj != null) {
            return obj;
        }
        try {
            return Boolean.valueOf(getB().getBoolProperty(name));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public boolean getShouldShowScanAreaGuides() {
        return this.b.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @ProxyFunction(property = "style")
    @NotNull
    public BarcodeTrackingBasicOverlayStyle getStyle() {
        return this.b.getStyle();
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @ProxyFunction(nativeName = "setDefaultBrush", property = "brush")
    public void setBrush(@Nullable Brush brush) {
        this.b.setBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @ProxyFunction(nativeName = "setTrackedBarcodeBrush")
    public void setBrushForTrackedBarcode(@NotNull TrackedBarcode trackedBarcode, @Nullable Brush brush) {
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        this.b.setBrushForTrackedBarcode(trackedBarcode, brush);
    }

    public final void setDefaultBrush(@Nullable Brush brush) {
        setBrush(brush);
    }

    public final void setListener(@Nullable BarcodeTrackingBasicOverlayListener barcodeTrackingBasicOverlayListener) {
        this.listener = barcodeTrackingBasicOverlayListener;
    }

    public final void setProperty(@NotNull String name, @Nullable Object value) {
        Intrinsics.h(name, "name");
        this.c.put(name, value);
        if (value instanceof Boolean) {
            getB().setBoolProperty(name, ((Boolean) value).booleanValue());
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeTrackingDeserializer().updateBasicOverlayFromJson(this, jsonData);
    }

    public /* synthetic */ BarcodeTrackingBasicOverlay(BarcodeTracking barcodeTracking, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeTracking);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeTrackingBasicOverlay newInstance(@NotNull BarcodeTracking barcodeTracking, @Nullable DataCaptureView dataCaptureView, @NotNull BarcodeTrackingBasicOverlayStyle barcodeTrackingBasicOverlayStyle) {
        return INSTANCE.newInstance(barcodeTracking, dataCaptureView, barcodeTrackingBasicOverlayStyle);
    }

    public BarcodeTrackingBasicOverlay(@NotNull NativeBarcodeTrackingBasicOverlay impl) {
        Intrinsics.h(impl, "impl");
        this.b = new BarcodeTrackingBasicOverlayProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.c = new HashMap();
        impl.setListener(new BarcodeTrackingBasicOverlayListenerReversedAdapter(new c(this), this, null, 4, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeTrackingBasicOverlay(BarcodeTracking barcodeTracking) {
        NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlayCreateWithDefaultStyle = NativeBarcodeTrackingBasicOverlay.createWithDefaultStyle(barcodeTracking._impl());
        Intrinsics.g(nativeBarcodeTrackingBasicOverlayCreateWithDefaultStyle, "createWithDefaultStyle(mode._impl())");
        this(nativeBarcodeTrackingBasicOverlayCreateWithDefaultStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeTrackingBasicOverlay(BarcodeTracking barcodeTracking, BarcodeTrackingBasicOverlayStyle barcodeTrackingBasicOverlayStyle) {
        NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlayCreate = NativeBarcodeTrackingBasicOverlay.create(barcodeTracking._impl(), BarcodeTrackingBasicOverlayStyleKt.toNative(barcodeTrackingBasicOverlayStyle));
        Intrinsics.g(nativeBarcodeTrackingBasicOverlayCreate, "create(mode._impl(), style.toNative())");
        this(nativeBarcodeTrackingBasicOverlayCreate);
    }
}
