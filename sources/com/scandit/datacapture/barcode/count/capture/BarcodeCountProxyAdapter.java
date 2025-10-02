package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureList;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "list", "", "_setBarcodeCountCaptureList", "clearAdditionalBarcodes", "", "_shouldDisableModeWhenCaptureListCompleted", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "p0", "isEnabled", "()Z", "setEnabled", "(Z)V", "_NativeBarcodeCount", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountProxyAdapter implements BarcodeCountProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCount f17472a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureMode c;

    public BarcodeCountProxyAdapter(@NotNull NativeBarcodeCount _NativeBarcodeCount, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCount, "_NativeBarcodeCount");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17472a = _NativeBarcodeCount;
        this.proxyCache = proxyCache;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeBarcodeCount.asDataCaptureMode();
        Intrinsics.g(nativeDataCaptureModeAsDataCaptureMode, "_NativeBarcodeCount.asDataCaptureMode()");
        this.c = nativeDataCaptureModeAsDataCaptureMode;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @NotNull
    /* renamed from: _dataCaptureModeImpl, reason: from getter */
    public NativeDataCaptureMode getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCount getF17472a() {
        return this.f17472a;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    public void _setBarcodeCountCaptureList(@NotNull BarcodeCountCaptureList list) {
        Intrinsics.h(list, "list");
        NativeBarcodeCountCaptureList f17492a = list.getF17492a();
        this.proxyCache.put(Reflection.f24268a.b(NativeBarcodeCountCaptureList.class), null, f17492a, list);
        this.f17472a.setBarcodeCountCaptureList(f17492a);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    public boolean _shouldDisableModeWhenCaptureListCompleted() {
        return this.f17472a.shouldDisableModeWhenCaptureListCompleted();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    public void clearAdditionalBarcodes() {
        this.f17472a.clearAdditionalBarcodes();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    public boolean isEnabled() {
        return this.f17472a.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    public void setEnabled(boolean z) {
        this.f17472a.setEnabled(z);
    }

    public /* synthetic */ BarcodeCountProxyAdapter(NativeBarcodeCount nativeBarcodeCount, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCount, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
