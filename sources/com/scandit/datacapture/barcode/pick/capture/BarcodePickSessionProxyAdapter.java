package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSessionProxy;", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "", "getTrackedItems", "()Ljava/util/Set;", "trackedItems", "getAddedItems", "addedItems", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickPublicSession;", "_NativeBarcodePickPublicSession", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickPublicSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickSessionProxyAdapter implements BarcodePickSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickPublicSession f17897a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickSessionProxyAdapter(@NotNull NativeBarcodePickPublicSession _NativeBarcodePickPublicSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickPublicSession, "_NativeBarcodePickPublicSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17897a = _NativeBarcodePickPublicSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    @NotNull
    public Set<String> getAddedItems() {
        HashSet<String> _0 = this.f17897a.getAddedObjects();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickSessionProxy
    @NotNull
    public Set<String> getTrackedItems() {
        HashSet<String> _0 = this.f17897a.getTrackedObjects();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ BarcodePickSessionProxyAdapter(NativeBarcodePickPublicSession nativeBarcodePickPublicSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickPublicSession, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
