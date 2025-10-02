package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionCallback;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionCallbackProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionCallbackProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickActionCallback;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeBarcodePickActionCallback", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickActionCallback;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickActionCallbackProxyAdapter implements BarcodePickActionCallbackProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickActionCallback f17889a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickActionCallbackProxyAdapter(@NotNull NativeBarcodePickActionCallback _NativeBarcodePickActionCallback, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickActionCallback, "_NativeBarcodePickActionCallback");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17889a = _NativeBarcodePickActionCallback;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickActionCallbackProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickActionCallback getF17889a() {
        return this.f17889a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodePickActionCallbackProxyAdapter(NativeBarcodePickActionCallback nativeBarcodePickActionCallback, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickActionCallback, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
