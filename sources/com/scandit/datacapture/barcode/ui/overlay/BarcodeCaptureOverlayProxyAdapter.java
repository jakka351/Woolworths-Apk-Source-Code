package com.scandit.datacapture.barcode.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayProxyAdapter;", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayProxy;", "Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "c", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/ui/style/Brush;", "p0", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "brush", "", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "style", "_NativeBarcodeCaptureOverlay", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureOverlayProxyAdapter implements BarcodeCaptureOverlayProxy {
    private final NativeBarcodeCaptureOverlay b;

    /* renamed from: c, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureOverlay d;

    public BarcodeCaptureOverlayProxyAdapter(@NotNull NativeBarcodeCaptureOverlay _NativeBarcodeCaptureOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCaptureOverlay, "_NativeBarcodeCaptureOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.b = _NativeBarcodeCaptureOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeCaptureOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeBarcodeCaptureOve…ay.asDataCaptureOverlay()");
        this.d = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getD() {
        return this.d;
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCaptureOverlay getB() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @NotNull
    public Brush getBrush() {
        NativeBrush _0 = this.b.getBrushForRecognizedBarcodes();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    public boolean getShouldShowScanAreaGuides() {
        return this.b.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @NotNull
    public BarcodeCaptureOverlayStyle getStyle() {
        NativeBarcodeCaptureOverlayStyle _0 = this.b.getStyle();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return barcodeNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    public void setBrush(@NotNull Brush p0) {
        Intrinsics.h(p0, "p0");
        this.b.setBrushForRecognizedBarcodes(CoreNativeTypeFactory.INSTANCE.convert(p0));
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    public void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    public /* synthetic */ BarcodeCaptureOverlayProxyAdapter(NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCaptureOverlay, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
