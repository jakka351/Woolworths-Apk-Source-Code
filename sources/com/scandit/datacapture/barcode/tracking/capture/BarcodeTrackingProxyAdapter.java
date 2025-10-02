package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingProxyAdapter;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingProxy;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTracking;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "", "identifier", "", "_activateState", "reset", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "isEnabled", "()Z", "setEnabled", "(Z)V", "_NativeBarcodeTracking", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTracking;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeTrackingProxyAdapter implements BarcodeTrackingProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeTracking f18153a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureMode c;

    public BarcodeTrackingProxyAdapter(@NotNull NativeBarcodeTracking _NativeBarcodeTracking, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeTracking, "_NativeBarcodeTracking");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18153a = _NativeBarcodeTracking;
        this.proxyCache = proxyCache;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeBarcodeTracking.asDataCaptureMode();
        Intrinsics.g(nativeDataCaptureModeAsDataCaptureMode, "_NativeBarcodeTracking.asDataCaptureMode()");
        this.c = nativeDataCaptureModeAsDataCaptureMode;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingProxy
    public void _activateState(@NotNull String identifier) {
        Intrinsics.h(identifier, "identifier");
        this.f18153a.activateState(identifier);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingProxy
    @NotNull
    /* renamed from: _dataCaptureModeImpl, reason: from getter */
    public NativeDataCaptureMode getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeTracking getF18153a() {
        return this.f18153a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingProxy
    public boolean isEnabled() {
        return this.f18153a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingProxy
    public void reset() {
        this.f18153a.clear();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingProxy
    public void setEnabled(boolean z) {
        this.f18153a.setEnabled(z);
    }

    public /* synthetic */ BarcodeTrackingProxyAdapter(NativeBarcodeTracking nativeBarcodeTracking, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeTracking, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
