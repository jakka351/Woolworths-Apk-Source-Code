package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProviderCallback;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusResult;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProviderCallbackProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProviderCallbackProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;", "_impl", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResult;", "statusResult", "", "onStatusReady", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeBarcodeCountStatusProviderCallback", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountStatusProviderCallbackProxyAdapter implements BarcodeCountStatusProviderCallbackProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountStatusProviderCallback f17585a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCountStatusProviderCallbackProxyAdapter(@NotNull NativeBarcodeCountStatusProviderCallback _NativeBarcodeCountStatusProviderCallback, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCountStatusProviderCallback, "_NativeBarcodeCountStatusProviderCallback");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17585a = _NativeBarcodeCountStatusProviderCallback;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusProviderCallbackProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountStatusProviderCallback getF17585a() {
        return this.f17585a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusProviderCallbackProxy
    public void onStatusReady(@NotNull BarcodeCountStatusResult statusResult) {
        Intrinsics.h(statusResult, "statusResult");
        NativeBarcodeCountStatusResult f17587a = statusResult.getF17587a();
        this.proxyCache.put(Reflection.f24268a.b(NativeBarcodeCountStatusResult.class), null, f17587a, statusResult);
        this.f17585a.onStatusReady(f17587a);
    }

    public /* synthetic */ BarcodeCountStatusProviderCallbackProxyAdapter(NativeBarcodeCountStatusProviderCallback nativeBarcodeCountStatusProviderCallback, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountStatusProviderCallback, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
