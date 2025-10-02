package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionProxyAdapter;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "", "selectUnselectedBarcodes", "unfreezeCamera", "freezeCamera", "selectAimedBarcode", "", "json", "", "enabled", "setSelectBarcodeEnabledFromJsonString", "unselectBarcodesFromJsonString", "increaseCountForBarcodesFromJsonString", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "p0", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getPointOfInterest", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setPointOfInterest", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "pointOfInterest", "_NativeBarcodeSelection", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionProxyAdapter implements BarcodeSelectionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSelection f18028a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureMode c;

    public BarcodeSelectionProxyAdapter(@NotNull NativeBarcodeSelection _NativeBarcodeSelection, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeSelection, "_NativeBarcodeSelection");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18028a = _NativeBarcodeSelection;
        this.proxyCache = proxyCache;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeBarcodeSelection.asDataCaptureMode();
        Intrinsics.g(nativeDataCaptureModeAsDataCaptureMode, "_NativeBarcodeSelection.asDataCaptureMode()");
        this.c = nativeDataCaptureModeAsDataCaptureMode;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @NotNull
    /* renamed from: _dataCaptureModeImpl, reason: from getter */
    public NativeDataCaptureMode getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeSelection getF18028a() {
        return this.f18028a;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public void freezeCamera() {
        this.f18028a.freezeCamera();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @Nullable
    public PointWithUnit getPointOfInterest() {
        return this.f18028a.getPointOfInterest();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public void increaseCountForBarcodesFromJsonString(@NotNull String json) {
        Intrinsics.h(json, "json");
        this.f18028a.increaseCountForBarcodesFromJsonString(json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public boolean isEnabled() {
        return this.f18028a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public void selectAimedBarcode() {
        this.f18028a.selectAimedBarcode();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public void selectUnselectedBarcodes() {
        this.f18028a.selectAllUnselectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public void setEnabled(boolean z) {
        this.f18028a.setEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public void setPointOfInterest(@Nullable PointWithUnit pointWithUnit) {
        this.f18028a.setPointOfInterest(pointWithUnit);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public void setSelectBarcodeEnabledFromJsonString(@NotNull String json, boolean enabled) {
        Intrinsics.h(json, "json");
        this.f18028a.setSelectBarcodeEnabledFromJsonString(json, enabled);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public void unfreezeCamera() {
        this.f18028a.unfreezeCamera();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    public void unselectBarcodesFromJsonString(@NotNull String json) {
        Intrinsics.h(json, "json");
        this.f18028a.unselectBarcodesFromJsonString(json);
    }

    public /* synthetic */ BarcodeSelectionProxyAdapter(NativeBarcodeSelection nativeBarcodeSelection, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeSelection, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
