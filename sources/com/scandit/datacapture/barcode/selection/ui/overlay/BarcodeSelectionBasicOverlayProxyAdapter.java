package com.scandit.datacapture.barcode.selection.ui.overlay;

import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
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
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR$\u0010'\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR$\u0010-\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020(8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00100\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020(8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R$\u0010:\u001a\u0002052\u0006\u0010\u0019\u001a\u0002058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "", "clearSelectedBarcodeBrushes", "", TextBundle.TEXT_ENTRY, "setTextForSelectOrDoubleTapToFreezeHint", "setTextForTapToSelectHint", "setTextForDoubleTapToUnfreezeHint", "setTextForTapAnywhereToSelectHint", "setTextForAimToSelectAutoHint", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "_setProfilingOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "c", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/ui/style/Brush;", "p0", "getTrackedBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setTrackedBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "trackedBrush", "getAimedBrush", "setAimedBrush", "aimedBrush", "getSelectingBrush", "setSelectingBrush", "selectingBrush", "getSelectedBrush", "setSelectedBrush", "selectedBrush", "", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "getShouldShowHints", "setShouldShowHints", "shouldShowHints", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "style", "", "getFrozenBackgroundColor", "()I", "setFrozenBackgroundColor", "(I)V", "frozenBackgroundColor", "_NativeBarcodeSelectionBasicOverlay", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionBasicOverlayProxyAdapter implements BarcodeSelectionBasicOverlayProxy {
    private final NativeBarcodeSelectionBasicOverlay b;

    /* renamed from: c, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureOverlay d;

    public BarcodeSelectionBasicOverlayProxyAdapter(@NotNull NativeBarcodeSelectionBasicOverlay _NativeBarcodeSelectionBasicOverlay, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeSelectionBasicOverlay, "_NativeBarcodeSelectionBasicOverlay");
        Intrinsics.h(proxyCache, "proxyCache");
        this.b = _NativeBarcodeSelectionBasicOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeSelectionBasicOverlay.asDataCaptureOverlay();
        Intrinsics.g(nativeDataCaptureOverlayAsDataCaptureOverlay, "_NativeBarcodeSelectionB…ay.asDataCaptureOverlay()");
        this.d = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay
    @NotNull
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getC() {
        return this.d;
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeSelectionBasicOverlay getB() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void _setProfilingOverlay(@NotNull ProfilingOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        NativeProfilingOverlay f18746a = overlay.getF18746a();
        this.proxyCache.put(Reflection.f24268a.b(NativeProfilingOverlay.class), null, f18746a, overlay);
        this.b.setProfilingOverlay(f18746a);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void clearSelectedBarcodeBrushes() {
        this.b.clearSelectedBarcodeBrushes();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @NotNull
    public Brush getAimedBrush() {
        NativeBrush _0 = this.b.getAimedBrush();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public int getFrozenBackgroundColor() {
        NativeColor _0 = this.b.getFreezeOverlayColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @NotNull
    public Brush getSelectedBrush() {
        NativeBrush _0 = this.b.getSelectedBrush();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @NotNull
    public Brush getSelectingBrush() {
        NativeBrush _0 = this.b.getSelectingBrush();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public boolean getShouldShowHints() {
        return this.b.getShowHints();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public boolean getShouldShowScanAreaGuides() {
        return this.b.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @NotNull
    public BarcodeSelectionBasicOverlayStyle getStyle() {
        BarcodeSelectionBasicOverlayStyle _0 = this.b.getStyle();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @NotNull
    public Brush getTrackedBrush() {
        NativeBrush _0 = this.b.getTrackedBrush();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setAimedBrush(@NotNull Brush p0) {
        Intrinsics.h(p0, "p0");
        this.b.setAimedBrush(CoreNativeTypeFactory.INSTANCE.convert(p0));
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setFrozenBackgroundColor(int i) {
        this.b.setFreezeOverlayColor(CoreNativeTypeFactory.INSTANCE.convert(i));
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setSelectedBrush(@NotNull Brush p0) {
        Intrinsics.h(p0, "p0");
        this.b.setSelectedBrush(CoreNativeTypeFactory.INSTANCE.convert(p0));
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setSelectingBrush(@NotNull Brush p0) {
        Intrinsics.h(p0, "p0");
        this.b.setSelectingBrush(CoreNativeTypeFactory.INSTANCE.convert(p0));
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setShouldShowHints(boolean z) {
        this.b.setShowHints(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setShouldShowScanAreaGuides(boolean z) {
        this.b.setShouldShowScanAreaGuides(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setTextForAimToSelectAutoHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForAimToSelectAutoHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setTextForDoubleTapToUnfreezeHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForDoubleTapToUnfreezeHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setTextForSelectOrDoubleTapToFreezeHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForSelectOrDoubleTapToFreezeHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setTextForTapAnywhereToSelectHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForTapAnywhereToSelectHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setTextForTapToSelectHint(@NotNull String text) {
        Intrinsics.h(text, "text");
        this.b.setTextForTapToSelectHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    public void setTrackedBrush(@NotNull Brush p0) {
        Intrinsics.h(p0, "p0");
        this.b.setTrackedBrush(CoreNativeTypeFactory.INSTANCE.convert(p0));
    }

    public /* synthetic */ BarcodeSelectionBasicOverlayProxyAdapter(NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlay, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeSelectionBasicOverlay, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
