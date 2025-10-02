package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u001f\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R(\u00100\u001a\u0004\u0018\u00010+2\b\u0010!\u001a\u0004\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "", TextBundle.TEXT_ENTRY, "", "setTextForUnscannedBarcodesDetectedHint", "getTextForUnscannedBarcodesDetectedHint", "setTextForBarcodesNotInListDetectedHint", "getTextForBarcodesNotInListDetectedHint", "setTextForTapShutterToScanHint", "getTextForTapShutterToScanHint", "setTextForScanningHint", "getTextForScanningHint", "setTextForMoveCloserAndRescanHint", "getTextForMoveCloserAndRescanHint", "setTextForMoveFurtherAndRescanHint", "getTextForMoveFurtherAndRescanHint", "setTextForTapToUncountHint", "getTextForTapToUncountHint", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "_setProfilingOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "c", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "filterSettings", "_NativeBarcodeCountBasicOverlay", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountBasicOverlayProxyAdapter implements BarcodeCountBasicOverlayProxy {
    private final NativeBarcodeCountBasicOverlay b;

    /* renamed from: c, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureOverlay d;

    public BarcodeCountBasicOverlayProxyAdapter(@NotNull NativeBarcodeCountBasicOverlay _NativeBarcodeCountBasicOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCountBasicOverlay, "_NativeBarcodeCountBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.b = _NativeBarcodeCountBasicOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeCountBasicOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeBarcodeCountBasic…ay.asDataCaptureOverlay()");
        this.d = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getC() {
        return this.d;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountBasicOverlay getB() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void _setProfilingOverlay(@NotNull ProfilingOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        NativeProfilingOverlay f18746a = overlay.getF18746a();
        this.proxyCache.put(Reflection.f24268a.b(NativeProfilingOverlay.class), null, f18746a, overlay);
        this.b.setProfilingOverlay(f18746a);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @Nullable
    public BarcodeFilterHighlightSettings getFilterSettings() {
        NativeBarcodeFilterOverlaySettings filterSettings = this.b.getFilterSettings();
        if (filterSettings != null) {
            return (BarcodeFilterHighlightSettings) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeFilterOverlaySettings.class), null, filterSettings, new s(filterSettings));
        }
        return null;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public boolean getShouldShowScanAreaGuides() {
        return this.b.shouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NotNull
    public NativeBarcodeCountBasicOverlayStyle getStyle() {
        NativeBarcodeCountBasicOverlayStyle _0 = this.b.getStyle();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NotNull
    public String getTextForBarcodesNotInListDetectedHint() {
        String _0 = this.b.getTextForWrongBarcodesDetectedHint();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NotNull
    public String getTextForMoveCloserAndRescanHint() {
        String _0 = this.b.getTextForMoveCloserAndRescanHint();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NotNull
    public String getTextForMoveFurtherAndRescanHint() {
        String _0 = this.b.getTextForMoveFurtherAndRescanHint();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NotNull
    public String getTextForScanningHint() {
        String _0 = this.b.getTextForScanningHint();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NotNull
    public String getTextForTapShutterToScanHint() {
        String _0 = this.b.getTextForTapShutterToScanHint();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NotNull
    public String getTextForTapToUncountHint() {
        String _0 = this.b.getTextForTapToUncountHint();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NotNull
    public String getTextForUnscannedBarcodesDetectedHint() {
        String _0 = this.b.getTextForUnscannedBarcodesDetectedHint();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setFilterSettings(@Nullable BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings = null;
        if (barcodeFilterHighlightSettings != null) {
            NativeBarcodeFilterOverlaySettings f17651a = barcodeFilterHighlightSettings.getF17651a();
            this.proxyCache.put(Reflection.f24268a.b(NativeBarcodeFilterOverlaySettings.class), null, f17651a, barcodeFilterHighlightSettings);
            nativeBarcodeFilterOverlaySettings = f17651a;
        }
        this.b.setFilterSettings(nativeBarcodeFilterOverlaySettings);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForBarcodesNotInListDetectedHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForWrongBarcodesDetectedHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForMoveCloserAndRescanHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForMoveCloserAndRescanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForMoveFurtherAndRescanHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForMoveFurtherAndRescanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForScanningHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForScanningHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForTapShutterToScanHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForTapShutterToScanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForTapToUncountHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForTapToUncountHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForUnscannedBarcodesDetectedHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForUnscannedBarcodesDetectedHint(text);
    }

    public /* synthetic */ BarcodeCountBasicOverlayProxyAdapter(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountBasicOverlay, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
