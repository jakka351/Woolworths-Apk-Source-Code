package com.scandit.datacapture.barcode.tracking.ui.overlay;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayProxyAdapter;", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayProxy;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "trackedBarcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "", "setBrushForTrackedBarcode", "clearTrackedBarcodeBrushes", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "_setProfilingOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "c", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "p0", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayStyle;", "style", "_NativeBarcodeTrackingBasicOverlay", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeTrackingBasicOverlayProxyAdapter implements BarcodeTrackingBasicOverlayProxy {
    private final NativeBarcodeTrackingBasicOverlay b;

    /* renamed from: c, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureOverlay d;

    public BarcodeTrackingBasicOverlayProxyAdapter(@NotNull NativeBarcodeTrackingBasicOverlay _NativeBarcodeTrackingBasicOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeTrackingBasicOverlay, "_NativeBarcodeTrackingBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.b = _NativeBarcodeTrackingBasicOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeTrackingBasicOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeBarcodeTrackingBa…ay.asDataCaptureOverlay()");
        this.d = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getD() {
        return this.d;
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeTrackingBasicOverlay getB() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    public void _setProfilingOverlay(@NotNull ProfilingOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        NativeProfilingOverlay f18746a = overlay.getF18746a();
        this.proxyCache.put(Reflection.f24268a.b(NativeProfilingOverlay.class), null, f18746a, overlay);
        this.b.setProfilingOverlay(f18746a);
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    public void clearTrackedBarcodeBrushes() {
        this.b.clearTrackedBarcodeBrushes();
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @Nullable
    public Brush getBrush() {
        NativeBrush defaultBrush = this.b.getDefaultBrush();
        if (defaultBrush != null) {
            return CoreNativeTypeFactory.INSTANCE.convert(defaultBrush);
        }
        return null;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    public boolean getShouldShowScanAreaGuides() {
        return this.b.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    @NotNull
    public BarcodeTrackingBasicOverlayStyle getStyle() {
        NativeBarcodeTrackingBasicOverlayStyle _0 = this.b.getStyle();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    public void setBrush(@Nullable Brush brush) {
        this.b.setDefaultBrush(brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null);
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    public void setBrushForTrackedBarcode(@NotNull TrackedBarcode trackedBarcode, @Nullable Brush brush) {
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        NativeTrackedBarcode f18191a = trackedBarcode.getF18191a();
        this.proxyCache.put(Reflection.f24268a.b(NativeTrackedBarcode.class), null, f18191a, trackedBarcode);
        this.b.setTrackedBarcodeBrush(f18191a, brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null);
    }

    @Override // com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlayProxy
    public void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    public /* synthetic */ BarcodeTrackingBasicOverlayProxyAdapter(NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeTrackingBasicOverlay, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
