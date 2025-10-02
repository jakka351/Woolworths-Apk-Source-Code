package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureProxyAdapter;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureProxy;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getPointOfInterest", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setPointOfInterest", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "pointOfInterest", "_NativeBarcodeCapture", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureProxyAdapter implements BarcodeCaptureProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCapture f17413a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureMode c;

    public BarcodeCaptureProxyAdapter(@NotNull NativeBarcodeCapture _NativeBarcodeCapture, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCapture, "_NativeBarcodeCapture");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17413a = _NativeBarcodeCapture;
        this.proxyCache = proxyCache;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeBarcodeCapture.asDataCaptureMode();
        Intrinsics.g(nativeDataCaptureModeAsDataCaptureMode, "_NativeBarcodeCapture.asDataCaptureMode()");
        this.c = nativeDataCaptureModeAsDataCaptureMode;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @NotNull
    /* renamed from: _dataCaptureModeImpl, reason: from getter */
    public NativeDataCaptureMode getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCapture getF17413a() {
        return this.f17413a;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @Nullable
    public PointWithUnit getPointOfInterest() {
        return this.f17413a.getPointOfInterest();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    public boolean isEnabled() {
        return this.f17413a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    public void setEnabled(boolean z) {
        this.f17413a.setEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    public void setPointOfInterest(@Nullable PointWithUnit pointWithUnit) {
        this.f17413a.setPointOfInterest(pointWithUnit);
    }

    public /* synthetic */ BarcodeCaptureProxyAdapter(NativeBarcodeCapture nativeBarcodeCapture, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCapture, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
