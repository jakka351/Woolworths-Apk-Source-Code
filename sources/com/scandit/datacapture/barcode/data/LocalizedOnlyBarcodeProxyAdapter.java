package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcodeProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcodeProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeLocalizedOnlyBarcode;", "_impl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "location", "", "getFrameId", "()I", "frameId", "_NativeLocalizedOnlyBarcode", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeLocalizedOnlyBarcode;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class LocalizedOnlyBarcodeProxyAdapter implements LocalizedOnlyBarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeLocalizedOnlyBarcode f17612a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public LocalizedOnlyBarcodeProxyAdapter(@NotNull NativeLocalizedOnlyBarcode _NativeLocalizedOnlyBarcode, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeLocalizedOnlyBarcode, "_NativeLocalizedOnlyBarcode");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17612a = _NativeLocalizedOnlyBarcode;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.LocalizedOnlyBarcodeProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeLocalizedOnlyBarcode getF17612a() {
        return this.f17612a;
    }

    @Override // com.scandit.datacapture.barcode.data.LocalizedOnlyBarcodeProxy
    public int getFrameId() {
        return this.f17612a.getFrameId();
    }

    @Override // com.scandit.datacapture.barcode.data.LocalizedOnlyBarcodeProxy
    @NotNull
    public Quadrilateral getLocation() {
        Quadrilateral _0 = this.f17612a.getLocation();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.LocalizedOnlyBarcodeProxy
    @NotNull
    public String toJson() {
        String _0 = this.f17612a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ LocalizedOnlyBarcodeProxyAdapter(NativeLocalizedOnlyBarcode nativeLocalizedOnlyBarcode, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeLocalizedOnlyBarcode, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
