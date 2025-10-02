package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoMarker;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/data/ArucoMarkerProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/ArucoMarkerProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeArucoMarker;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "getSize", "()I", "size", "", "getData", "()[B", "data", "_NativeArucoMarker", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeArucoMarker;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ArucoMarkerProxyAdapter implements ArucoMarkerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeArucoMarker f17602a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public ArucoMarkerProxyAdapter(@NotNull NativeArucoMarker _NativeArucoMarker, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeArucoMarker, "_NativeArucoMarker");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17602a = _NativeArucoMarker;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.ArucoMarkerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeArucoMarker getF17602a() {
        return this.f17602a;
    }

    @Override // com.scandit.datacapture.barcode.data.ArucoMarkerProxy
    @NotNull
    public byte[] getData() {
        byte[] _0 = this.f17602a.getBits();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.ArucoMarkerProxy
    public int getSize() {
        return this.f17602a.getSize();
    }

    public /* synthetic */ ArucoMarkerProxyAdapter(NativeArucoMarker nativeArucoMarker, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeArucoMarker, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
