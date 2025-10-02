package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningSessionProxy;", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "getPickedItems", "()Ljava/util/Set;", "pickedItems", "getScannedItems", "scannedItems", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickScanningSession;", "_NativeBarcodePickScanningSession", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickScanningSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickScanningSessionProxyAdapter implements BarcodePickScanningSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickScanningSession f17894a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickScanningSessionProxyAdapter(@NotNull NativeBarcodePickScanningSession _NativeBarcodePickScanningSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickScanningSession, "_NativeBarcodePickScanningSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17894a = _NativeBarcodePickScanningSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    @NotNull
    public Set<String> getPickedItems() {
        HashSet<String> _0 = this.f17894a.getPickedObjects();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    @NotNull
    public Set<String> getScannedItems() {
        HashSet<String> _0 = this.f17894a.getScannedObjects();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f17894a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodePickScanningSessionProxyAdapter(NativeBarcodePickScanningSession nativeBarcodePickScanningSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickScanningSession, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
