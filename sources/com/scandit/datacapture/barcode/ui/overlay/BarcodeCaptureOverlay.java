package com.scandit.datacapture.barcode.ui.overlay;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.barcode.capture.BarcodeCapture;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializer;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.OverlayPreconditionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0011\b\u0000\u0012\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007R.\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;", "_impl", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "", "setProperty", "getProperty", "jsonData", "updateFromJson", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "d", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "getViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "setViewfinder", "(Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;)V", "viewfinder", "Lcom/scandit/datacapture/core/ui/style/Brush;", "<set-?>", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "brush", "", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "style", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeCaptureOverlay implements DataCaptureOverlay, BarcodeCaptureOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Brush DEFAULT_BRUSH;
    private final /* synthetic */ BarcodeCaptureOverlayProxyAdapter b;
    private final HashMap c;

    /* renamed from: d, reason: from kotlin metadata */
    private Viewfinder viewfinder;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay$Companion;", "", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "newInstance", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "style", "", "jsonData", "fromJson", "Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultBrush", "DEFAULT_BRUSH", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getDEFAULT_BRUSH$annotations", "()V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        public static /* synthetic */ void getDEFAULT_BRUSH$annotations() {
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final Brush defaultBrush() {
            return BarcodeCaptureOverlay.DEFAULT_BRUSH;
        }

        @JvmStatic
        @NotNull
        public final BarcodeCaptureOverlay fromJson(@NotNull BarcodeCapture mode, @NotNull String jsonData) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeCaptureDeserializer().overlayFromJson(mode, jsonData);
        }

        @JvmStatic
        @NotNull
        public final BarcodeCaptureOverlay newInstance(@NotNull BarcodeCapture mode, @Nullable DataCaptureView view) {
            Intrinsics.h(mode, "mode");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, a.f18228a);
            BarcodeCaptureOverlay barcodeCaptureOverlay = new BarcodeCaptureOverlay(mode, (DefaultConstructorMarker) null);
            if (view != null) {
                view.addOverlay(barcodeCaptureOverlay);
            }
            return barcodeCaptureOverlay;
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Brush defaultBrush(@NotNull BarcodeCaptureOverlayStyle style) {
            Intrinsics.h(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultBrushForStyle = NativeBarcodeCaptureOverlay.getDefaultBrushForStyle(BarcodeCaptureOverlayStyleKt.toNative(style));
            Intrinsics.g(defaultBrushForStyle, "getDefaultBrushForStyle(style.toNative())");
            return BrushExtensionsKt.of(companion, defaultBrushForStyle);
        }

        @JvmStatic
        @NotNull
        public final BarcodeCaptureOverlay newInstance(@NotNull BarcodeCapture mode, @Nullable DataCaptureView view, @NotNull BarcodeCaptureOverlayStyle style) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(style, "style");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, b.f18229a);
            BarcodeCaptureOverlay barcodeCaptureOverlay = new BarcodeCaptureOverlay(mode, style, null);
            if (view != null) {
                view.addOverlay(barcodeCaptureOverlay);
            }
            return barcodeCaptureOverlay;
        }
    }

    static {
        Brush.Companion companion = Brush.INSTANCE;
        NativeBrush nativeBrushDefaultBrushForRecognizedBarcodes = NativeBarcodeCaptureOverlay.defaultBrushForRecognizedBarcodes();
        Intrinsics.g(nativeBrushDefaultBrushForRecognizedBarcodes, "defaultBrushForRecognizedBarcodes()");
        DEFAULT_BRUSH = BrushExtensionsKt.of(companion, nativeBrushDefaultBrushForRecognizedBarcodes);
    }

    public /* synthetic */ BarcodeCaptureOverlay(BarcodeCapture barcodeCapture, BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCapture, barcodeCaptureOverlayStyle);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final Brush defaultBrush() {
        return INSTANCE.defaultBrush();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCaptureOverlay fromJson(@NotNull BarcodeCapture barcodeCapture, @NotNull String str) {
        return INSTANCE.fromJson(barcodeCapture, str);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCaptureOverlay newInstance(@NotNull BarcodeCapture barcodeCapture, @Nullable DataCaptureView dataCaptureView) {
        return INSTANCE.newInstance(barcodeCapture, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getD() {
        return this.b.getD();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCaptureOverlay getB() {
        return this.b.getB();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(nativeName = "getBrushForRecognizedBarcodes", property = "brush")
    @NotNull
    public Brush getBrush() {
        return this.b.getBrush();
    }

    @Nullable
    public final Object getProperty(@NotNull String name) {
        Intrinsics.h(name, "name");
        return this.c.get(name);
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public boolean getShouldShowScanAreaGuides() {
        return this.b.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(property = "style")
    @NotNull
    public BarcodeCaptureOverlayStyle getStyle() {
        return this.b.getStyle();
    }

    @Nullable
    public final Viewfinder getViewfinder() {
        return this.viewfinder;
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(nativeName = "setBrushForRecognizedBarcodes", property = "brush")
    public void setBrush(@NotNull Brush brush) {
        Intrinsics.h(brush, "<set-?>");
        this.b.setBrush(brush);
    }

    public final void setProperty(@NotNull String name, @Nullable Object value) {
        NativeBrush nativeBrushConvert;
        Intrinsics.h(name, "name");
        this.c.put(name, value);
        if (name.equals("localizedOnlyBarcodeBrush")) {
            if (value == null) {
                nativeBrushConvert = NativeBarcodeCaptureOverlay.defaultBrushForLocalizedOnlyBarcodes();
                Intrinsics.g(nativeBrushConvert, "{\n                    Na…codes()\n                }");
            } else {
                nativeBrushConvert = CoreNativeTypeFactory.INSTANCE.convert((Brush) value);
            }
            getB().setBrushForLocalizedOnlyBarcodes(nativeBrushConvert);
            getB().setShouldDrawLocalizedOnlyBarcodes(true);
        }
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    public final void setViewfinder(@Nullable Viewfinder viewfinder) {
        this.viewfinder = viewfinder;
        getB().setViewfinder(viewfinder != null ? viewfinder.getC() : null);
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeCaptureDeserializer().updateOverlayFromJson(this, jsonData);
    }

    public /* synthetic */ BarcodeCaptureOverlay(BarcodeCapture barcodeCapture, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCapture);
    }

    @JvmStatic
    @NotNull
    public static final Brush defaultBrush(@NotNull BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle) {
        return INSTANCE.defaultBrush(barcodeCaptureOverlayStyle);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCaptureOverlay newInstance(@NotNull BarcodeCapture barcodeCapture, @Nullable DataCaptureView dataCaptureView, @NotNull BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle) {
        return INSTANCE.newInstance(barcodeCapture, dataCaptureView, barcodeCaptureOverlayStyle);
    }

    public BarcodeCaptureOverlay(@NotNull NativeBarcodeCaptureOverlay impl) {
        Intrinsics.h(impl, "impl");
        this.b = new BarcodeCaptureOverlayProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.c = new HashMap();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeCaptureOverlay(BarcodeCapture barcodeCapture) {
        NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlayCreateWithDefaultStyle = NativeBarcodeCaptureOverlay.createWithDefaultStyle(barcodeCapture.getF17413a());
        Intrinsics.g(nativeBarcodeCaptureOverlayCreateWithDefaultStyle, "createWithDefaultStyle(barcodeCapture._impl())");
        this(nativeBarcodeCaptureOverlayCreateWithDefaultStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeCaptureOverlay(BarcodeCapture barcodeCapture, BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle) {
        NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlayCreate = NativeBarcodeCaptureOverlay.create(barcodeCapture.getF17413a(), BarcodeCaptureOverlayStyleKt.toNative(barcodeCaptureOverlayStyle));
        Intrinsics.g(nativeBarcodeCaptureOverlayCreate, "create(barcodeCapture._impl(), style.toNative())");
        this(nativeBarcodeCaptureOverlayCreate);
    }
}
