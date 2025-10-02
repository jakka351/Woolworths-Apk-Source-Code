package com.scandit.datacapture.barcode.find.capture;

import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindProxyAdapter;", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindProxy;", "Lcom/scandit/datacapture/barcode/internal/module/find/capture/NativeBarcodeFind;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "", "start", "pause", "stop", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "isEnabled", "()Z", "setEnabled", "(Z)V", "_NativeBarcodeFind", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/find/capture/NativeBarcodeFind;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeFindProxyAdapter implements BarcodeFindProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeFind f17661a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureMode c;

    public BarcodeFindProxyAdapter(@NotNull NativeBarcodeFind _NativeBarcodeFind, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeFind, "_NativeBarcodeFind");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17661a = _NativeBarcodeFind;
        this.proxyCache = proxyCache;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeBarcodeFind.asDataCaptureMode();
        Intrinsics.g(nativeDataCaptureModeAsDataCaptureMode, "_NativeBarcodeFind.asDataCaptureMode()");
        this.c = nativeDataCaptureModeAsDataCaptureMode;
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    @NotNull
    /* renamed from: _dataCaptureModeImpl, reason: from getter */
    public NativeDataCaptureMode getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeFind getF17661a() {
        return this.f17661a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    public boolean isEnabled() {
        return this.f17661a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    public void pause() {
        this.f17661a.pauseAsync();
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    public void setEnabled(boolean z) {
        this.f17661a.setEnabled(z);
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    public void start() {
        this.f17661a.startAsync();
    }

    @Override // com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy
    public void stop() {
        this.f17661a.stopAsync();
    }

    public /* synthetic */ BarcodeFindProxyAdapter(NativeBarcodeFind nativeBarcodeFind, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFind, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
