package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusItem;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItemProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItemProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusItem;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeBarcodeCountStatusItem", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusItem;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountStatusItemProxyAdapter implements BarcodeCountStatusItemProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountStatusItem f17583a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCountStatusItemProxyAdapter(@NotNull NativeBarcodeCountStatusItem _NativeBarcodeCountStatusItem, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeCountStatusItem, "_NativeBarcodeCountStatusItem");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17583a = _NativeBarcodeCountStatusItem;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusItemProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountStatusItem getF17583a() {
        return this.f17583a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodeCountStatusItemProxyAdapter(NativeBarcodeCountStatusItem nativeBarcodeCountStatusItem, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountStatusItem, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
